package app;

import entities.Graph;

public class Main {

	public static void main(String[] args) {
		Graph grafo = new Graph(5);
		grafo.cria_adjacencia(4, 3, 2);
		grafo.cria_adjacencia(4, 2, 9);
		grafo.imprime_adjacencias();
		int node = 4;
		System.out.printf("Total adjacencies for %d: %d\n", node,grafo.adjacentes(node));
		System.out.printf("Total adjacencies for %d: %d\n", 2,grafo.adjacentes(2));
	}

}
