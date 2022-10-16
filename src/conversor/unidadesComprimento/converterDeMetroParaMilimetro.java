package conversor.unidadesComprimento;

import javax.swing.JOptionPane;

public class converterDeMetroParaMilimetro {
	
	ConvertendoDeUnidadeGrandesParaPequenas tranformarDeDecamentoParaCentimetro = new ConvertendoDeUnidadeGrandesParaPequenas();
	
	@SuppressWarnings("static-access")
	public void converterDEMetroParaMilimetro (double digitarValorEmMetro) {
		 double valorDeUmMilimetro =   1000;
		
		double resultadoDaConvercao =  valorDeUmMilimetro  * digitarValorEmMetro;
		
		
	  JOptionPane.showMessageDialog(null, "O resulatdo da converção é : " + resultadoDaConvercao + "mm");
	  	  
	  
	  int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	  
	    
	   if(continuar == 0) {
		   
		   JOptionPane.showMessageDialog(null, "Você será direcionado para o menu inicial");	
	  		
		   tranformarDeDecamentoParaCentimetro.unidadesGrandesParaPequenas();
	   }
	   
	   if(continuar == 1) {
		   
		   JOptionPane.showMessageDialog(null, "Programa finalizado");
	  	
	   }
	   
	   if(continuar == 2) {
		   
		   JOptionPane.showMessageDialog(null, "Programa conclúdo");	
	  		
	   }
 
	}
}
