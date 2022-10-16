
package conversor.moedas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaOutrasMoedas {
	
	public static void main(String[] args) {
		
		convertendoDeReaisParaOutrasMoedas.deReaisParaOutrasmoedas();
	}
		
	public static void deReaisParaOutrasmoedas() {
		
	
		convertendoDeReaisParaDolar convertendoParaDolar = new convertendoDeReaisParaDolar();
		convertendoDeReaisParaEuro  convertendoParaEuro = new convertendoDeReaisParaEuro ();
		convertendoDeReaisParaLibrasEstrelina convertendoParaLibrasEstrelinas = new convertendoDeReaisParaLibrasEstrelina();
		convertendoDeReaisParaPesoArgentino convertendoParaPesoArgentino = new convertendoDeReaisParaPesoArgentino();
		convertendoDeReaisParaPesoChileno convertendoParaPesoChilno = new convertendoDeReaisParaPesoChileno();
		
		
		while(true) {
			
			String opcoes = JOptionPane.showInputDialog(null,"escolhar qual conversor você utilizara", "menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moedas", "conversor unidades de comprimrntos"}, "escolha").toString();
			
			String valor = opcoes;
			switch (valor) {
			case "Conversor de moedas":
				
				String tipoDeConversao = JOptionPane.showInputDialog(null,"Qual tipo de conversão será", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais para dólar", "Reais para euro","Reais para libras esterlinas", "Reais para peso argentino", "Reais para peso chileno","Dólar para reais", "Euro para reais","Libras esterlinas para reias", "Peso argentino para reais", "Peso chileno para reais"}, "escolha").toString();
				

				switch(tipoDeConversao) {
				case "Reais para dólar":
					
					 String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
					 
					 Pattern regex =  Pattern.compile("([a-z])");
					 
					 Matcher alvo = regex.matcher(digitarValor);
					 
					 boolean encontrou  = alvo.find();
					 
					 if(encontrou) {
						
						JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
						
					 }
					 
					 try {
						 
						 double valorDigitadoConvertido = Double.parseDouble(digitarValor);
						 
						 convertendoParaDolar.reaisParaDolar(valorDigitadoConvertido);
					 }
					 catch (NumberFormatException ex) {
						
					}
					 
				}
				
				switch(tipoDeConversao) {
				case "Reais para euro":
					String digitarValorParaEuro = JOptionPane.showInputDialog("Digite um valor para ser convertido");
					
					 Pattern regex =  Pattern.compile("([a-z])");
					 
					 Matcher alvo = regex.matcher(digitarValorParaEuro);
					 
					 boolean encontrou  = alvo.find();
					 
					 if(encontrou) {
						
						JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
						
					 }
					 
					 try {
						 
						 double valorDigitadoConvertido = Double.parseDouble(digitarValorParaEuro);
						 
						 convertendoParaEuro.reaisParaEuro(valorDigitadoConvertido);
					 }
					 catch (NumberFormatException ex) {
						
					}
					 
				}
				
				switch(tipoDeConversao) {
				case "Reais para libras esterlinas":
					String digitarValorParaLIbrasEsterlinas = JOptionPane.showInputDialog("Digite um valor para ser convertido");
					
					 Pattern regex =  Pattern.compile("([a-z])");
					 
					 Matcher alvo = regex.matcher(digitarValorParaLIbrasEsterlinas);
					 
					 boolean encontrou  = alvo.find();
					 
					 if(encontrou) {
						
						JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
		
					 }
					 
					 try {
						 
						 double valorDigitadoConvertido = Double.parseDouble(digitarValorParaLIbrasEsterlinas);
						 
						 convertendoParaLibrasEstrelinas.reaisParaLibrasEstrelina(valorDigitadoConvertido);
					 }
					 catch (NumberFormatException ex) {
						
					}
					 
				}
				
				switch(tipoDeConversao) {
				case "Reais para peso argentino":
					String digitarValorParaPesoArgentino = JOptionPane.showInputDialog("Digite um valor para ser convertido");
					
					 Pattern regex =  Pattern.compile("([a-z])");
					 
					 Matcher alvo = regex.matcher(digitarValorParaPesoArgentino);
					 
					 boolean encontrou  = alvo.find();
					 
					 if(encontrou) {
						
						JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
						
					 }
					 
					 try {
						 
						 double valorDigitadoConvertido = Double.parseDouble(digitarValorParaPesoArgentino);
						 
						 convertendoParaPesoArgentino.reaisParaPesoArgentino(valorDigitadoConvertido);
					 }
					 catch (NumberFormatException ex) {
						
					}
					 
				}
				
				switch(tipoDeConversao) {
				case "Reais para peso chileno":
					String digitarValorParaPesoChileno = JOptionPane.showInputDialog("Digite um valor para ser convertido");
					
					
					 Pattern regex =  Pattern.compile("([a-z])");
					 
					 Matcher alvo = regex.matcher(digitarValorParaPesoChileno);
					 
					 boolean encontrou  = alvo.find();
					 
					 if(encontrou) {
						
						JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					
					 }
					 
					 try {
						 
						 double valorDigitadoConvertido = Double.parseDouble(digitarValorParaPesoChileno);
						 
						 convertendoParaPesoChilno.reaisParaPesoChileno(valorDigitadoConvertido);
					 }
					 catch (NumberFormatException ex) {
						
					}
					 				 
				}
			}
			
			
		}
		
		
	}

}
