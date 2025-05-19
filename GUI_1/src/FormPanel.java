import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPanel extends JPanel {

    private JButton submitButton;
    private JTextField inputField;
    private FormPanelListener formPanelListener;

    public FormPanel() {
        initComps();
        layoutComps();
        activateFormPanel();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void initComps() {
        submitButton = new JButton("Submit text");
        submitButton.setToolTipText("Press this to submit text...");
        inputField = new JTextField(20);
        inputField.setToolTipText("Enter text here...");
        inputField.setBorder(BorderFactory.createTitledBorder("Input data"));
    }

    private void layoutComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;

        gbc.weighty = 0.5;
        gbc.weightx = 0.5;

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(inputField, gbc);

        gbc.gridx = 1;
        add(submitButton, gbc);
    }

    private void resetFormPanel(){
        inputField.setText("");
        inputField.requestFocus();
    }

    private void activateFormPanel() {

        submitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("This is a test message");
                if (formPanelListener != null) {
                    formPanelListener.formPanelEventOccurred(inputField.getText());
                } else {
                    JOptionPane.showMessageDialog(FormPanel.this, "This is null listener case!", "Erorr Listener", JOptionPane.ERROR_MESSAGE);
                }
                resetFormPanel();
            }
        });
    }
}