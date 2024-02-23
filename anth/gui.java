import javax.swing.JOptionPane;

public class gui {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("What is your name?");
        String x="Hello ";
        x=x+name;
        x=x+" !";
        JOptionPane.showMessageDialog(null, x);

        String numarS = JOptionPane.showInputDialog("What is your number? ");
        int y= Integer.parseInt(numarS);
        if(y%2==0)
            JOptionPane.showMessageDialog(null, "It's even");
        else
            JOptionPane.showMessageDialog(null, "It's odd");

        String heightS = JOptionPane.showInputDialog("What is your height? ");
        double height = Double.parseDouble(heightS);
        if(height>100.0)
            JOptionPane.showConfirmDialog(null, "You're high");
        else
            JOptionPane.showConfirmDialog(null, "You're short");
    }
}