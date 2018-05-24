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
public class CadastroDespesas {
    
    double contaLuz[] = new double[12];
    double contaAgua[] = new double[12];
    double contaGas[] = new double[12];
    double aluguel[] = new double[12];
    double marketing[] = new double[12];
    double folhaPagamento[] = new double[12];
    double eventos[] = new double[12];
    double vendas[] = new double[12];
    String meses[] = new String[12];
    int atual = 0;
    double despesas[] = new double[12];
    double ganhos[] = new double[12];
    
    
    
    public void cadastrar(){
       solicitarCadastro(atual);
       atual++;
        
    }
    
    public void solicitarCadastro(int j){
        
        meses[j] = JOptionPane.showInputDialog("Informe o mês(por extenso) que deseja inserir as finanças");
        contaLuz[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de luz deste mês"));
        contaAgua[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de água deste mês"));
        contaGas[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de gás deste mês"));
        aluguel[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do aluguel deste mês"));
        marketing[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de publicidade/marketing mês"));
        folhaPagamento[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da folha de pagamento deste mês"));
        eventos[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor recebido dos eventos realizados este mês"));
        vendas[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor das vendas deste mês"));
        
        
        for (j = 0; j < atual; j++) {
            
        despesas[j] = contaLuz[j] + contaAgua[j] + contaGas[j] + aluguel[j] + marketing[j]
                      + folhaPagamento[j];
        
        
        ganhos[j] = eventos[j] + vendas[j];
        
        }
        
        
    }
    
    public void editar() {
        
       String busca = JOptionPane.showInputDialog("Informe o mês para editar");
        
        for (int i = 0; i < atual; i++) {
            
            if(meses[i].equals(busca)) {
                solicitarCadastro(i);
                return; 
            }
        }
    }
    
    public void listarVendas(){
        
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += meses[i] + "   " + vendas[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
        
    }
    
    public void apresentarCadastro(int i){
        
        JOptionPane.showMessageDialog(null,
                       "Mês: " + meses[i] +
                       "\nValor da Conta Luz: " + contaLuz[i] +
                       "\nValor da Conta Água: " + contaAgua[i] +
                       "\nValor da Conta Gás: " + contaGas[i] +
                       "\nValor do Aluguel: " + aluguel[i] +
                       "\nValor da Publicidade: " + marketing[i] +
                       "\nValor da Folha de Pagamento: " + folhaPagamento[i] +
                       "\nValor recebido pelos Eventos: " + eventos[i] +
                       "\nValor recebido das Vendas: " + vendas[i]
                       
                        );
        
        
        
    }
    
    public void buscarPeloMes() {
        
        String busca = JOptionPane.showInputDialog("Digite o nome do mês parcial para a busca");
        
        for (int i = 0; i < atual; i++) {
            if(meses[i].contains(busca)) {
                JOptionPane.showMessageDialog(null,
                       "Mês: " + meses[i] +
                       "\nValor da Conta Luz: " + contaLuz[i] +
                       "\nValor da Conta Água: " + contaAgua[i] +
                       "\nValor da Conta Gás: " + contaGas[i] +
                       "\nValor do Aluguel: " + aluguel[i] +
                       "\nValor da Publicidade: " + marketing[i] +
                       "\nValor da Folha de Pagamento: " + folhaPagamento[i] +
                       "\nValor recebido pelos Eventos: " + eventos[i] +
                       "\nValor recebido das Vendas: " + vendas[i]
                       
                        );
            }
        }
    }
    
    public void menuFinanças(){
        
        int menuDosFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Finanças do Mês" + 
              "\n2 - Editar Finanças do Mês" + 
              "\n3 - Buscar Finanças do Mês" +
              "\n4 - Listar Vendas dos Mêses" +      
              "\n5 - Acessar Menu de Estatísticas de Finanças" + 
              "\n6 - SAIR"));
        
        while(menuDosFuncionarios != 7) {
            switch (menuDosFuncionarios) {
                case 1: cadastrar(); 
                    break;
                case 2: editar();
                    break;
                case 3: buscarPeloMes(); 
                    break;
                case 4: listarVendas();
                    break;
                case 5: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
            }
            
            menuDosFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Cadastrar Funcionário" + 
              "\n2 - Editar Funcionário" + 
              "\n3 - Buscar pelo Nome do Funcionário" +
              "\n4 - Listar Funcionário" +
              "\n5 - Mostrar quantidade de cadastros" +       
              "\n6 - Acessar Menu de Estatísticas" + 
              "\n7 - SAIR"));
        }
    
    }
    
    public void menuEstatisticas(){
        
         int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Total do Valor das Despesas no Mês" +
              "\n2 - Total do Valor das Despesas do Ano" + 
              "\n3 - Total do Valor de Recebimento do Mês" +
              "\n4 - Total do Valor de Recebimento do Ano" +
              "\n5 - Acessar o balanço do Mês" +
              "\n6 - Acessar o balnaço do Ano" +       
              "\n7 - SAIR"));
        
        while(menuDasEstatisticas != 7) {
            switch (menuDasEstatisticas) {
                case 1: 
                        break;
                case 2: 
                        break;
                case 3:
                        break;
                case 4: 
                        break;
                case 5: 
                        break;
                case 6: 
                        break;
            }
            menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Total do Valor das Despesas no Mês" +
              "\n2 - Total do Valor das Despesas do Ano" + 
              "\n3 - Total do Valor de Recebimento do Mês" +
              "\n4 - Total do Valor de Recebimento do Ano" +
              "\n5 - Acessar o balanço do Mês" +
              "\n6 - Acessar o balnaço do Ano" +
              "\n7 - SAIR"));
        }
        
    }
    
    public void estatisticasDespesasMes() {
           
        
        
    
        for (int i = 0; i < atual; i++) {
            
        meses[i] = JOptionPane.showInputDialog("Informe o Mês para saber o valor das despesas");
            
        
          
        }
        
        
    }
    
}
