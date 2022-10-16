package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDePesoChilenopParaReais {

	convertendoDeOutasMoedasParaReais converterDeOutrasMoedasParaReias = new convertendoDeOutasMoedasParaReais();

	
	@SuppressWarnings("static-access")
	public void pesoChilenoParaReais (double digitarValorEmPesoChileno) {
		double cotacaoDoReal =  0.0056;
		
		double resultadoDaConvercao =  cotacaoDoReal  * digitarValorEmPesoChileno;
		
		
	  JOptionPane.showMessageDialog(null, "O valor da converção em Reais é : R$ " + resultadoDaConvercao);

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
