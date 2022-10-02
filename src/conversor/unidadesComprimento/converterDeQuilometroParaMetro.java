package conversor.unidadesComprimento;

import javax.swing.JOptionPane;

public class converterDeQuilometroParaMetro {


	public void converterDEQuilometroParaaMetro (double digitarValorEmQuilometro) {
		double valorDeUmMetro =   1000;
		double resultadoDaConvercao =  valorDeUmMetro * digitarValorEmQuilometro;
		
	  JOptionPane.showMessageDialog(null, "O valor da converção em Metro  : " + resultadoDaConvercao + "m");
	  	  
	}
}
