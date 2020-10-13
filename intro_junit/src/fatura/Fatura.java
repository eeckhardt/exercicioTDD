package fatura;

import java.util.Date;


public class Fatura {
	
	
	private String nome;
	private double valorTotal;
	private String data;
		

	
	public Fatura(String nome, double valorTotal, String data) {
		super();
		this.nome = nome;
		this.valorTotal = valorTotal;
		this.data = data;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getvalorTotal() {
		return valorTotal;
	}
	public void setvalorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
