package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeEuroParaReais {
	public void EuroParaReais (double digitarValorEmEuro) {
		double cotacaoDoReal =  5.29;
		
		double resultadoDaConvercao =  cotacaoDoReal  / digitarValorEmEuro;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Reais é : R$ " + valorEmPoucosDecimais);

	}
}
