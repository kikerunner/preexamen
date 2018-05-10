package preexamen;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;

class PreexamenTest {

	@Test
	public void locatetest() throws Exception {
		Preexamen point = new Preexamen();
		try {
			point.locate(0, 0);
			fail("Error");
		} catch (Exception e) {
			// Todo : handle exception
		}
	}

	@Test
	public void ComprobarSiSonMenoresaCero() throws Exception {
		Preexamen point = new Preexamen();
		assertEquals(new Point(4, 5), point.locate(-4, -5));
	}

	@Test
	public void testIfGetAreaMakeArea() throws Exception {
		Preexamen Double = new Preexamen();
		try {
			Double.getArea(0.0, 0.0, 0.0);
			fail("Error");
		} catch (Exception e) {
			// Todo : handle exception
		}
	}

	@Test
	public void testIfGetAreaMakeTriangle() {
		Preexamen Double = new Preexamen();
		Preexamen point = new Preexamen();

		assertTrue((79.79309180624598 - point.getArea(21, 20, 8)) < 0.0000001);
	}

	@Test
	public void testIfConcat() throws Exception {
		Preexamen Atributos = new Preexamen();
		try {
			Atributos.concat(false, null, null);
			fail("Error");
		} catch (Exception e) {
			// Todo : handle exception
		}
	}

	@Test
	public void testIfConcatNull() {
		Preexamen Atributos = new Preexamen();
		assertEquals(Atributos.concat(true, "HOLA", "QUETAL"), "holaquetal");

	}
}
