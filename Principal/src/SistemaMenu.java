/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class SistemaMenu {
    
    CadastroFuncionario registroFuncionario = new CadastroFuncionario();
    CadastroProdutos registroProduto = new CadastroProdutos();
    CadastroFinancas registroFinancas = new CadastroFinancas();
    CadastroPessoaJuridica registroJuridica = new CadastroPessoaJuridica();
    CadastroPessoaFisica registroFisica = new CadastroPessoaFisica();
    Sobre regitroSobre = new Sobre(); 

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
                case 5: regitroSobre.sobreRestaurante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
                    
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
