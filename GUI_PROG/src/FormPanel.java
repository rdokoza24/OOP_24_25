import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormPanel extends JPanel {

    private JTextField nameField;
    private JTextField emailField;
    private JCheckBox day1CheckBox;
    private JCheckBox day2CheckBox;
    private JCheckBox day3CheckBox;


    private JRadioButton fullTimeRadio;
    private JRadioButton halfTimeRadio;

    private ButtonGroup radioButtonGroup;

    private JList<String> experienceList;
    private JComboBox<String> programmingInCombo;
    private JScrollPane listScrollPane;

    private JButton submitButton;
    private FormPanelListener formPanelListener;

    public FormPanel() {

        initFormPanel();
        initComps();
        layoutComps();
        activateForm();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void initFormPanel() {

        Dimension dims = getPreferredSize();
        dims.height = 330;
        setPreferredSize(dims);
        Border inner = BorderFactory.createTitledBorder("Programmer");
        Border outter = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border border = BorderFactory.createCompoundBorder(outter, inner);
        setBorder(border);
    }

    private void initComps() {

        nameField = new JTextField(10);
        emailField = new JTextField(10);
        day1CheckBox = new JCheckBox("Moonday");
        day2CheckBox = new JCheckBox("Twosday");
        day3CheckBox = new JCheckBox("Freeday");
        fullTimeRadio = new JRadioButton("Full time");
        fullTimeRadio.setSelected(true);
        halfTimeRadio = new JRadioButton("Half time");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(fullTimeRadio);
        radioButtonGroup.add(halfTimeRadio);
        experienceList = new JList<>();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.add(0,"Less than two");
        listModel.add(1,"Between two and four");
        listModel.add(2,"More than four");
        listModel.add(3,"No XP");
        experienceList.setModel(listModel);
        experienceList.setBorder(BorderFactory.createEtchedBorder());
        experienceList.setVisibleRowCount(3);
        listScrollPane = new JScrollPane(experienceList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        programmingInCombo = new JComboBox<>();
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        comboModel.addElement("piton");
        comboModel.addElement("javica");
        comboModel.addElement("c oštro");
        comboModel.addElement("java skripta");
        comboModel.addElement("c dva plusa");
        programmingInCombo.setModel(comboModel);
        programmingInCombo.setSelectedIndex(-1);

        submitButton = new JButton("Submit");


    }

    private void layoutComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Name: "), gbc);

        gbc.gridx+=1;
        gbc.insets = new Insets(5, 10, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Email: "), gbc);
        gbc.gridx += 1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(5, 10, 5, 5);
        add(emailField, gbc);

        gbc.gridy = 0;
        gbc.gridx += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Experience: "), gbc);
        gbc.gridy += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(listScrollPane, gbc);

        gbc.gridy = 0;
        gbc.gridx += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;
        add(new JLabel("Programming in: "), gbc);

        gbc.gridy += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(programmingInCombo, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(day1CheckBox, gbc);
        gbc.gridy += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(day2CheckBox, gbc);
        gbc.gridy += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(day3CheckBox, gbc);

        gbc.gridx += 1;
        gbc.gridy = 4;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(fullTimeRadio, gbc);
        gbc.gridy += 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(halfTimeRadio, gbc);

        gbc.gridx += 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);



    }

    private void activateForm() {

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String experience = experienceList.getSelectedValue();
                String programmingIn = programmingInCombo.getSelectedItem().toString();
                ArrayList<String> days = getSelectedDays();
                boolean fullTime = fullTimeRadio.isSelected();

                Programmer programmer = new Programmer(name, email, programmingIn, experience, days, fullTime);
                System.out.println(programmer);

                if(formPanelListener != null){
                    formPanelListener.formPanelEventOccurred(programmer);
                }


            }
        });
    }

    private ArrayList<String> getSelectedDays() {
        ArrayList<String> days = new ArrayList<>();
        if(day1CheckBox.isSelected()) {
            days.add(day1CheckBox.getText());
        }
        if(day2CheckBox.isSelected()) {
            days.add(day2CheckBox.getText());
        }
        if(day3CheckBox.isSelected()) {
            days.add(day3CheckBox.getText());
        }
        return days;
    }
    /*
    private boolean isFullTime() {
        return fullTimeRadio.isSelected();
    }

     */
}
