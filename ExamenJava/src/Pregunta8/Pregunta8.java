package Pregunta8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pregunta8 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	List<String> paises= new ArrayList<>();
	paises.add("Sudafrica");
	paises.add("Egipto");
	paises.add("Turquia");
	paises.add("Rusia");
	paises.add("China");
	paises.add("India");
	
	
	List<String> paises2 = new ArrayList<>();
	paises2.add("Francia");
	paises2.add("México");
	paises2.add("Australia");
	paises2.add("Italia");
	paises2.add("Argentina");
	paises2.add("Brasil");
	
	List merged = new ArrayList(paises);
    merged.addAll(paises2);
    
    Collections.sort(merged);
    
    List definitiva = new ArrayList(merged);
    
    System.out.println(definitiva);

}}
