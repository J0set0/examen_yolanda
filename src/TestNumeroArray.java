import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNumeroArray {


	@Test
	void prueba1() {
		
		int [] array = {};
		int numero=0;
		assertEquals(-1, NumeroArray.buscarNumeroArray(array,numero));
	}
	@Test
	void prueba2() {
		int [] array = {2,6,8,-2,-6,-8};
		int numero=10;
		assertEquals(-1, NumeroArray.buscarNumeroArray(array,numero));
	}
	@Test
	void prueba3() {
		int [] array = {2,6,8};
		int numero=2;
		assertEquals(1, NumeroArray.buscarNumeroArray(array,numero));
	}
	@Test
	void prueba4() {
		int [] array = {-2,-6,-8};
		int numero=-4;
		assertEquals(-1, NumeroArray.buscarNumeroArray(array,numero));
	}
	@Test
	void prueba5() {
		int [] array = {2,6,8,-2,-6,-8};
		int numero=8;
		assertEquals(1, NumeroArray.buscarNumeroArray(array,numero));
	}
}
