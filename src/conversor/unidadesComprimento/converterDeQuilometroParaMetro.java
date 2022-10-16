package conversor.unidadesComprimento;

import javax.swing.JOptionPane;

public class converterDeQuilometroParaMetro {
	
	ConvertendoDeUnidadeGrandesParaPequenas tranformarDeDecamentoParaCentimetro = new ConvertendoDeUnidadeGrandesParaPequenas();
	

	@SuppressWarnings("static-access")
	public void converterDEQuilometroParaaMetro (double digitarValorEmQuilometro) {
		double valorDeUmMetro =   1000;
		double resultadoDaConvercao =  valorDeUmMetro * digitarValorEmQuilometro;
		
	  JOptionPane.showMessageDialog(null, "O valor da converção em Metro  : " + resultadoDaConvercao + "m");
	  	  
	  
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
