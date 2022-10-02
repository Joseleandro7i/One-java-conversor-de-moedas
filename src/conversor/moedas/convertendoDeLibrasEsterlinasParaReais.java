package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeLibrasEsterlinasParaReais {

	public void librasEstrelinasParaReais (double digitarValorEmLibrasEstrelinas) {
		double cotacaoDoReal =  6.02;
		
		double resultadoDaConvercao =  cotacaoDoReal  * digitarValorEmLibrasEstrelinas;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Reais é : R$ " + valorEmPoucosDecimais);
	  	  
	}
}
