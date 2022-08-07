package entities;

import java.util.ArrayList;

public class Matrix {

	private ArrayList<ArrayList<Integer>> matrix;
	private int length;

	public Matrix() {
		this.matrix = new ArrayList<>();
		this.matrix.add(new ArrayList<>());
		this.matrix.get(0).add(0);
		this.length = getMatrixSize();
	}

	public Matrix(int size) {
		this.matrix = new ArrayList<>();
		this.matrix.add(new ArrayList<>());
		this.matrix.get(0).add(0);
		this.length = getMatrixSize();
		upSize(size - 1);
	}

	public void upSize() {
		length++;
		// add one element to the last position on the Y array, with an array full of
		// zeroes
		ArrayList<Integer> aux = new ArrayList<>();
		for (int i = 0; i <= length; i++) {
			aux.add(0);
		}
		matrix.add(aux);

		// sets zeroes on last position of all existing arrays inside the Y array
		for (int i = 0; i < length; i++) {
			matrix.get(i).add(0);
		}
	}

	public int getValueFrom(int x, int y) {
		return matrix.get(y).get(x);
	}

	public void upSize(int length) {
		for (int i = 0; i < length; i++) {
			upSize();
		}
	}

	public int getMatrixSize() {
		return matrix.size();
	}

	public void setOn(int x, int y, Integer value) {
		matrix.get(y).set(x, value);
	}

	public void setAdjacencyOn(int x, int y, Integer value) {
		if (x != y) {
			matrix.get(y).set(x, value);
			matrix.get(x).set(y, value);
		}
	}

	public void resetAdjacency() {
		for (int i = 0; i < getMatrixSize(); i++) {
			for (int j = 0; j < getMatrixSize(); j++) {
				matrix.get(i).set(j, 0);
			}
		}
	}

	public void reset() {
		this.matrix = new ArrayList<>();
		this.matrix.add(new ArrayList<>());
		this.matrix.get(0).add(0);
		this.length = 0;
	}

	public void print() {
		System.out.printf("length: %d\n", length);
		String numberTable = "| + | ";
		for (int i = 0; i < getMatrixSize(); i++) {
			numberTable += i + " | ";
		}
		System.out.println(numberTable);
		for (int i = 0; i < getMatrixSize(); i++) {
			System.out.printf("| %d | ", i);
			for (int j = 0; j < getMatrixSize(); j++) {
				System.out.printf("%d | ", matrix.get(i).get(j));
			}
			System.out.println();
		}
	}

}
