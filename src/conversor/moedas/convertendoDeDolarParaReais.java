package conversor.moedas;

import javax.swing.JOptionPane;

public class convertendoDeDolarParaReais {
	
	convertendoDeOutasMoedasParaReais converterDeOutrasMoedasParaReias = new convertendoDeOutasMoedasParaReais();

	@SuppressWarnings("static-access")
	public void dolarParaReais (double digitarValorEmDolar) {
		double cotacaoDoReal =  5.39;
		
		double resultadoDaConvercao = digitarValorEmDolar / cotacaoDoReal;
		
		double valorEmPoucosDecimais =  Math.round(resultadoDaConvercao);
		
		JOptionPane.showMessageDialog(null, "O valor da converção é Reais : R$ " + valorEmPoucosDecimais);
	  
	    int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
	  
	    System.out.println(continuar);
	    
	   if(continuar == 0) {
		   JOptionPane.showMessageDialog(null, "Você será direcionado para o menu inicial");	
	  		
		   converterDeOutrasMoedasParaReias.converte();
	   }
  
	}
}
