package view;

import controller.MatrizController;

public class Principal {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			Thread t = new MatrizController(i);
			t.start();
		}

	}

}
