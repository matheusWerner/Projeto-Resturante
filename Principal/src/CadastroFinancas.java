
import javax.swing.ImageIcon; 
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus Ruan Werner
 */
public class CadastroFinancas {
    
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
    double balanco[] = new double[12];
    
    
    
    
    public void cadastrar(){
       solicitarCadastro(atual);
       atual++;
        
    }
    
    public void solicitarCadastro(int j){
        
        meses[j] =  JOptionPane.showInputDialog(null,
                "Meses", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "", "Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        contaLuz[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de luz deste mês"));
        contaAgua[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de água deste mês"));
        contaGas[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de gás deste mês"));
        aluguel[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do aluguel deste mês"));
        marketing[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira a conta de publicidade/marketing mês"));
        folhaPagamento[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da folha de pagamento deste mês"));
        eventos[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor recebido dos eventos realizados este mês"));
        vendas[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor das vendas deste mês"));
        
        
        for (j = 0; j < atual; j++) {
            
        despesas[j] = contaLuz[j] + 
                      contaAgua[j] + 
                      contaGas[j] + 
                      aluguel[j] + 
                      marketing[j] +
                      folhaPagamento[j];
        
        
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
        
        int menuDasFinancas = Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite o Código para acessar as Opções" +
              "\n\n\n1 - Cadastrar Finanças do Mês" + 
              "\n\n2 - Editar Finanças do Mês" + 
              "\n\n3 - Buscar Finanças do Mês" +
              "\n\n4 - Listar Vendas dos Mêses" +      
              "\n\n5 - Acessar Menu de Estatísticas de Finanças" + 
              "\n\n6 - VOLTAR", "",0,
              new ImageIcon(CadastroFinancas.class.getResource("banknote.png")), null, null).toString());
        
        while(menuDasFinancas != 6) {
            switch (menuDasFinancas) {
                case 1: cadastrar(); 
                    break;
                case 2: editar();
                    break;
                case 3: buscarPeloMes(); 
                    break;
                case 4: listarVendas();
                    break;
                case 5: menuEstatisticas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Oppção Inválida");
            }
            
            menuDasFinancas = Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite o Código para acessar as Opções" +
              "\n\n\n1 - Cadastrar Finanças do Mês" + 
              "\n\n2 - Editar Finanças do Mês" + 
              "\n\n3 - Buscar Finanças do Mês" +
              "\n\n4 - Listar Vendas dos Mêses" +      
              "\n\n5 - Acessar Menu de Estatísticas de Finanças" + 
              "\n\n6 - SAIR", "",0,
              new ImageIcon(CadastroFinancas.class.getResource("banknote.png")), null, null).toString());
        }
    
    }
    
    public void menuEstatisticas(){
        
         int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Total do Valor das Despesas no Mês" + 
              "\n2 - Total do Valor de Recebimento do Mês" +
              "\n3 - Acessar o balanço do Mês" +    
              "\n4 - VOLTAR"));
        
        while(menuDasEstatisticas != 7) {
            switch (menuDasEstatisticas) {
                case 1: estatisticasDespesasMes();
                        break;
                case 2: estatiscaGanhosMes();
                        break;
                case 3: balancoMes();
                        break;
            }
            menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Total do Valor das Despesas no Mês" + 
              "\n2 - Total do Valor de Recebimento do Mês" +
              "\n3 - Acessar o balanço do Mês" +    
              "\n4 - VOLTAR"));
        }
        
    }
    
    public void estatisticasDespesasMes() {
           
        
      
        String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        despesas[i] = contaLuz[i] + 
                      contaAgua[i] + 
                      contaGas[i] + 
                      aluguel[i] + 
                      marketing[i] +
                      folhaPagamento[i];
        
       
        
        JOptionPane.showMessageDialog(null, "O valor total das despesas desse més é:  R$" + despesas[i]);
        
        }
        
    }
    
    public void estatiscaGanhosMes() {
        
        String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Janeiro", "Fevereiro","Marçoo","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        ganhos[i] = eventos[i] + 
                    vendas[i];
                     
        
       
        
        JOptionPane.showMessageDialog(null, "O valor total das despesas desse més é:  R$" + ganhos[i]);
        
             
        }
        
        
        
    
    
}
    
    public void balancoMes() {
        
         String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mes", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Janeiro", "Fevereiro","MarÃ§o","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        ganhos[i] = eventos[i] + 
                    vendas[i];
        
         despesas[i] = contaLuz[i] + 
                       contaAgua[i] + 
                       contaGas[i] + 
                       aluguel[i] + 
                       marketing[i] +
                       folhaPagamento[i];
         
         
         
         if (ganhos[i] >= despesas[i]){
             
             balanco[i] = ganhos[i] - despesas[i];
             JOptionPane.showMessageDialog(null, "Lucro de:  R$" + balanco[i]);
         } else {
             balanco[i] = ganhos[i] - despesas[i];
             JOptionPane.showMessageDialog(null, "PrejuÃ­zo de:  R$" + balanco[i]);
         }
                     
        
       
        
     
             
        }
        
        
    }

    
}
