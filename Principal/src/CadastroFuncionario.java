
/**
 *
 * @author Alunos
 */

import javax.swing.JOptionPane;



public class CadastroFuncionario {
      
    
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
        

        atual++;
        
    }
    
    public void listar() {
        
        String texto = "";
        
    }
    
    
    
    
    
    
}
