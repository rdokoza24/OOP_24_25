import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton clearText;
    private JButton packAllText;
    private ToolBarListener toolBarListener;

    public ToolBar() {
        initComps();
        layoutComps();
        activateToolBar();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {

        clearText = new JButton("Clear text!");
        packAllText = new JButton("Pack all text!");
        clearText.addActionListener(this);
        packAllText.addActionListener(this);
        clearText.setActionCommand("clear");
        packAllText.setActionCommand("pack");
    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clearText);
        add(packAllText);
    }

    private void activateToolBar() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (toolBarListener != null) {
            toolBarListener.toolbarEventOccurred(e.getActionCommand());
        } else {
            JOptionPane.showMessageDialog(ToolBar.this, "ToolBar listener is not defined", "Error listener", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
