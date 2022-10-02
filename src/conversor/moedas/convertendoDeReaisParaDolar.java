package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaDolar {
	public void reaisParaDolar (double digitarValorEmReais) {
		double cotacaoDoDolar =  5.41;
		
		double resultadoDaConvercao = digitarValorEmReais * cotacaoDoDolar;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Dólar é : $ " + valorEmPoucosDecimais);

	}
}
