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
    ProjetoRestauranteProdutos registroProduto = new ProjetoRestauranteProdutos();
    CadastroDespesas registroFinancas = new CadastroDespesas();
    

public void menuSistema() {
    
    int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Funcionários"
<<<<<<< HEAD
            + "\n2 - Fornecimento de Produtor"
            + "\n3 - Convênios"
            + "\n4 - Despesas e Ganhos"
            + "\n5 - Sobre"
            + "\n6 - Sair", "",0,
            new ImageIcon(SistemaMenu.class.getResource("restaurant.png")), null, null).toString());
=======
            + "\n2 - Fornecimento de Produtos"
            + "\n3 - Finanças"
            + "\n4 - Convênios: Pessoa Jurídica"          
            + "\n5 - Convênios: Pessoa Física"
            + "\n6 - Sobre"
            + "\n7 - Sair"));
>>>>>>> 0fcda851ccc2d6b172802e71ffb40f95c8c07500
    
    while(menu != 7) {
             switch (menu) {
                 
                case 1: registroFuncionario.menuFuncionario();
                    break;
                case 2: registroProduto.menuProdutos(); 
                    break;
                case 3: registroFinancas.menuFinanças();
                    break;
                case 4:
                    break;
                case 5: 
                    break;
                case 6: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
                    
             } 
             
             menu = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Funcionários"
            + "\n2 - Fornecimento de Produtos"
            + "\n3 - Convênios"
            + "\n4 - Despesas e Ganhos"
            + "\n5 - Sobre"
            + "\n6 - Sair"));
             
             
             
          }
    
    

   
   } 

}
