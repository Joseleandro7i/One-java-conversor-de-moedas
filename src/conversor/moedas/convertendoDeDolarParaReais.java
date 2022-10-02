package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeDolarParaReais {

	public void dolarParaReais (double digitarValorEmDolar) {
		double cotacaoDoReal =  5.39;
		
		double resultadoDaConvercao = digitarValorEmDolar / cotacaoDoReal;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção é Reais : R$ " + valorEmPoucosDecimais);

	}
}
