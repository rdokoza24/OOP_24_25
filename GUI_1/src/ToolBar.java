import javax.swing.*;
import javax.tools.Tool;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton clearText;
    private JButton packAllText;
    private JButton toBin;
    private JButton loadBinText;
    private ToolBarListener toolBarListener;

    public ToolBar() {
        initComps();
        layoutComps();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {

        clearText = new JButton("Clear text!");
        packAllText = new JButton("Pack all text!");
        toBin = new JButton("Save to bin file!");
        loadBinText = new JButton("Load bin file!");
        clearText.addActionListener(this);
        packAllText.addActionListener(this);
        toBin.addActionListener(this);
        loadBinText.addActionListener(this);
        clearText.setActionCommand("clear");
        packAllText.setActionCommand("pack");
        toBin.setActionCommand("saveb");
        loadBinText.setActionCommand("loadb");
    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clearText);
        add(packAllText);
        add(toBin);
        add(loadBinText);
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
