package conversor.moedas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class convertendoDeOutasMoedasParaReais {
		
	
	public static void main(String[] args) {
			
			convertendoDeOutasMoedasParaReais.converte();
			
		}
	
	public static void converte() {
		
		convertendoDeDolarParaReais converterDeDolarParaReais = new convertendoDeDolarParaReais();
		convertendoDeEuroParaReais converterDeEuroParaReais = new convertendoDeEuroParaReais();
		convertendoDeLibrasEsterlinasParaReais converterDeLibrasEstrelinasParaReais = new convertendoDeLibrasEsterlinasParaReais();
		convertendoDePesoArgentinoParaReais converterDePesoArgentinoParaReais = new convertendoDePesoArgentinoParaReais();
		convertendoDePesoChilenopParaReais converterDePesoChilenoParaReais = new convertendoDePesoChilenopParaReais();
		

		String opcoes = JOptionPane.showInputDialog(null,"escolhar qual conversor você utilizara", "menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moedas", "conversor unidades de comprimento"}, "escolha").toString();
		
		String valor = opcoes;
		switch (valor) {
		case "Conversor de moedas":
			
			String tipoDeConversao = JOptionPane.showInputDialog(null,"Qual tipo de conversão será", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Reais para dólar", "Reais para euro","Reais para libras esterlinas", "Reais para peso argentino", "Reais para peso chileno","Dólar para reais", "Euro para reais","Libras esterlinas para reias", "Peso argentino para reais", "Peso chileno para reais"}, "escolha").toString();
			
			switch(tipoDeConversao) {
			case "Dólar para reais":
				 String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				 
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");				
				 }
				 
				 try {
					 
					 double valorDigitado = Double.parseDouble(digitarValor);
					 
					 converterDeDolarParaReais.dolarParaReais(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				} 
			}
			
			switch(tipoDeConversao) {
			case "Euro para reais":
				
				String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					
				 }
				 
				 try {
					 
					 double valorDigitado = Double.parseDouble(digitarValor);
					 
					 converterDeEuroParaReais.EuroParaReais(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				}
			}
			
			switch(tipoDeConversao) {
			case "Libras esterlinas para reias":
				
				String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					
				 }
				 
				 try {
					 double valorDigitado = Double.parseDouble(digitarValor);
					 
					 converterDeLibrasEstrelinasParaReais.librasEstrelinasParaReais(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				}
				
			}
			
			switch(tipoDeConversao) {
			case "Peso argentino para reais":
				
				String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					
				 }
				 
				 try {
					 
					 double valorDigitado = Double.parseDouble(digitarValor);
					 
					 converterDePesoArgentinoParaReais.pesoArgentinoParaReais(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				}
				
			}
			
			switch(tipoDeConversao) {
			case "Peso chileno para reais":
				
				String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
				 }
				 
				 try {
					 
					 double valorDigitado = Double.parseDouble(digitarValor);
					 
					 converterDePesoChilenoParaReais.pesoChilenoParaReais(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				}
			}
			
			}
	}
	
	}

