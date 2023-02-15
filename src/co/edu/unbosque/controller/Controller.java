package co.edu.unbosque.controller;

import co.edu.unbosque.model.MainModel;
import co.edu.unbosque.view.ConsoleView;

public class Controller {

	private ConsoleView CV;
	private String response;
	private String internalResponse;
	private MainModel MM;

	public Controller() {
		CV = new ConsoleView();
		MM = new MainModel();
		funcionar();
	}

	public void funcionar() {

		response = "";
		do {
			CV.showMessage("Bienvenido\n" + "1. Invertir número\n" + "2. Invertir palabra\n" + "3. Salir");
			response = CV.readString();
			switch (response) {
			case "1", "1.", "1. Invertir número", "invertir número":
				CV.showMessage("Ingrese el número a invertir: ");
				internalResponse = CV.readString();
				CV.showMessage(MM.opcionUno(Integer.parseInt(internalResponse)));
				break;
			case "2", "2.", "2. Invertir palabra", "invertir palabra":
				CV.showMessage("Ingrese la palabra a invertir: ");
				internalResponse = CV.readString();
				CV.showMessage(MM.opcionDos(internalResponse));
				break;
			case "3", "salir", "3. Salir":
				CV.showMessage("Gracias por usar el software");
				break;
			default:
				CV.showMessage("Opción inválida, inténtelo de nuevo");
				continue;
			}
		} while (!response.equals("3"));

	}
}
