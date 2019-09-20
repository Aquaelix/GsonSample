import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Persona p = new Persona();
		
		do {
			System.out.println("Introduce tu nombre: ");
			p.setNombre(in.nextLine());
		}while(!p.getNombre().matches("^([a-z ραινσϊ]{2,60})$"));
		
		do {
		System.out.println("Ahora tu apellido: ");
		p.setApellidos(in.nextLine());
		}while(!p.getApellidos().matches("^([a-z ραινσϊ]{2,60})$"));
		
		do {
			System.out.println("Para acabar, introduce la edad: ");
			p.setEdad(in.nextInt());
		}while(p.getEdad()<1 || p.getEdad()>100);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		in.close();
	}

}
