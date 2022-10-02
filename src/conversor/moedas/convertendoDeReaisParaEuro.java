package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaEuro {
	
		public void reaisParaEuro (double digitarValorEmReais) {
			double cotacaoDoEuro =  5.29;
			
			double resultadoDaConvercao = digitarValorEmReais * cotacaoDoEuro;
			
			double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
		  JOptionPane.showMessageDialog(null, "O valor da converção em Euro é : " + valorEmPoucosDecimais + "€");

	}

}
