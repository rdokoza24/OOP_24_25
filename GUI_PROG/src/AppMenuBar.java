import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMenuBar extends JMenuBar implements ActionListener {
    private JMenu fileMenu;

    private JMenu helpMenu;

    private JMenuItem openFromFile;
    private JMenuItem saveToFile;
    private JMenuItem exitApp;
    private MenuBarListener menuBarListener;

    public AppMenuBar() {
        initComps();
        activateMenuBar();
    }

    public void setMenuBarListener(MenuBarListener menuBarListener) {
        this.menuBarListener = menuBarListener;
    }

    private void activateMenuBar() {

        openFromFile.addActionListener(this);
        openFromFile.setActionCommand("open");
        saveToFile.addActionListener(this);
        saveToFile.setActionCommand("save");
        exitApp.addActionListener(this);
        exitApp.setActionCommand("exit");
    }

    private void initComps(){

        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");

        openFromFile = new JMenuItem("Open From File");
        saveToFile = new JMenuItem("Save To File");

        exitApp = new JMenuItem("Exit");

        fileMenu.add(openFromFile);
        fileMenu.add(saveToFile);
        fileMenu.addSeparator();
        fileMenu.add(exitApp);

        add(fileMenu);
        add(helpMenu);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        String itemActionCommand = ae.getActionCommand();

        if(menuBarListener != null) {
            menuBarListener.menuBarEventOccurred(itemActionCommand);
        }
    }
}
