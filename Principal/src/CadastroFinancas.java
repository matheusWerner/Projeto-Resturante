

/**
 *
 * @author Matheus Ruan Werner
 */
import javax.swing.ImageIcon; 
import javax.swing.JOptionPane;

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
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "","Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        try {
        contaLuz[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor da Conta de Luz deste Mês").trim());
        contaAgua[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor Conta de Água deste Mês").trim());
        contaGas[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor da Conta de Gás deste Mês").trim());
        aluguel[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor do Aluguel").trim());
        marketing[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor da Conta de Publicidade/Marketing Mês").trim());
        folhaPagamento[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor da Folha de Pagamento deste Mês").trim());
        eventos[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor recebido dos Eventos realizados este Mês").trim());
        vendas[j] = Double.parseDouble(JOptionPane.showInputDialog("Insira o Valor das Vendas deste Mês").trim());
        } catch (NumberFormatException e)
        {
        JOptionPane.showMessageDialog(null, "Digite Somente Números");
        }
       
        
        
        
        
    }
    
    public void editar() {
        
       String busca = JOptionPane.showInputDialog(null,
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "","Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        
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
            texto += meses[i] + "  -  " + "R$ " + vendas[i] + "\n";
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
        
        String busca = JOptionPane.showInputDialog(null,
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "","Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        for (int i = 0; i < atual; i++) {
            if(meses[i].contains(busca)) {
                JOptionPane.showMessageDialog(null,
                       "Mês: " + meses[i] +
                       "\nValor da Conta Luz: R$" + contaLuz[i] +
                       "\nValor da Conta Água: R$" + contaAgua[i] +
                       "\nValor da Conta Gás: R$" + contaGas[i] +
                       "\nValor do Aluguel: R$" + aluguel[i] +
                       "\nValor da Publicidade: R$" + marketing[i] +
                       "\nValor da Folha de Pagamento: R$" + folhaPagamento[i] +
                       "\nValor recebido pelos Eventos: R$" + eventos[i] +
                       "\nValor recebido das Vendas: R$" + vendas[i]
                       
                        );
            }
        }
    }
    
    public void menuFinanças(){
        
        int menuDasFinancas = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +       
              "\n\n1               |      Cadastrar Finanças do Mês" + 
              "\n\n2               |      Editar Finanças do Mês" + 
              "\n\n3               |      Buscar Finanças do Mês" +
              "\n\n4               |      Listar Vendas dos Mêses" +      
              "\n\n5               |      Acessar Menu de Estatísticas de Finanças" + 
              "\n\n6               |      VOLTAR", "Menu de Finanças",0,
              new ImageIcon(CadastroFinancas.class.getResource("banknote.png")), null, null).toString().trim());
        
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
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            
            menuDasFinancas = Integer.parseInt(JOptionPane.showInputDialog(null,  
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +       
              "\n\n1               |      Cadastrar Finanças do Mês" + 
              "\n\n2               |      Editar Finanças do Mês" + 
              "\n\n3               |      Buscar Finanças do Mês" +
              "\n\n4               |      Listar Vendas dos Mêses" +      
              "\n\n5               |      Acessar Menu de Estatísticas de Finanças" + 
              "\n\n6               |      VOLTAR", "Menu de Finanças",0,
              new ImageIcon(CadastroFinancas.class.getResource("banknote.png")), null, null).toString().trim());
        }
    
    }
    
    public void menuEstatisticas(){
        
         int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +
              "\n\n1               |      Total do Valor das Despesas no Mês" + 
              "\n\n2               |      Total do Valor de Recebimento do Mês" +
              "\n\n3               |      Acessar o balanço do Mês" +      
              "\n\n4               |      VOLTAR", "Menu de Estatísticas",0,
              new ImageIcon(CadastroFinancas.class.getResource("bar-chart.png")), null, null).toString());
        
        while(menuDasEstatisticas != 4) {
            switch (menuDasEstatisticas) {
                case 1: estatisticaDespesasMes();
                        break;
                case 2: estatiscaGanhosMes();
                        break;
                case 3: balancoMes();
                        break;
                default:
                    
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "ERROR", JOptionPane.WARNING_MESSAGE);
                 }
            menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +
              "\n\n1               |      Total do Valor das Despesas no Mês" + 
              "\n\n2               |      Total do Valor de Recebimento do Mês" +
              "\n\n3               |      Acessar o balanço do Mês" +      
              "\n\n4               |      VOLTAR", "Menu de Estatísticas",0,
              new ImageIcon(CadastroFinancas.class.getResource("bar-chart .png")), null, null).toString());
        }
        
    }
    
    public void estatisticaDespesasMes() {
           
        String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mes", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
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
        
       
        
        JOptionPane.showMessageDialog(null, "O valor total das despesas desse mês é:  R$" + despesas[i]);
        
             
        }
        
        
        
    }
    
    public void estatiscaGanhosMes() {
        
        String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mes", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
        ganhos[i] = eventos[i] + 
                    vendas[i];
                     
        
       
        
        JOptionPane.showMessageDialog(null, "O valor total das despesas desse mês é:  R$" + ganhos[i]);
        
             
        }
        
        
        
    
    
}
    
    public void balancoMes() {
        
         String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mes", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
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
             JOptionPane.showMessageDialog(null, "Prejuízo de:  R$" + balanco[i]);
         }
                     
        
       
        
     
             
        }
        
        
    }
    
    
    
}
