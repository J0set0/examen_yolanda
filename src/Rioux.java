
public class Rioux {

	public static void main(String[] args) {
		
		int [] array = {11,3,28,4,1,12,111};
		System.out.println(sumaPares(array));
	}
	
	public static int sumaPares(int[] array) {
		
		
		int suma=0;
		
		if(array==null) {
			suma=0;
		}
		if(array.length==0) {
			suma=0;
		}
		
		for (int i = 0; i < array.length; i++) {
			if( (array[i] % 2 == 0) && (array[i] % 4 == 0)) {
				suma=suma + array[i];
			}
		}
		return suma;
		
	}
}
