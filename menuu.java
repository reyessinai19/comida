package proyectomenu;

import java.util.Scanner;

public class menuu {
	
	public static void main(String[] args) {
		
		//CREAR MENU DE BUFET
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Hola, bienveido al restaurant La Academia");
		System.out.println("Quisiera ordenar algo?");
		System.out.println("Nuestras especialidades son las siguientes: \n1.- Tacos suabes \n2.- Empanadas \n3.- Caldo de pollo \n4.- banderillas"); //IMPRIMIMOS LAS OPCIONES DEL MENU
		int opcionComida = teclado.nextInt(); //INTRODUCIMOS POR TECLADO QUE OPCION QUEREMOS
		
		switch(opcionComida) {
		
		case 1 : System.out.println("En un momento te traigo tus tacos suabes"); //PONEMOS CADA UNO DE LOS PASOS ELEGIDOS
		break;
		case 2 : System.out.println("En un momento te traigo tus empanadas ");
		break;
		case 3 : System.out.println("En un momento te traigo tu caldo de pollo");
		break;
		case 4 : System.out.println("En un momento te traigo tus banderillas");
		break;
		
		
		
		
		}
		
		
		System.out.println("gusta algo de tomar?");
		System.out.println("tenemos los siguientes refrescos: \n1.- coca cola \n2.- pepsi \n3.- horchata \n4.- Sangria"); //IMPRIMIMOS LAS OPCIONES DEL MENU
		int opcionBebida = teclado.nextInt(); //INTRODUCIMOS POR TECLADO QUE OPCION QUEREMOS
		
        switch(opcionBebida) {
		
		case 1 : System.out.println("En un momento te traigo tu coca cola"); //PONEMOS CADA UNO DE LOS PASOS ELEGIDOS
		break;
		case 2 : System.out.println("En un momento te traigo tu pepsi");
		break;
		case 3 : System.out.println("En un momento te traigo tu horchata");
		break;
		case 4 : System.out.println("En un momento te traigo tu sangria");
		break;
		
		
		
		}
		
        System.out.println("gusta alguno de nuestros postres?");
		System.out.println("tenemos los siguientes postres: \n1.- helado \n2.- pay de queso \n3.- flan napolitano \n4.- hamburguesa");//IMPRIMIMOS LAS OPCIONES DEL MENU
		int opcionPostre = teclado.nextInt(); //INTRODUCIMOS POR TECLADO QUE OPCION QUEREMOS
		
        switch(opcionPostre) {
		
		case 1 : System.out.println("En un momento te traigo tu healdo"); //PONEMOS CADA UNO DE LOS PASOS ELEGIDOS
		break;
		case 2 : System.out.println("En un momento te traigo tu pay de queso");
		break;
		case 3 : System.out.println("En un momento te traigo tu flan napolitano");
		break;
		case 4 : System.out.println("En un momento te traigo tu hamburguesa");
		break;
		
		
		
		
	}
        
        System.out.println("Excelente mi estimad@ cliente, en un momento le pasamos su orden para que la disfrute y gracias por elegir este lugar");
        
  
	}

	/*SINAI MORALES REYES 2DO ISC SABADOS MATUTINO
	 */
}
