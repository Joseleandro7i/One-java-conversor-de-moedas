package conversor.unidadesComprimento;

import javax.swing.JOptionPane;

public class converterDeMetroParaMilimetro {
	public void converterDEMetroParaMilimetro (double digitarValorEmMetro) {
		 double valorDeUmMilimetro =   1000;
		
		double resultadoDaConvercao =  valorDeUmMilimetro  * digitarValorEmMetro;
		
		
	  JOptionPane.showMessageDialog(null, "O resulatdo da converção é : " + resultadoDaConvercao + "mm");
	  	  
	}
}
