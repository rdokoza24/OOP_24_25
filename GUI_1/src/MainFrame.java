import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private FormPanel formPanel;
    private ToolBar toolBar;
    private ArrayList<String> textViewPanel;
    private String filePath = "viewPanelData.txt";

    public MainFrame() {
        super("Simple GUI App");
        initMainFrame();
        initComponents();
        layoutComps();
        activateMainFrame();
    }

    private void initMainFrame() {
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        viewPanel = new ViewPanel();
        formPanel = new FormPanel();
        toolBar = new ToolBar();
        textViewPanel = new ArrayList<>();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void activateMainFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {

            @Override
            public void formPanelEventOccurred(String inputText) {
//                System.out.println("This is input field text: " + inputText);
                viewPanel.addTextToTextArea(inputText);
                textViewPanel.add(inputText);
            }
        });

        toolBar.setToolBarListener(new ToolBarListener() {

            @Override
            public void toolbarEventOccurred(String textArea) {
                if (textArea == "clear"){
                    viewPanel.clearViewPanel();
                }
                if (textArea == "pack"){
                    viewPanel.clearViewPanel();
                    viewPanel.addPackContentToTextArea(textViewPanel);
                }
                if (textArea == "saveb"){
                    AUX_CLS.saveToBinFile(textViewPanel, filePath);
                    JOptionPane.showMessageDialog(MainFrame.this, "Saved to bin file","Succes", JOptionPane.INFORMATION_MESSAGE);
                    }
                if (textArea == "loadb"){
                    textViewPanel = AUX_CLS.loadFromBinFile(filePath);
                    viewPanel.clearViewPanel();
                    viewPanel.addPackContentToTextArea(textViewPanel);
                }
            }
        });
    }
}
