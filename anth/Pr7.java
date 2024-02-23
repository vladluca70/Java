import javax.swing.JOptionPane;

public class Pr7 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello!");

        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        String ageString = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(ageString);
        JOptionPane.showMessageDialog(null, "You are "+age);

        JOptionPane.showMessageDialog(null, "Have a good day!");
    }
}