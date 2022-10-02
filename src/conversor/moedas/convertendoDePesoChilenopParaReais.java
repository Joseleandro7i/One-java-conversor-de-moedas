package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDePesoChilenopParaReais {

	public void pesoChilenoParaReais (double digitarValorEmPesoChileno) {
		double cotacaoDoReal =  0.0056;
		
		double resultadoDaConvercao =  cotacaoDoReal  * digitarValorEmPesoChileno;
		
		
	  JOptionPane.showMessageDialog(null, "O valor da converção em Reais é : R$ " + resultadoDaConvercao);

	}
}
