package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaDolar {
	
	convertendoDeReaisParaOutrasMoedas converterDeReaisParaOutasMoedas = new convertendoDeReaisParaOutrasMoedas();

	@SuppressWarnings("static-access")
	public void reaisParaDolar (double digitarValorEmReais) {
		double cotacaoDoDolar =  5.41;
		
		double resultadoDaConvercao = digitarValorEmReais * cotacaoDoDolar;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Dólar é : $ " + valorEmPoucosDecimais);

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
