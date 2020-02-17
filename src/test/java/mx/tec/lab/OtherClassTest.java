package mx.tec.lab;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		OtherClass x = new OtherClass();
		assertEquals(2, x.multiply(2, 1));
	}
	
	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass x = new OtherClass();
		assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> { x.multiply(1000, 1); });			
	}

}
