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
		matrix.setAdjacencyOn(i, j, (double)P);
	}
	
	public void remove_adjacencia(int i, int j) {
		matrix.removeAdjacencyOn(i, j);
	}
	
	public void imprime_adjacencias() {
		matrix.print();
	}
	
	public void seta_informacao(int i, String V) {
		nodes.get(i).setValue(V);
	}
	
	public int adjacentes(int i) {
		return matrix.getAdjacenciesCountFrom(i);
	}
	
	public int adjacentes(int i, ArrayList<Double> adj) {
		int totalAdjacencies = matrix.getAdjacenciesCountFrom(i);
		int matrixLength = matrix.getMatrixSize();
		
		for(int index = 0; index < matrixLength; index++) {
			if(matrix.getAdjacencyOf(i, index) != matrix.getNoAdjacencyValue()) {
//				adj.add(matrix.getAdjacencyOf(i, index));
				adj.add((double) index);
			}
		}
		return totalAdjacencies;
	}

}