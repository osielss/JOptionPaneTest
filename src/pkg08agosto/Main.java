package pkg08agosto;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String test = JOptionPane.showInputDialog(null, "Teste", "Entrada", JOptionPane.INFORMATION_MESSAGE);
        int testInt= Integer.parseInt(test);
        JOptionPane.showMessageDialog(null, testInt, "SAIDA",JOptionPane.ERROR_MESSAGE);
    }   
}
