import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane textAreaScrollPane;


    public ViewPanel() {
        initComps();
        layoutComps();
    }

    private void initComps() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        textAreaScrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(textAreaScrollPane, BorderLayout.CENTER);
    }

    public void addTextToTextArea(String inputText) {

        textArea.append(inputText + "\n");
    }

    public void clearViewPanel() {
        textArea.setText(null);
        textArea.requestFocus();
    }

    public void addPackContentToTextArea(ArrayList<String> texts) {
        addTextToTextArea("========= Pack =========");
        for(String text : texts){
            addTextToTextArea(text);
        }
    }
}
