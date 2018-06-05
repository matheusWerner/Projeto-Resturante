import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author Patrick Otavio do Nacimento e Matheus Ruan Werner
 */
public class CadastroProdutos {
    
  
    
    String transportadoras[] = new String[3];
    double medidaKilo[] = new double[3];
    double medidaLitros[] = new double[3];
    String meses[] = new String[3];
    
    
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
        texto += "Transportadora " + transportadoras[i] + "  " + medidaKilo[i] + " Kg    " + medidaLitros[i] + " L    " + "Mês: " + meses[i] + "\n";
    }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void menuProdutos(){
        int menuDosProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Produtos" +
                "\n2 - Editar Produtos" +
                "\n3 - Listar Produtos" +
                "\n4 - Buscar Produtos" +
                "\n5 - Estatisticas" +
                "\n6 - SAIR", "",0,
                new ImageIcon(CadastroProdutos.class.getResource("groceries-bag.png")), 
                null, null).toString());
        
        while(menuDosProdutos != 6){
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
                    menuEstatistica();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    
            }
        menuDosProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Produtos" +
                "\n2 - Editar Produtos" +
                "\n3 - Listar Produtos" +
                "\n4 - Buscar Produtos" +
                "\n5 - Estatisticas" +
                "\n6 - SAIR", "",0,
                new ImageIcon(CadastroProdutos.class.getResource("groceries-bag.png")), 
                null, null).toString());
        }
        
    }
    
    public void menuEstatistica() {
        
         int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Média de Fornecimento em Kilos(kg)" +
                "\n2 - Média de Fornecimento em Litros(L)" +
                "\n3 - VOLTAR", "",0,
                new ImageIcon(CadastroProdutos.class.getResource("groceries-bag.png")), 
                null, null).toString());
        
        while(menuDasEstatisticas != 3){
            switch (menuDasEstatisticas) {
                case 1:
                    estatisticaKilos();
                    break;
                case 2:
                    estatisticaLitros();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    
            }
        menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Média de Fornecimento em Kilos(kg)" +
                "\n2 -Média de Fornecimento em Litros(L)" +
                "\n3 - VOLTAR", "",0,
                new ImageIcon(CadastroProdutos.class.getResource("groceries-bag.png")), 
                null, null).toString());
        }
        
        
    }
    
    public void estatisticaKilos(){
        
        double mediaKilos = 0;
        
        for (int i = 0; i < atual; i++) {
            
            mediaKilos = mediaKilos + medidaKilo[i];
            
         
        }
        JOptionPane.showMessageDialog(null, "A média de fornecimento em Kg para o restaurante até então é: " + mediaKilos / atual + " Kg");
        
        
    }
    
    public void estatisticaLitros() {
        
           
        double mediaLitros = 0;
        
        for (int i = 0; i < atual; i++) {
            
            mediaLitros = mediaLitros + medidaLitros[i];
            
         
        }
        JOptionPane.showMessageDialog(null, "A média de fornecimento em Litros para o restaurante até então é: " + mediaLitros / atual + " L");
        
        
        
    }
    
    public void buscarProdutos(){
         String busca = JOptionPane.showInputDialog(null,
                "Transportadora", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "","A", "B","C"
                },
                ""
        ).toString();
         
         for(int i = 0; i < atual; i++){
             if(transportadoras[i].contains(busca)){
                JOptionPane.showMessageDialog(null, 
                "Nome da Transportadora: " + transportadoras[i] +
                "\nCarga em Kilos: " + medidaKilo[i] + " Kg" +
                "\nCarga em Litros: " + medidaLitros[i] + " L" +            
                "\nDia do fornecimento: " + meses[i]);
                 
             }
         }
    }
    
    public void solicitarInformação(int posicao){
        
        
          meses[posicao] =  JOptionPane.showInputDialog(null,
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "","Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        transportadoras[posicao] = JOptionPane.showInputDialog(null,
                "Transportadora", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "","A", "B","C"
                },
                ""
        ).toString();
        
        medidaKilo[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidades do fornecimento em Kg"));
        medidaLitros[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidades do fornecimento em L"));
       
    }
    
    public void apresentarInformação(int i){
        JOptionPane.showMessageDialog(null, 
                "Nome da Transportadora: " + transportadoras[i] +
                "Carga em Kilos: " + medidaKilo[i] + " Kg" +
                "Carga em Litros: " + medidaLitros[i] + " L" +            
                "Mês do fornecimento: " + meses[i]
                        
                        
                      
        );
    }

    
            
        
        
        
    
       
    
}
