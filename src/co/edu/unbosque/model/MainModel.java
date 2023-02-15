package co.edu.unbosque.model;

public class MainModel {

	int returnableData = 0;
	int remain;
	private int i = 0;
	private char aux;

	public MainModel() {

	}

	public String opcionUno(int target) {

		returnableData = 0;
		remain = 0;
		return "El número invertido es: " + invertirNumero(target);
	}

	public int invertirNumero(int target) {

		// System.out.println("Resto: " + remain); //Debug

		if (target < 1) {
			return returnableData;
		} else {

			remain = target % 10;
			returnableData = returnableData * 10 + remain;
			return invertirNumero(target / 10);
		}

	}

	public String opcionDos(String target) {
		aux = 0;
		i = 0;
		if (target == null || target.equals("")) {
			return "Por favor, ingrese una palabra";
		} else {
			char[] targetChars = target.toCharArray();
			invertirPalabra(targetChars, 0);
			return "La palabra invertida es: " + String.copyValueOf(targetChars);
		}

	}

	public void invertirPalabra(char[] target, int iterator) {
		if (iterator == target.length) {
			return;
		}

		invertirPalabra(target, iterator + 1);

		if (i <= iterator) {
			aux = target[iterator];
			target[iterator] = target[i];
			target[i++] = aux;
		}
	}

}
