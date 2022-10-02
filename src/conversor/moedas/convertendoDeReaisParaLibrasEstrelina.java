package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaLibrasEstrelina {

	public void reaisParaLibrasEstrelina (double digitarValorEmReais) {
		double cotacaoDeLibraEstrelinas =  6.02;
		
		double resultadoDaConvercao = digitarValorEmReais * cotacaoDeLibraEstrelinas;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Libara Estrelina : £ " + valorEmPoucosDecimais);

	}

}
