import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        frame.setTitle("My Info");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Name:");
        label1.setBounds(10, 10, 100, 30);
        frame.add(label1);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 10, 200, 30);
        frame.add(nameField);

        JLabel label2 = new JLabel("ID:");
        label2.setBounds(10, 60, 100, 30);
        frame.add(label2);

        JTextField idField = new JTextField();
        idField.setBounds(120, 60, 200, 30);
        frame.add(idField);

        JLabel label3 = new JLabel("Batch:");
        label3.setBounds(10, 110, 100, 30);
        frame.add(label3);

        JTextField batchField = new JTextField();
        batchField.setBounds(120, 110, 200, 30);
        frame.add(batchField);

        JLabel label4 = new JLabel("Section:");
        label4.setBounds(10, 160, 100, 30);
        frame.add(label4);

        JTextField sectionField = new JTextField();
        sectionField.setBounds(120, 160, 200, 30);
        frame.add(sectionField);

        JLabel label5 = new JLabel("Department:");
        label5.setBounds(10, 210, 100, 30);
        frame.add(label5);

        JTextField deptField = new JTextField();
        deptField.setBounds(120, 210, 200, 30);
        frame.add(deptField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(120, 270, 100, 40);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String id = idField.getText();
                String batch = batchField.getText();
                String section = sectionField.getText();
                String department = deptField.getText();

                String message = "Name: " + name + "\n"
                               + "ID: " + id + "\n"
                               + "Batch: " + batch + "\n"
                               + "Section: " + section + "\n"
                               + "Department: " + department;

                JOptionPane.showMessageDialog(frame, message, "Entered Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
