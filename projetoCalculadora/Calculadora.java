import javax.swing.JOptionPane;         // JOptionPane como opção para o menu

import Operadores.Adicao;               
import Operadores.Multiplicacao;        // Importando as subclasses do pacote 'Operadores'                                     
import Operadores.Subtracao;            
import Operadores.Divisao;                 

public class Calculadora {
    public static void main(String[] args) {
        int op;
        
        
        do {            // Menu

        String option = JOptionPane.showInputDialog("""
    -------------------------------------
            Menu Calculadora
    -------------------------------------

Escolha uma das opções abaixo 
            
    1 - Adição
    2 - Subtração                                   
    3 - Multiplicação
    4 - Divisão

'Cancel' ou botão (X) para encerrar

                """);
            
        if (option == null) {   // Encerra caso o usuário clique em 'Cancelar ou no botão (X)'
            JOptionPane.showMessageDialog(null, "Programa encerrado");
            break;              
        } else {                                
            if (option.trim().isEmpty()) {  // Exibe um aviso se o usuário clicar em Ok com a caixa de texto vazia
                JOptionPane.showMessageDialog(null, "Por favor, selecione uma das opções.", "Erro", JOptionPane.WARNING_MESSAGE);
                continue;
            }
        }
            
            op = Integer.parseInt(option);

            switch (op) {           // Opções de cálculo de acordo com a escolha do usuário
                
                case 1:     //Adição (+)
                int ad1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (+)"));
                int ad2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro (+)"));
                Adicao adicao = new Adicao(ad1, ad2);
                JOptionPane.showMessageDialog(null, adicao.getA() + " + "+ adicao.getB() + " = " + adicao.calculaAdicao(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 2:     // Subtração (-)
                int sub1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (-)"));
                int sub2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro (-)"));
                Subtracao subtracao = new Subtracao(sub1, sub2);
                JOptionPane.showMessageDialog(null, subtracao.getA() + " - " + subtracao.getB() + " = "+ subtracao.calculaSubtracao(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 3:     // Multiplicação (*)
                int mult1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (*)"));
                int mult2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro (*)"));
                Multiplicacao multiplicacao = new Multiplicacao(mult1, mult2);
                JOptionPane.showMessageDialog(null, multiplicacao.getA() + " x " + multiplicacao.getB() + " = " + multiplicacao.calculaMultiplicacao(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

                case 4:     // Divisão (/)
                int div1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (/)"));
                int div2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro (/)"));
                Divisao divisao = new Divisao(div1, div2);
                JOptionPane.showMessageDialog(null, divisao.getA() + " / " + divisao.getB() + " = " + divisao.calculaDivisao(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

                default:    // Exibe uma mensagem de opção inválida
                    JOptionPane.showMessageDialog(null, "Opção Inválida, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        } while (true);

    }
}
