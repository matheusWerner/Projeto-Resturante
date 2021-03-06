/**
 *
 * @author Matheus Ruan Werner
 */
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class CadastroFuncionario {
    
    String[] cargos = new String[50];
    String[] contatos = new String[50];
    String[] nomes = new String[50];
    int[] idades = new int[50];
    String[] sexos = new String[50];
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
        
        nomes[x] = JOptionPane.showInputDialog("Insira seu nome").trim();
        
        try {
        idades[x] = Integer.parseInt(JOptionPane.showInputDialog(nomes[x] + " informe a sua idade").trim());
        salarios[x] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário").trim());
        }
        catch (NumberFormatException e)
        {
        JOptionPane.showMessageDialog(null, "Digite Somente Números");
        return;
        }
        
        
        
        sexos[x] = JOptionPane.showInputDialog(null,
                "Sexo", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "", "Masculino", "Feminino"
                },
                ""
        ).toString();
        cpfs[x] = JOptionPane.showInputDialog(nomes[x] + " informe o  CPF").replace(".","").replace("-","").trim();
        cargos[x] = JOptionPane.showInputDialog(null,
                "Cargo", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "", "Barman", "Cheff","Garçom/Garçonete", "Ajudante de Cozinha", "Faxineiro(a)"
                        
                },
                ""
        ).toString();
        contatos[x] = JOptionPane.showInputDialog("Informe o número de contato").trim();
        cidades[x] = JOptionPane.showInputDialog("Informe a cidade").trim();
        bairros[x] = JOptionPane.showInputDialog("Informe o bairro").trim();
        ceps[x] = JOptionPane.showInputDialog("Informe o CEP").replace("-","").trim();
        numeros[x] = JOptionPane.showInputDialog("Informe o número de residência").replace(".","").replace("-","");
        complementos[x] = JOptionPane.showInputDialog("Informe o complemento").trim();
        empregoAnterior[x] = JOptionPane.showInputDialog("Informe o emprego anterior").trim();
        estadoCivil[x] = JOptionPane.showInputDialog(null,
                "Estado Civil", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "", "Solteiro(a)", "Casado(a)","Divorciado(a)", "Viuvo(a)"
                        
                },
                ""
        ).toString();
        

       
        
    }
    
    public void listar() {
        
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += "Nome: " + nomes[i] +  "   " + "CPF: " + cpfs[i] + "\n";
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
                       "\nCPF: " + cpfs[i] +
                       "\nCargo" + cargos[i] +
                       "\nContato" + contatos[i] +                                       
                       "\nEmprego Anterior: " + empregoAnterior[i] +
                       "\nCidade: " + cidades[i] +
                       "\nBairro: " + bairros[i] +
                       "\nSalÃ¡rio: " + salarios[i] +
                       "\nCEP: " + ceps[i] +
                       "\nNúmero: " + numeros[i] +
                       "\nComplemento: " + complementos[i] +
                       "\nEstado Civil: " + estadoCivil[i]
                        );
        
        
    }
    
    public void buscarPeloNome () {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca").toLowerCase();
        
        for (int i = 0; i < atual; i++) {
            if(nomes[i].toLowerCase().contains(busca)) {
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
        
       int menuDosFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +
              "\n\n1               |      Cadastrar Funcionário" + 
              "\n\n2               |      Editar Funcionário" + 
              "\n\n3               |      Buscar pelo Nome do Funcionário" +
              "\n\n4               |      Listar Funcionário" +
              "\n\n5               |      Mostrar Quantidade de Cadastros" +       
              "\n\n6               |      Acessar Menu de Estatíscas" +
              "\n\n7               |      Acessar Folha de Pagamento" +        
              "\n\n8               |      VOLTAR", "Menu de Funcionários",0,
              new ImageIcon(CadastroProdutos.class.getResource("community.png")), 
              null, null).toString().trim());
        
        while(menuDosFuncionarios != 8) {
            switch (menuDosFuncionarios) {
                case 1: cadastrar(); 
                    break;
                case 2: editar();
                    break;
                case 3: buscarPeloNome(); 
                    break;
                case 4: listar();
                    break;
                case 5: numeroCadastros();
                    break;
                case 6: menuEstatistica();
                    break;
                case 7: folhaDePagamento();
                    break;
                default:
                   JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            
            menuDosFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +
              "\n\n1               |      Cadastrar Funcionário" + 
              "\n\n2               |      Editar Funcionário" + 
              "\n\n3               |      Buscar pelo Nome do Funcionário" +
              "\n\n4               |      Listar Funcionário" +
              "\n\n5               |      Mostrar quantidade de cadastros" +       
              "\n\n6               |      Acessar Menu de Estatíscas" +
              "\n\n7               |      Acessar Folha de Pagamento" +        
              "\n\n8               |      VOLTAR", "Menu de Funcionário",0,
              new ImageIcon(CadastroProdutos.class.getResource("community.png")), 
              null, null).toString().trim());
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
    
    public void menuEstatistica() {
        
        int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃOO" +     
              "\n\n1               |      Média de Idade do Restaurante" + 
              "\n\n2               |      Média de Salário do Restaurante" +       
              "\n\n3               |      VOLTAR", "Menu de Estatíscas",0,
              new ImageIcon(CadastroProdutos.class.getResource("bars.png")), 
              null, null).toString().trim());
        
        while(menuDasEstatisticas != 3) {
            switch (menuDasEstatisticas) {
                case 1: estatisticaIdade();
                        break;
                case 2: estatisticaSalario();
                        break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null,
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +     
              "\n\n1               |      Média de Idade do Restaurante" + 
              "\n\n2               |      Média de SalÃ¡rio do Restaurante" +       
              "\n\n3               |      VOLTAR", "Menu de Estatíscas",0,
              new ImageIcon(CadastroProdutos.class.getResource("bars.png")), 
              null, null).toString().trim());
        }
        
    }
    
    public void estatisticaSalario() {
        
        double mediaSalario = 0;
        
        for (int i = 0; i < atual; i++) {
            
         mediaSalario = mediaSalario + salarios[i];
         
        }
        if (atual == 0) {
            JOptionPane.showMessageDialog(null, "Nao é possível verificar a média");
        } else {
            JOptionPane.showMessageDialog(null, "A média de salário dos funcionários do Restaurante é: R$ " + mediaSalario / atual);
        
        } 
        
        
    }
    
    public void estatisticaIdade() {
        
        int mediaIdade = 0;
        
        for (int i = 0; i < atual; i++) {
            
            mediaIdade = mediaIdade + idades[i]; 
        }
        if (atual == 0) {
            JOptionPane.showMessageDialog(null, "Nao é possível verificar a média");
        } else {
        JOptionPane.showMessageDialog(null, "A média de idade dos funcionários do Restaurante é: " + mediaIdade / atual + " anos.");
        
        } 
        
        
    }
    
    public void folhaDePagamento() {
        
        double totalSalarios = 0;
        
        
        for (int i = 0; i < atual; i++) {
            
            totalSalarios = totalSalarios + salarios[i];
            
            
        }
        JOptionPane.showMessageDialog(null, "Folha Salarial: R$ " + totalSalarios);
       
    }
    
    
    
    
    
}
