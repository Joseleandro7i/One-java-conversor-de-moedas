
package conversor.moedas;

import javax.swing.JOptionPane;

public class Escolher {
	
	public static void main(String[] args) {
		
		while(true) {
			String opcoes = JOptionPane.showInputDialog(null,"escolhar qual conversor você utilizara", "menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moedas", "conversor temperatura"}, "escolha").toString();
			
			
			String tipoDeConversão = JOptionPane.showInputDialog(null,"qual tipo de conversão será", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Real para dólar", "real para euro","real para libras esterlinas", "real para peso argentino", "real para peso chileno"}, "escolha").toString();
			
			switch(tipoDeConversão) {
			
			
			}
		}
		
		
	}

}
