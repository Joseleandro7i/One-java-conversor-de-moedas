package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeEuroParaReais {
	
	convertendoDeOutasMoedasParaReais converterDeOutrasMoedasParaReias = new convertendoDeOutasMoedasParaReais();

		
	@SuppressWarnings("static-access")
	public void EuroParaReais (double digitarValorEmEuro) {
		double cotacaoDoReal =  5.29;
		
		double resultadoDaConvercao =  cotacaoDoReal  / digitarValorEmEuro;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);	
	  JOptionPane.showMessageDialog(null, "O valor da converção em Reais é : R$ " + valorEmPoucosDecimais);

	  int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	  
	    
	   if(continuar == 0) {
		   JOptionPane.showMessageDialog(null, "Você será direcionado para o menu inicial");	
	  		
		   converterDeOutrasMoedasParaReias.converte();
	   }
	   
	   if(continuar == 1) {
		   
		   JOptionPane.showMessageDialog(null, "Programa finalizado");
	  		
	   }
	   
	   if(continuar == 2) {
		   
		   JOptionPane.showMessageDialog(null, "Programa conclúdo");	
	  		
	   }
 
	  
	  
	}
}
