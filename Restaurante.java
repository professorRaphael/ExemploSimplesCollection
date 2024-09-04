package Java.poo.agrupamento;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Restaurante {

    private Set<TipoPrato> pratosUnicos = new HashSet<>();
    private List<Pedido> pedidos = new ArrayList<>();
    private Queue<Pedido> filaPedidos = new LinkedList<>();
    private Deque<Pedido> acoesChef = new LinkedList<>();

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        restaurante.adicionarPedidos();
        restaurante.processarPedidos();
        restaurante.exibirInformacoes();
        restaurante.exibirPratosUnicos();
    }

    public void adicionarPedidos() {
        Pedido pedido1 = new Pedido(1, TipoPrato.PIZZA_4_QUIEJOS);
        Pedido pedido2 = new Pedido(2, TipoPrato.HAMBURGUER_COM_BATATAS);
        Pedido pedido3 = new Pedido(3, TipoPrato.SALADA_CAESAR);

        pratosUnicos.add(pedido1.getPrato());
        pratosUnicos.add(pedido2.getPrato());
        pratosUnicos.add(pedido3.getPrato());

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        filaPedidos.add(pedido1);
        filaPedidos.add(pedido2);
        filaPedidos.add(pedido3);
    }

    public void processarPedidos() {
        acoesChef.offer(filaPedidos.poll());
        acoesChef.offer(filaPedidos.poll());
    }

    public void exibirInformacoes() {
        System.out.println("Pratos Únicos Pedidos: " + pratosUnicos);
        System.out.println("Ordem dos Pedidos: " + pedidos);
        System.out.println("Fila de Pedidos: " + filaPedidos);
        System.out.println("Ações do Chef: " + acoesChef);
    }
    
    public void exibirPratosUnicos() {
        pratosUnicos.forEach(prato -> System.out.println("Prato único: " + prato));
    }
}
