
import javax.swing.ImageIcon;
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
public class CadastroPessoaJuridica {
    
    String[] nomes = new String[50];
    int[] idades = new int[50];
    String[] cidades = new String[50];
    String[] bairros = new String[50];
    String[] ruas = new String[50];
    String[] ceps = new String[50];
    String[] numeros = new String[50];
    String[] complementos = new String[50];
    String[] cnpjs = new String[50];
    double[] pagamentos = new double[50];
    int atual = 0;
    
    public void cadastrar(){
        solicitarCadastro(atual);
        atual++;
    }
    
    public void solicitarCadastro(int i){
        nomes[i] = JOptionPane.showInputDialog("Insira nome do local");
        idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        cnpjs[i] = JOptionPane.showInputDialog("Insira seu CNPJ");
        cidades[i] = JOptionPane.showInputDialog("Digite sua cidade");
        bairros[i] = JOptionPane.showInputDialog("Insira seu bairro");
        ruas[i] = JOptionPane.showInputDialog("Insira sua rua");
        ceps[i] = JOptionPane.showInputDialog("Insira seu CEP");
        numeros[i] = JOptionPane.showInputDialog("Insira umero do local");
        complementos[i] = JOptionPane.showInputDialog("Digite o complemento");
        pagamentos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do pagamento"));
        
    } 
    
    public void listar(){
        
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] +  "   " + cnpjs[i] + "\n";
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
                       "\nCPF: " + cnpjs[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nRua: " + ruas[i] +
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
                       "\nCPF: " + cnpjs[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nRua: " + ruas[i] +
                       "\nCEP: " + ceps[i] +
                       "\nNúmero: " + numeros[i] +
                       "\nComplemento: " + complementos[i] +
                       "\nPagameto: " + pagamentos[i]
                        );
            }
        }
        
    }
    
    public void menuCadastroJuridica() {
        
       int menuCadastroJuridica = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Cadastrar Pessoa Juridica" + 
              "\n2 - Editar Pessoa Juridica" + 
              "\n3 - Buscar Pessoa Juridica" +
              "\n4 - Listar Pessoa Juridica" +
              "\n5 - Mostrar quantidade de cadastros" +       
              "\n6 - Acessar Menu de Estatísticas Juridica" + 
              "\n7 - SAIR", "",0,
              new ImageIcon(CadastroProdutos.class.getResource("lawyer.png")), 
              null, null).toString());
        
        while(menuCadastroJuridica != 7) {
            switch (menuCadastroJuridica) {
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
                case 6: estatisticasJuridica();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Volte ao Menu Principal", "Opção Inválida", JOptionPane.WARNING_MESSAGE);
            }
            
            menuCadastroJuridica = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Cadastrar Pessoa Juridica" + 
              "\n2 - Editar Pessoa Juridica" + 
              "\n3 - Buscar pelo Nome da Pessoa Juridica" +
              "\n4 - Listar Pessoa Juridica" +
              "\n5 - Mostrar quantidade de Pessoa Juridica" +       
              "\n6 - Acessar Menu de Estatísticas de Pessoa Juridica" + 
              "\n7 - SAIR", "",0,
              new ImageIcon(CadastroProdutos.class.getResource("lawyer.png")), 
              null, null).toString());
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
    
    public void estatisticasJuridica(){
        
        double mediaRecebidoJuridica = 0;
        
        for (int i = 0; i < atual; i++) {
            
         mediaRecebidoJuridica = mediaRecebidoJuridica + pagamentos[i];
         
        }
        JOptionPane.showMessageDialog(null, "A média de recebimento pessoa juridica é: R$" + mediaRecebidoJuridica / atual);
        
    
        
    }
    
    
    
    
    
}
