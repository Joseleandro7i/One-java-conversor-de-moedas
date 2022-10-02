package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDePesoArgentinoParaReais {

	public void pesoArgentinoParaReais (double digitarValorEmLibrasEstrelinas) {
		double cotacaoDoReal =  0.037;
		
		double resultadoDaConvercao =  cotacaoDoReal  * digitarValorEmLibrasEstrelinas;
		
	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Reais é : R$ " + resultadoDaConvercao);

	}
}
