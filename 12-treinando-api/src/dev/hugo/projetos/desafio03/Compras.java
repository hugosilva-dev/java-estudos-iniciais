package dev.hugo.projetos.desafio03;

public class Compras {
	
	private String item;
	private double valor;
	
	public Compras(String item, double valor) {
		this.item = item;
		this.valor = valor;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "\r\nItem: " + item + ", valor: " + valor;
	}
	
	

}
