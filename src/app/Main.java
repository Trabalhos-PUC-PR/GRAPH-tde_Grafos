/*
 * André Luiz Kovalski
 * Bruno Leite Franco
 * Pedro Amadeu
 * Theo César
 */

package app;

import java.util.ArrayList;

import entities.Graph;

public class Main {

	public static void main(String[] args) {
		
		Graph grafo = new Graph(5);
		grafo.cria_adjacencia(4, 3, 2);
		grafo.cria_adjacencia(4, 2, 9);
		grafo.cria_adjacencia(4, 4, 3);
		grafo.cria_adjacencia(0, 4, 70);
		grafo.cria_adjacencia(2, 2, 4);
		grafo.imprime_adjacencias();
		
		ArrayList<Double> adjacentes = new ArrayList<>();
		System.out.printf("Total adjacencies for %d: %d\n", 4,grafo.adjacentes(4, adjacentes));
		
		for(Double d: adjacentes) {
			System.out.printf("%.0f\n",d);
		}
	}

}
