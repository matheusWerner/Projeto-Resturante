

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
<<<<<<< HEAD
    
=======
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
    
    
    
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
        
<<<<<<< HEAD
        int menuDasFinancas = Integer.parseInt(JOptionPane.showInputDialog(null,  "Digite o Código para acessar as Opções" +
              "\n\n\n1 - Cadastrar Finanças do Mês" + 
              "\n\n2 - Editar Finanças do Mês" + 
              "\n\n3 - Buscar Finanças do Mês" +
              "\n\n4 - Listar Vendas dos Mêses" +      
              "\n\n5 - Acessar Menu de Estatísticas de Finanças" + 
              "\n\n6 - VOLTAR", "",0,
              new ImageIcon(CadastroFinancas.class.getResource("banknote.png")), null, null).toString());
=======
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
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
        
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
        
<<<<<<< HEAD
         int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(
              "1 - Total do Valor das Despesas no Mês" + 
              "\n2 - Total do Valor de Recebimento do Mês" +
              "\n3 - Acessar o balanço do Mês" +    
              "\n4 - VOLTAR"));
=======
         int menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null, 
              "Digite o Código para acessar as Opções" +
              "\n\nCÓDIGO  |      OPÇÃO" +
              "\n\n1               |      Total do Valor das Despesas no Mês" + 
              "\n\n2               |      Total do Valor de Recebimento do Mês" +
              "\n\n3               |      Acessar o balanço do Mês" +      
              "\n\n4               |      VOLTAR", "Menu de Estatísticas",0,
              new ImageIcon(CadastroFinancas.class.getResource("bar-chart.png")), null, null).toString());
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
        
        while(menuDasEstatisticas != 4) {
            switch (menuDasEstatisticas) {
<<<<<<< HEAD
                case 1: estatisticasDespesasMes();
=======
                case 1: estatisticaDespesasMes();
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
                        break;
                case 2: estatiscaGanhosMes();
                        break;
                case 3: balancoMes();
                        break;
<<<<<<< HEAD
            }
            menuDasEstatisticas = Integer.parseInt(JOptionPane.showInputDialog(null,
              "1 - Total do Valor das Despesas no Mês" + 
              "\n2 - Total do Valor de Recebimento do Mês" +
              "\n3 - Acessar o balanço do Mês" +    
              "\n4 - VOLTAR"));
=======
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
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
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
        
<<<<<<< HEAD
      
=======
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
        String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
<<<<<<< HEAD
                "Mês", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
=======
                "Mes", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
                    "Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
        
<<<<<<< HEAD
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
        
=======
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
        ganhos[i] = eventos[i] + 
                    vendas[i];
                     
        
       
        
<<<<<<< HEAD
        JOptionPane.showMessageDialog(null, "O valor total das despesas desse més é:  R$" + ganhos[i]);
=======
        JOptionPane.showMessageDialog(null, "O valor total das despesas desse mês é:  R$" + ganhos[i]);
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
        
             
        }
        
        
        
    
    
}
    
    public void balancoMes() {
        
         String busca = "";
        
    
        for (int i = 0; i < atual; i++) {
            
        busca =   JOptionPane.showInputDialog(null,
                "Mes", null, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
<<<<<<< HEAD
                    "Janeiro", "Fevereiro","MarÃ§o","Abril","Maio","Junho","Julho",
=======
                    "Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
                    "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
                },
                ""
        ).toString();
<<<<<<< HEAD
        
        ganhos[i] = eventos[i] + 
                    vendas[i];
        
=======
        
        ganhos[i] = eventos[i] + 
                    vendas[i];
        
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
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
<<<<<<< HEAD
             JOptionPane.showMessageDialog(null, "PrejuÃ­zo de:  R$" + balanco[i]);
=======
             JOptionPane.showMessageDialog(null, "Prejuízo de:  R$" + balanco[i]);
>>>>>>> 37f631ae2daba63696bfccf7320b71fdab933ee8
         }
                     
        
       
        
     
             
        }
        
        
    }

    
    
    
}
