
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick Otavio do Nacimento
 */
public class ProjetoRestauranteProdutos {
    
    double transportadoraA[] = new double[5];
    double transportadoraB[] = new double[5];
    double transportadoraC[] = new double[5];
    double transportadoraD[] = new double[5];
    int atual = 0;
    
    public void cadastroProdutos(){
          solicitarInformacao(atual);
            atual++;
     
       }
    
    public void solicitarInformação(int posicao){
        transportadoraA[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite Kg de proteinas"));
        transportadoraB[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite Kg de arroz, feijão, massa e grãos"));
        transportadoraC[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite Litros de bebidas em gerais"));
        transportadoraD[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite Kg de verduras e frutas"));
        
    }

    private void solicitarInformacao(int atual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
            
        
        
        
    
       
    
}
