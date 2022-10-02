package conversor.unidadesComprimento;

import javax.swing.JOptionPane;

public class converterDeDecametroParaCentimetro {
	public void converterDEDecametroParaCentimetro (double digitarValorEmDecametro) {
		 long valorDeUmCentimetro =  1000;
		
		double resultadoDaConvercao =  valorDeUmCentimetro  * digitarValorEmDecametro;
			
	  JOptionPane.showMessageDialog(null, "O valor da converção é : " + resultadoDaConvercao + "cm");
	  	  
	}
}
