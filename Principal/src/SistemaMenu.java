/**
 *
 * @author Matheus Werner e Patrick Nascimento
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SistemaMenu {
    
    CadastroFuncionario registroFuncionario = new CadastroFuncionario();
    CadastroProdutos registroProduto = new CadastroProdutos();
    CadastroFinancas registroFinancas = new CadastroFinancas();
    CadastroPessoaJuridica registroJuridica = new CadastroPessoaJuridica();
    CadastroPessoaFisica registroFisica = new CadastroPessoaFisica();
    Sobre registroSobre = new Sobre(); 

public void menuSistema() {
    
    int menu = JOptionPane.showOptionDialog(null, "Bem vindo ao Sistema! "
              + "\n\nSelecione uma opção:", "SISTEMA DO RESTAURANTE", 0,
                JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(SistemaMenu.class.getResource("restaurant.png")),
                new Object[]{
                "Funcionários",
                "Produtos",
                "Pessoa Física",
                "Pessoa Jurídica",
                "Finanças",
                "Sobre",
                }
                , null);
              
            
           
    while(menu < 6 && menu != JOptionPane.CLOSED_OPTION) {
             switch (menu) {
                 
                case 0: registroFuncionario.menuFuncionario();
                    break;
                case 1: registroProduto.menuProdutos(); 
                    break;
                case 2: registroFisica.menuCadastroFisica();
                    break;
                case 3: registroJuridica.menuCadastroJuridica();
                    break;
                case 4: registroFinancas.menuFinanças();
                    break;
<<<<<<< HEAD
                case 5: registroSobre.sobreRestaurante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
=======
                case 5: regitroSobre.sobreRestaurante();
                    break;         
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
                    
             } 
             
             menu = JOptionPane.showOptionDialog(null, "Bem Vindo ao Sistema! "
              + "\nSelecione uma opção:", "SISTEMA DO RESTAURANTE", 0,
                JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(SistemaMenu.class.getResource("restaurant.png")),
                new Object[]{
                "Funcionários",
                "Produtos",
                "Pessoa Física",
                "Pessoa Jurídica",
                "Finanças",
                "Sobre",
                }
                , null);
              
           
             
             
             
          }
    
    

   
   } 

}
