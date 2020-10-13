package boleto;

import java.util.Date;

public class Boleto {
	

	private String codigo;
	private double valorPago;
	private String data;
	

	
	public Boleto(String codigo, double valorPago, String data) {
		super();
		this.codigo = codigo;
		this.valorPago = valorPago;
		this.data = data;
		
	}
	
	public String getcodigo() {
		return codigo;
	}
	public void setcodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getvalorPago() {
		return valorPago;
	}
	public void setvalorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}
