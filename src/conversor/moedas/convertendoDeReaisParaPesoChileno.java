package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaPesoChileno {
	
	convertendoDeReaisParaOutrasMoedas converterDeReaisParaOutasMoedas = new convertendoDeReaisParaOutrasMoedas();

	
	@SuppressWarnings("static-access")
	public void reaisParaPesoChileno (double digitarValorEmReais) {
		double cotacaoDePesoChileno =  0.0056;
		
		double resultadoDaConvercao = digitarValorEmReais * cotacaoDePesoChileno;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Peso Chileno : " + valorEmPoucosDecimais + "$");
	  
	  
	  int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	  
	    
	   if(continuar == 0) {
		   JOptionPane.showMessageDialog(null, "Você será direcionado para o menu inicial");	
	  		
		   converterDeReaisParaOutasMoedas.deReaisParaOutrasmoedas();
	   }
	   
	   if(continuar == 1) {
		   
		   JOptionPane.showMessageDialog(null, "Programa finalizado");
	  		
	   }
	   
	   if(continuar == 2) {
		   
		   JOptionPane.showMessageDialog(null, "Programa conclúdo");	
	  		
	   }
 
}
}
