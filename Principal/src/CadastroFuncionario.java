
/**
 *
 * @author Alunos
 */

import javax.swing.JOptionPane;



public class CadastroFuncionario {
    
    CadastroFuncionario registroFuncionario = new CadastroFuncionario();
      
    
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
    String[] empregoAnterior = new String[50];
    String[] estadoCivil = new String[50];
    int atual = 0;
    
    public void cadastrar() {
        solicitarCadastro(atual);
        atual++;
    }
    
    public void solicitarCadastro(int x) {
        
        nomes[x] = JOptionPane.showInputDialog("Insira seu nome");
        idades[x] = Integer.parseInt(JOptionPane.showInputDialog(nomes[0] + " digite a sua idade"));
        sexos[x] = JOptionPane.showInputDialog(nomes[0] + " digite o seu sexo").charAt(0);
        cpfs[x] = JOptionPane.showInputDialog(nomes[0] + " digite o seu CPF").replace(".","").replace("-","");
        cidades[x] = JOptionPane.showInputDialog("Digite a sua cidade");
        salarios[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário"));
        bairros[x] = JOptionPane.showInputDialog("Digite o seu bairro");
        ceps[x] = JOptionPane.showInputDialog("Digite o seu CEP");
        numeros[x] = JOptionPane.showInputDialog("Digite o seu número");
        complementos[x] = JOptionPane.showInputDialog("Digite o complemento");
        empregoAnterior[x] = JOptionPane.showInputDialog("Informe o emprego anterior");
        estadoCivil[x] = JOptionPane.showInputDialog("Informe o estado civil");
        

       
        
    }
    
    public void listar() {
        
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
                apresentarCadastro(i);
                return;
        }
     }
    } 
    
    public void apresentarCadastro (int i) {
        
         JOptionPane.showMessageDialog(null,
                       "Nome: " + nomes[i] +
                       "\nIdade: " + idades[i] +
                       "\nCPF: " + cpfs[i] +
                       "\nEmprego Anterior: " + empregoAnterior[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nSalário: " + salarios[i] +
                       "\nCEP: " + ceps[i] +
                       "\nNúmero: " + numeros[i] +
                       "\nComplemento: " + complementos[i] +
                       "\nEstado Civil: " + estadoCivil[i]
                        );
        
        
    }
    
    public void buscarPeloNome () {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        
        for (int i = 0; i < atual; i++) {
            if(nomes[i].contains(busca)) {
                JOptionPane.showMessageDialog(null,
                       "Nome: " + nomes[i] +
                       "\nIdade: " + idades[i] +
                       "\nCPF: " + cpfs[i] +
                       "\nEmprego Anterior: " + empregoAnterior[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nSalário: " + salarios[i] +
                       "\nCEP: " + ceps[i] +
                       "\nNúmero: " + numeros[i] +
                       "\nComplemento: " + complementos[i] +
                       "\nEstado Civil: " + estadoCivil[i]
                         );
            }
        }
        
    }
    
    public void menuFuncionario() {
        
        int menuDosFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Funcionário" + 
              "\n2 - Editar Funcionário" + 
              "\n3 - Buscar pelo Nome do Funcionário" +
              "\n4 - Listar Funcionário" +
              "\n5 - Mostrar quantidade de cadastros" +       
              "\n6 - Sair"));
        
        while(menuDosFuncionarios != 6) {
            switch (menuDosFuncionarios) {
                case 1: registroFuncionario.cadastrar(); 
                    break;
                case 2: registroFuncionario.editar();
                    break;
                case 3: registroFuncionario.buscarPeloNome(); 
                    break;
                case 4: registroFuncionario.listar();
                    break;
                case 5: registroFuncionario.numeroCadastros();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
            }
        }
    
    }
    
    public void numeroCadastros() {
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
    
    
    
    
    
}
