package entities;

import java.util.ArrayList;

public class Graph {

	private ArrayList<Nodes> nodes;
	private Matrix matrix;
	
	public Graph() {
		nodes = new ArrayList<>();
		matrix = new Matrix();
	}
	
	public Graph(int nodeQuantity) {
		nodeQuantity--;
		nodes = new ArrayList<>();
		matrix = new Matrix();
		for(int i = 0; i < nodeQuantity; i++) {
			addNode();
		}
	}
	
	public void addNode() {
		nodes.add(new Nodes());
		matrix.upSize();
	}
	
	public void cria_adjacencia(int i, int j, int P) {
		matrix.setAdjacencyOn(i, j, P);
	}
	
	public void remove_adjacencia(int i, int j) {
		matrix.setAdjacencyOn(i, j, 0);
	}
	
	public void imprime_adjacencias() {
		matrix.print();
	}
	
	public void seta_informacao(int i, String V) {
		nodes.get(i).setValue(V);
	}
	
	public int adjacentes(int i/*, adj*/) {
		int cont = 0;
		for(int j = 0; j < matrix.getMatrixSize(); j++) {
			int value = matrix.getValueFrom(i, j);
			if(value != 0) {
				cont++;
			}
		}
		return cont;
	}
	
}
