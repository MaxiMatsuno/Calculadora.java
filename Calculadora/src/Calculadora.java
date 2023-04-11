import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        // Pedimos al usuario que ingrese los dos números
        double num1 = 0;
        double num2 = 0;
        boolean valid1 = false;
        boolean valid2 = false;

        do {
            String input1 = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
            try {
                num1 = Double.parseDouble(input1);
                valid1 = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!valid1);

        do {
            String input2 = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");
            try {
                num2 = Double.parseDouble(input2);
                valid2 = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!valid2);

        // Pedimos al usuario que elija la operación a realizar
        Object[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione la operación a realizar:",
                "Calculadora", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones[3]);

        // Realizamos la operación correspondiente y mostramos el resultado
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 1:
                JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}