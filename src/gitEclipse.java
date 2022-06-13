
public class gitEclipse {

	public static void main(String[] args) {
		
		String palabra="mañana me voy a la playa";
		
		buscarVocales(palabra);
	}
	
	public static void buscarVocales(String palabra) {
		int contA=0;
		int contE=0;
		int contI=0;
		int contO=0;
		int contU=0;
		
		for (int i = 0; i < palabra.length(); i++) {
			if(String.valueOf(palabra.charAt(i)).equals("a")) {
				contA= contA + 1;
				
			}
			if(String.valueOf(palabra.charAt(i)).equals("e")) {
				contE= contE + 1;
				
			}
			if(String.valueOf(palabra.charAt(i)).equals("i")) {
				contI= contI + 1;
				
			}
			if(String.valueOf(palabra.charAt(i)).equals("o")) {
				contO= contO + 1;
				
			}
			if(String.valueOf(palabra.charAt(i)).equals("u")) {
				contU= contU + 1;
				
			}
		}
		System.out.println("A => " + contA);
		System.out.println("E => " + contE);
		System.out.println("I => " + contI);
		System.out.println("O => " + contO);
		System.out.println("U => " + contU);
		
	}
}
