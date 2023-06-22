package loja;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loja {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Pedro Garcia Avila", "Av. Getulio Vargas, 226", "51995111395", "pedroavila@gmail.com", "cachorrinho123");
		Cliente cliente2 = new Cliente("Pedro Garcia Avila2", "Av. Getulio Vargas, 226", "51995111395", "pedroavila@gmail.com", "cachorrinho123");
		
		Produto produto = new Produto("Camiseta", "Camiseta de algodão",29.99, 10);
		Produto produto2 = new Produto("Camiseta", "Camiseta de algodão",29.99, 9);

		ArrayList<Produto> produtoPedido = new ArrayList<>();
		produtoPedido.add(produto);
		ArrayList<Produto> produtoPedido2 = new ArrayList<>();
		produtoPedido2.add(produto2);
		
		Pedido pedido = new Pedido(produtoPedido, new Date(), "Em andamento", cliente);
		Pedido pedido2 = new Pedido(produtoPedido, new Date(), "Em andamento", cliente2);

		cliente.adicionarPedido(pedido);
		cliente2.adicionarPedido(pedido2);

		List<Pedido> pedidosCliente = cliente.getPedidos();
		System.out.println("Pedidos do cliente 1:");
		for(Pedido pedidos: pedidosCliente) {
			System.out.println("Número do pedido: " + pedidos.getNumeroPedido());
		}
		
		List<Pedido> pedidosCliente2 = cliente2.getPedidos();
		System.out.println("Pedidos do cliente 2:");
		for(Pedido pedidos: pedidosCliente2) {
			System.out.println("Número do pedido: " + pedidos.getNumeroPedido());
		}
	}
}