import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {

        String strNum1 = JOptionPane.showInputDialog(
                "Enter the first number:"
        );
        String strNum2 = JOptionPane.showInputDialog(
                "Enter the second number:"
        );

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        if (num2 != 0) {
            double quotient = num1 / num2;

            JOptionPane.showMessageDialog(
                    null,
                    "Sum = " + sum +
                    "\nDifference = " + difference +
                    "\nProduct = " + product +
                    "\nQuotient = " + quotient
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Cannot divide by zero.\n" +
                    "Sum = " + sum +
                    "\nDifference = " + difference +
                    "\nProduct = " + product
            );
        }

        System.exit(0);
    }
}
