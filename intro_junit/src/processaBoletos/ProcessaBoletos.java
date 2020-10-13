package processaBoletos;

import java.util.ArrayList;
import java.util.Iterator;

import boleto.Boleto;

public class ProcessaBoletos {
	
	
private static ArrayList items;
	
	public ProcessaBoletos(ArrayList Boleto) {
		items = Boleto;
	}
	

	public static double getValorTotal() {
		double valorTotal = 0.0;
		
		for (Iterator i = items.iterator(); i.hasNext();) {
			Boleto items = (Boleto) i.next();
			valorTotal += items.getvalorPago();
		}
		
		return valorTotal;
	}
	
	public static String Verfica(double valorTotal, double valorFatura) {
		
		if (valorTotal == valorFatura) {
			return "Fatura Paga";			
		}
		return "Fatura em Aberto";
			
		
	}

}
