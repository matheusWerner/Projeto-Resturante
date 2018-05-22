
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
    
    String transportadoras[] = new String[5];
    String medidas[] = new String[5];
    String dia[] = new String[5];
    
    int atual = 0;
    
    public void cadastroProdutos(){
          solicitarInformacao(atual);
            atual++;
     
       }
    
    public void editarProdutos(){
        String busca = JOptionPane.showInputDialog("Solicite o que deseja editar");
        for(int i = 0; i < atual; i++){
            if(transportadoras[i].equals(busca)){
                solicitarInformação(i);
                
                return;
                
            }
        }
       
    }
    
    public void listarProdutos(){
        String texto = "";
        for(int i = 0; i < atual; i++){
        texto += transportadoras[i] + "  " + medidas[i] + "   " + dia[i] + "\n";
    }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void estatisticasProdutos(){
        
    }
    
    public void buscarProdutos(){
         String busca = JOptionPane.showInputDialog("Digite o nome parcial da transportadora para a buscar mais informações");
         
         for(int i = 0; i < atual; i++){
             if(transportadoras[i].contains(busca)){
                 solicitarInformação(i);
                 
             }
         }
    }
    
    public void solicitarInformação(int posicao){
        transportadoras[posicao] = JOptionPane.showInputDialog("Digite qual transportadora");
        medidas[posicao] = JOptionPane.showInputDialog("Digite quantidades do fornecimento em kg ou litros");
        dia[posicao] = JOptionPane.showInputDialog("Dia do fornecimento").replace(".","").replace("-","").replace("/","");
    }
    
    public void apresentarInformação(int i){
        JOptionPane.showMessageDialog(null, 
                "Nome da Transportadora: " + transportadoras[i] +
                        "Carga fornecida: " + medidas[i] +
                        "Dia do fornecimento: " + dia[i]
                        
                        
                      
        );
    }

    private void solicitarInformacao(int atual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    
        
            
        
        
        
    
       
    
}
