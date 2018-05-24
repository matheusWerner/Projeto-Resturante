
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
          solicitarInformação(atual);
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
    
    public void menuProdutos(){
        int menuDosProdutos = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Produtos" +
                "\n2 - Editar Produtos" +
                "\n3 - Listar Produtos" +
                "\n4 - Buscar Produtos" +
                "\n5 - Estatisticas" +
                "\n6 - SAIR"));
        while(menuDosProdutos != 6)
            switch (menuDosProdutos) {
                case 1:
                    cadastroProdutos();
                    break;
                case 2:
                    editarProdutos();
                    break;
                case 3:
                    listarProdutos();
                    break;
                case 4:
                    buscarProdutos();
                    break;
                case 5:
                    estatisticas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    
            }
        menuDosProdutos = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Produtos" +
                "\n2 - Editar Produtos" +
                "\n3 - Listar Produtos" +
                "\n4 - Buscar Produtos" +
                "\n5 - Estatisticas" +
                "\n6 - SAIR"));
        
        
    }
    
    public void estatisticas(){
        
        
        
    }
    
    public void buscarProdutos(){
         String busca = JOptionPane.showInputDialog("Digite o nome parcial da transportadora para a buscar mais informações");
         
         for(int i = 0; i < atual; i++){
             if(transportadoras[i].contains(busca)){
                JOptionPane.showMessageDialog(null, 
                "Nome da Transportadora: " + transportadoras[i] +
                "Carga fornecida: " + medidas[i] +
                "Dia do fornecimento: " + dia[i]);
                 
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

    
            
        
        
        
    
       
    
}
