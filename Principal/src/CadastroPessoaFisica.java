
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
public class CadastroPessoaFisica {
    
    String[] nomes = new String[50];
    int[] idades = new int[50];
    char[] sexos = new char[50];
    String[] cpfs = new String[50];
    String[] cidades = new String[50];
    String[] bairros = new String[50];
    String[] ceps = new String[50];
    String[] numeros = new String[50];
    String[] complementos = new String[50];
    double[] salarios = new double[50];
    double[] pagamentos = new double[50];
    int atual = 0;
    
    public void cadastrar(){
        solicitarCadastro(atual);
        atual++;
    }
    
    public void solicitarCadastro(int i){
        nomes[i] = JOptionPane.showInputDialog("Insira seu nome");
        idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        sexos[i] = JOptionPane.showInputDialog(nomes[0] + " digite o seu sexo").charAt(0);
        cpfs[i] = JOptionPane.showInputDialog("Insira seu CPF");
        cidades[i] = JOptionPane.showInputDialog("Digite sua cidade");
        bairros[i] = JOptionPane.showInputDialog("Insira seu bairro");
        ceps[i] = JOptionPane.showInputDialog("Insira seu CEP");
        numeros[i] = JOptionPane.showInputDialog("Insira umero do local");
        complementos[i] = JOptionPane.showInputDialog("Digite o complemento");
        salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário"));
        pagamentos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento"));
        
    } 
    
    public void listar(){
        
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] +  "   " + cpfs[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
        
    }
    
    public void editar() {
        
        String busca = JOptionPane.showInputDialog("Informe o nome para editar");
        
        for (int i = 0; i < atual; i++) {
            
            if(nomes[i].equals(busca)) {
                solicitarCadastro(i);
                return;
        }
     }
    } 
    
    public void apresentarCadastro (int i) {
        
         JOptionPane.showMessageDialog(null,
                       "Nome: " + nomes[i] +
                       "\nIdade: " + idades[i] +
                       "\nSexo: " + sexos[i] +
                       "\nCPF: " + cpfs[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nSalário: " + salarios[i] +
                       "\nCEP: " + ceps[i] +
                       "\nNúmero: " + numeros[i] +
                       "\nComplemento: " + complementos[i] +
                       "\nPagameto: " + pagamentos[i]
                        );
        
        
    }
    
    public void buscarPeloNome () {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        
        for (int i = 0; i < atual; i++) {
            if(nomes[i].contains(busca)) {
                JOptionPane.showMessageDialog(null,
                       "Nome: " + nomes[i] +
                       "\nIdade: " + idades[i] +
                       "\nSexo: " + sexos[i] +
                       "\nCPF: " + cpfs[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nSalário: " + salarios[i] +
                       "\nCEP: " + ceps[i] +
                       "\nNúmero: " + numeros[i] +
                       "\nComplemento: " + complementos[i] +
                       "\nPagameto: " + pagamentos[i]
                        );
            }
        }
        
    }
    
    public void menuCadastroFisica() {
        
       int menuCadastroFisica = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Funcionário" + 
              "\n2 - Editar Funcionário" + 
              "\n3 - Buscar pelo Nome do Funcionário" +
              "\n4 - Listar Funcionário" +
              "\n5 - Mostrar quantidade de cadastros" +       
              "\n6 - Acessar Menu de Estatísticas" + 
              "\n7 - SAIR"));
        
        while(menuCadastroFisica != 7) {
            switch (menuCadastroFisica) {
                case 1: cadastrar(); 
                    break;
                case 2: editar();
                    break;
                case 3: buscarPeloNome(); 
                    break;
                case 4: listar();
                    break;
                case 5: numeroCadastros ();
                    break;
                case 6: estatisticasFisica();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            
            menuCadastroFisica = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Pessoa Fisica" + 
              "\n2 - Editar Pessoa Fisica" + 
              "\n3 - Buscar pelo Nome da Pessoa Fisica" +
              "\n4 - Listar Pessoa Fisica" +
              "\n5 - Mostrar quantidade de Pessoa Fisica" +       
              "\n6 - Acessar Menu de Estatísticas de Pessoa Fisica" + 
              "\n7 - SAIR"));
        }
    
    }
    
    public void numeroCadastros(){
        
        String busca = JOptionPane.showInputDialog("digite o nome parcial para a busca");
       
       int quantidadeCadastro = 0;
       for (int i = 0; i < atual; i++) {
           if(nomes[i].contains(busca)) {
               quantidadeCadastro++;
           }
       }
       JOptionPane.showMessageDialog(null, "A quantidade de " + busca + " é: "
                                + quantidadeCadastro);
    
    }
    
    public void estatisticasFisica(){
        
    }
    
    
    
    
    
    
}
