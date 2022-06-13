
public class NumeroArray {

	public static void main(String[] args) {
		
		int [] array = {3,-5,22,4,52,31,14,20,6};
		
		int numero = 4;
		
		System.out.println(buscarNumeroArray(array, numero));
		
	}

	public static int buscarNumeroArray(int[] array, int numero) {
		
		int encontrado = -1;
		
		if(array.length==0) {
			
			encontrado = -1;
		}else {
			for (int i = 0; i < array.length; i++) {
				if(array[i]==numero) {
					encontrado = 1;
				}
			}
		}
		
		
		
		return encontrado;
			
	
	}
}
