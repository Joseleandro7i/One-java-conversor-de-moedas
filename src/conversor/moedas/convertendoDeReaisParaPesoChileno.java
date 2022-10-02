package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaPesoChileno {
	public void reaisParaPesoChileno (double digitarValorEmReais) {
		double cotacaoDePesoChileno =  0.0056;
		
		double resultadoDaConvercao = digitarValorEmReais * cotacaoDePesoChileno;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Peso Chileno : " + valorEmPoucosDecimais + "$");

}
}
