<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.ImageIcon;
=======
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author Matheus Ruan Werner
 */
public class Sobre {
    
    public void sobreRestaurante() {
        
        
        JOptionPane.showMessageDialog(null, "Sistema Interno de Controle do Restaurante."
                + "\n\nControle de Fluxo de Caixa."
                + "\nControle de Informações de Funcionários."
                + "\nControle de Convênios: Pessoa Física e Pessoa Jurídica."
                + "\nControle de Fluxo de Produtos.", "SOBRE", JOptionPane.WARNING_MESSAGE, new ImageIcon(
                    Sobre.class.getResource
                    ("icon.png")
                ));
        
              
        
    }
    
}
