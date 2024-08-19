package view;

import controller.InversaoController;

public class Principal {

	public static void main(String[] args) {

		InversaoController inversao = new InversaoController();
		
		String input = "teste";
		String resultado = inversao.Inversao(input);
		
		System.out.println("Entrada: " + input + "\n" + "Saída: " + resultado);
		
	}
}
