
public class Metodos extends Thread{
	private String nome;
	
	public Metodos(String nome) {
		this.nome = nome;
		start();
	}
	
	public void run() {
		System.out.println(nome);
	}
}
