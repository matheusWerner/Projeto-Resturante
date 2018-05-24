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
    
    public void listar(){
        
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += meses[i];
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
        
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
        
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
    
    
}
