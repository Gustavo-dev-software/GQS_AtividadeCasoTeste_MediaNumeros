package mediaTestJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import media.Media;

class MediaTest {

	@Test
	public void media3Numeros() {
		Media med3 = new Media();
		assertEquals(med3.media3(4, 3, 2), 3.0);
		assertEquals(med3.media3(20, 40, 3), 21.0);
		assertEquals(med3.media3(13, 3, 5), 7.0);
	}
	
	@Test
	public void media2Numeros() {
		Media med2 = new Media();
		assertEquals(med2.media2(4, 3), 3.5);
		assertEquals(med2.media2(20, 40), 30.0);
		assertEquals(med2.media2(13, 3), 8.0);
	}

}
