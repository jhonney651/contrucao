import com.mycompany.construcao.Concreto;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Concreto co = new Concreto();
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base da viga:"));
        co.setBase(base);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da viga:"));
        co.setAltura(altura);
        
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da viga:"));
        co.setComprimento(comprimento);
        
        double volume = co.calcularVolume();
        
        JOptionPane.showMessageDialog(null, "O volume da viga eh: " + volume);
    }
}