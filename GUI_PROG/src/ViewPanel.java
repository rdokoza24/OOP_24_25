import javax.swing.*;
import java.awt.*;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane textAreaScroll;

    public ViewPanel() {

        initComps();
        layoutComps();
    }

    private void initComps() {

        textArea = new JTextArea();
        textArea.setEditable(false);
        textAreaScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(textAreaScroll, BorderLayout.CENTER);
    }

    public void addTextToTextArea(String text) {
        textArea.append(text + "\n");
    }
}
