package conversor.unidadesComprimento;

import javax.swing.JOptionPane;

public class converterDeDecametroParaCentimetro {
	
	ConvertendoDeUnidadeGrandesParaPequenas tranformarDeDecamentoParaCentimetro = new ConvertendoDeUnidadeGrandesParaPequenas();
	
	@SuppressWarnings("static-access")
	public void converterDEDecametroParaCentimetro (double digitarValorEmDecametro) {
		 long valorDeUmCentimetro =  1000;
		
		double resultadoDaConvercao =  valorDeUmCentimetro  * digitarValorEmDecametro;
			
	  JOptionPane.showMessageDialog(null, "O valor da converção é : " + resultadoDaConvercao + "cm");
	  
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
