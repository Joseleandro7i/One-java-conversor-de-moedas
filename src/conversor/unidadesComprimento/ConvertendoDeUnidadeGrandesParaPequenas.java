package conversor.unidadesComprimento;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class ConvertendoDeUnidadeGrandesParaPequenas {
	
	public static void main(String[] args) {
		
		ConvertendoDeUnidadeGrandesParaPequenas.unidadesGrandesParaPequenas();
			
	}
	
	public static void unidadesGrandesParaPequenas() {
		
		converterDeDecametroParaCentimetro convertendoDeDecametroParacentimetro = new converterDeDecametroParaCentimetro();
		converterDeMetroParaMilimetro convertendoDeMetroParaMilimetro = new converterDeMetroParaMilimetro();
		converterDeQuilometroParaMetro convertendoDeQuilometroParaMetro = new converterDeQuilometroParaMetro();
		
	while(true) {
		
		String opcoes = JOptionPane.showInputDialog(null,"escolhar qual conversor você utilizara", "menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de moedas", "Conversor unidades de comprimento"}, "escolha").toString();
		
		String valor = opcoes;
		
		switch (valor) {
		case "Conversor unidades de comprimento":
			
			String tipoDeConversao = JOptionPane.showInputDialog(null,"Qual tipo de conversão será", "Unidades de comprimento", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Decâmetro para centímetro", "Metro para milímetro","Quilômetro para metro"}, "escolha").toString();
			
			switch(tipoDeConversao) {
			case "Decâmetro para centímetro":
				 String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				 
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					System.out.print(encontrou);
					
				 }
				 
				 try {
					 	double valorDigitado = Double.parseDouble(digitarValor);
						convertendoDeDecametroParacentimetro.converterDEDecametroParaCentimetro(valorDigitado); 
				 }
				 catch (NumberFormatException ex) {
					
				}
				 
			}
			switch(tipoDeConversao) {
			case "Metro para milímetro":
				 
				 String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				 
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					
				 }
				 
				 try {
					 
					 double valorDigitado = Double.parseDouble(digitarValor);
					 convertendoDeMetroParaMilimetro.converterDEMetroParaMilimetro(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				}

				
			}
			switch(tipoDeConversao) {
			case "Quilômetro para metro":
				 String digitarValor = JOptionPane.showInputDialog("Digite um valor para ser convertido");
				 
				 Pattern regex =  Pattern.compile("([a-z])");
				 
				 Matcher alvo = regex.matcher(digitarValor);
				 
				 boolean encontrou  = alvo.find();
				 
				 if(encontrou) {
					
					JOptionPane.showMessageDialog(null, "Digite apenas valores númericos");
					System.out.print(encontrou);
					
				 }
				 
				 try {
					 
					 double valorDigitado = Double.parseDouble(digitarValor);
					 convertendoDeQuilometroParaMetro.converterDEQuilometroParaaMetro(valorDigitado);
				 }
				 catch (NumberFormatException ex) {
					
				}
				 
			}
		}
		
	}
	
	}
		
}