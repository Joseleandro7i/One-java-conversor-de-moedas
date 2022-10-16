package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeReaisParaEuro {
	
	convertendoDeReaisParaOutrasMoedas converterDeReaisParaOutasMoedas = new convertendoDeReaisParaOutrasMoedas();

		@SuppressWarnings("static-access")
		public void reaisParaEuro (double digitarValorEmReais) {
			double cotacaoDoEuro =  5.29;
			
			double resultadoDaConvercao = digitarValorEmReais * cotacaoDoEuro;
			
			double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
		  JOptionPane.showMessageDialog(null, "O valor da converção em Euro é : " + valorEmPoucosDecimais + "€");

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
