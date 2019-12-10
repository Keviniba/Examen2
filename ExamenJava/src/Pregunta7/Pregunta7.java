package Pregunta7;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Pregunta7 {
	public static void main(String[] args) throws IOException {
		Pregunta7 instance = new Pregunta7();
		instance.obtenerPersonaje("a1234");
		;
	}

	public void obtenerPersonaje(String llave) throws IOException {
		Map<String, String> personas = new HashMap<String, String>();
		personas.put("a1234", "Steve Jobs");
		personas.put("a1235", "Scott McNealy");
		personas.put("a1236", "Jeff Bezos");
		personas.put("a1237", "Larry llison");
		personas.put("a1238", "Bill Gates");
		String idUsuario = personas.get(llave);
		FileOutputStream salida = null;
		salida = new FileOutputStream("C:\\Users\\curso\\Downloads\\EntradaYSalida.txt");
		byte[] lineInBytes = idUsuario.getBytes();
		salida.write(lineInBytes);
		salida.flush();
		salida.close();

	}

}
