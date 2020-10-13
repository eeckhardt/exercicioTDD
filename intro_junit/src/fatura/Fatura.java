package fatura;

import java.util.Date;


public class Fatura {
	
	
	private String nome;
	private double valorTotal;
	private Date data;
		

	
	public Fatura(String nome, double valorTotal, Date data) {
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
