import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private FormPanel formPanel;
    private ViewPanel viewPanel;
    private ArrayList<Programmer> programmers;
    private AppMenuBar appMenuBar;
    private JFileChooser fileChooser;


    public MainFrame() {

        super("Programmers GUI");
        programmers = new ArrayList<>();
        initMainFrame();
        initComponents();
        layoutComps();
        activateFrame();

    }

    private void initMainFrame() {

        setSize(650, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void initComponents() {

        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        appMenuBar = new AppMenuBar();
        setJMenuBar(appMenuBar);
        fileChooser = new JFileChooser("GUI_PROG/src");
        tuneFileChooser();
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
    }

    private void activateFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred(Programmer programmer){
                viewPanel.addTextToTextArea(programmer.toString());
                addProgrammer(programmer);
            }
        });

        appMenuBar.setMenuBarListener(new MenuBarListener() {
            @Override
            public void menuBarEventOccurred(String itemActionCommand) {
                if(itemActionCommand.equals("exit")) {
                    System.exit(0);
                }
                if(itemActionCommand.equals("open")) {
                    int val = fileChooser.showOpenDialog(MainFrame.this);
                    if(val == JFileChooser.APPROVE_OPTION) {
                        System.out.println("Selected file is: " + fileChooser.getSelectedFile());
                    } else {
                        JOptionPane.showMessageDialog(MainFrame.this, "User canceled data load!", "File open info", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if(itemActionCommand.equals("save")) {
                    int val = fileChooser.showSaveDialog(MainFrame.this);
                    if(val == JFileChooser.APPROVE_OPTION) {
                        String filePath = fileChooser.getSelectedFile().getPath();
                        AUX_CLS.saveProgrammersInFile(filePath, programmers);
                        JOptionPane.showMessageDialog(MainFrame.this, "User saved data!", "File save info", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(MainFrame.this, "User canceled data save!", "File save info", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    private void addProgrammer(Programmer programmer) {
        if (!programmers.contains(programmer)) {
            programmers.add(programmer);
            JOptionPane.showMessageDialog(MainFrame.this, "Programmer added!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(MainFrame.this, "Programmer already exists!", "Information", JOptionPane.WARNING_MESSAGE);

        }
    }

    private void tuneFileChooser() {

        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Text Files", "txt");
        FileNameExtensionFilter filter2 = new FileNameExtensionFilter("Bin Files", "bin");
        fileChooser.addChoosableFileFilter(filter1);
        fileChooser.addChoosableFileFilter(filter2);
        fileChooser.setFileFilter(filter1);
    }
}
