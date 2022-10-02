package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaPesoArgentino {
		
		public void reaisParaPesoArgentino (double digitarValorEmReais) {
			double cotacaoDePesoArgentino =  0.037;
			
			double resultadoDaConvercao = digitarValorEmReais * cotacaoDePesoArgentino;
			
			double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
		  JOptionPane.showMessageDialog(null, "O valor da converção em Peso Argentino é : " + valorEmPoucosDecimais + "$");

	}

}
