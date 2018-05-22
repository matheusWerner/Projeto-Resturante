/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class SistemaMenu {
    
    CadastroFuncionario registroFuncionario = new CadastroFuncionario();
    

public void menuSistema() {
    
    int menu = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Funcionários"
            + "\n2 - Fornecimento de Produtor"
            + "\n3 - Convênios"
            + "\n4 - Despesas e Ganhos"
            + "\n5 - Sobre"
            + "\n6 - Sair"));
    
    while(menu != 6) {
             switch (menu) {
                 
                case 1: int subMenu = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Funcionário" + 
              "\n2 - Editar Funcionário" + 
              "\n3 - Buscar pelo Nome do Funcionário" +
              "\n4 - Listar Funcionário" +
              "\n5 - Editar Funcionário" +
              "\n6 - Mostrar quantidade de registros" +       
              "\n8001 - Sair"));
                    while(subMenu != 10) {
                        switch (subMenu) {
                            case 1: registroFuncionario.solicitarCadastro();
                                break;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3: registroFuncionario.buscarPeloNome(); 
                    break;
                case 4:
                    break;
                case 5: registroFuncionario.listar();
                    break;
                case 6: registroFuncionario.contabilizarPeloNome();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
                    
             } 
             
          }
    
    

    int subMenu = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Funcionário" + 
              "\n2 - Editar Funcionário" + 
              "\n3 - Buscar pelo Nome do Funcionário" +
              "\n4 - Listar Funcionário" +
              "\n5 - Editar Funcionário" +
              "\n6 - Mostrar quantidade de registros" +       
              "\n8001 - Sair"));
    
    
          while(menu != 10) {
             switch (menu) {
                 
                case 1: registroFuncionario.cadastrar(); 
                    break;
                case 2:
                    break;
                case 3: registroFuncionario.buscarPeloNome(); 
                    break;
                case 4:
                    break;
                case 5: registroFuncionario.listar();
                    break;
                case 6: registroFuncionario.contabilizarPeloNome();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
                    
             } 
             
          }
        
   } 

}
