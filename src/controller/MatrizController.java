package controller;

import java.util.Random;

public class MatrizController extends Thread {
	private int num;
	private int i;
	private int resul;
	private Random r = new Random();

	public MatrizController(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		sum();
	}

	private void sum() {
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int j = 0; j < 5; j++) {
			num = r.nextInt(9);
			resul += num;
			if(j==4) {
				System.out.print(" " + num);
			}else {
				System.out.print(" " + num + " +");
			}
		}
		System.out.println();
		System.out.println("Thread => " + i + " = " + resul);
		System.out.println("");
	}
}