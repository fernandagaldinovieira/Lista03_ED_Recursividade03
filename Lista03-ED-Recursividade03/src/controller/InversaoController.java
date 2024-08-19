package controller;

public class InversaoController {

	public InversaoController() {
		super();
	}

	public String Inversao(String input) {
		
		//Condição de parada: Se a string estiver vazia ou com um  caractere
		if (input.isEmpty()) {
			return input;
		} else {
			return input.substring(input.length() - 1) + Inversao(input.substring(0, input.length() - 1));
		}
	}
}
