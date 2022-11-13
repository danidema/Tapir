package tapir;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Logica.Infectado;

public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
			
		
		// Testing setup for Account class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("Logica.Infectado.setDaño", "d"); //dañar
		mapMethodsToSymbols.put("Logica.Infectado.recibirDaño", "r"); //recibe daño
		mapMethodsToSymbols.put("Logica.Infectado.cargar", "p"); //arroja un premio
		//Definition of the regular expression
		regularExpression = Pattern.compile("(d|r)*.p");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Account class is testing is store in a TestingInformation instance
		TestingInformation ti = new TestingInformation(Infectado.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(Infectado.class.toString(), ti);
}
	
}
