import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Food Order System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        frame.getContentPane().add(mainPanel);

        JTextField mainCourseField = new JTextField(10);
        JTextField drink1Field = new JTextField(10);
        JTextField drink2Field = new JTextField(10);
        JTextField dessertField = new JTextField(10);

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            String mainCourse = mainCourseField.getText();
            String drink1 = drink1Field.getText();
            String drink2 = drink2Field.getText();
            String dessert = dessertField.getText();

            Builder builder1 = new ConcreteBuilder1();
            Director director1 = new Director(builder1);
            director1.construct(mainCourse, drink1);
            Product product1 = builder1.getResult();

            Builder builder2 = new ConcreteBuilder2();
            Director director2 = new Director(builder2);
            director2.construct(drink2, dessert);
            Product product2 = builder2.getResult();

            JOptionPane.showMessageDialog(frame,
                    "Food Item from Builder1(Main Course): " + product1 + "\n" +
                            "Food Item from Builder2(Dessert): " + product2);
        });

        mainPanel.add(new JLabel("Main Course Dish-1: "));
        mainPanel.add(mainCourseField);
        mainPanel.add(new JLabel("Main Course Dish-2: "));
        mainPanel.add(drink1Field);
        mainPanel.add(new JLabel("Drink: "));
        mainPanel.add(drink2Field);
        mainPanel.add(new JLabel("Dessert: "));
        mainPanel.add(dessertField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(submitButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
