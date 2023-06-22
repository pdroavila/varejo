package loja;

public class Loja {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Pedro Garcia Avila", "Av. Getulio Vargas, 226", "51995111395", "pedroavila@gmail.com", "cachorrinho123");
		
		System.out.println(cliente.getDados());
	}
}
