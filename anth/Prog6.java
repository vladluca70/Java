import javax.swing.JOptionPane;

public class Prog6 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String h="Hello ";
        String g=" !";
        name=h+name+g;
        JOptionPane.showConfirmDialog(null, name);

        String ageString = JOptionPane.showInputDialog("What is your age");
        int age = Integer.parseInt(ageString);
        JOptionPane.showConfirmDialog(null, "You are "+age+ " years old");

        String heighString = JOptionPane.showInputDialog("What is your heigh?");
        double heigh= Double.parseDouble(heighString);
        JOptionPane.showConfirmDialog(null, "You have "+ heigh+ " meters");
    }
}