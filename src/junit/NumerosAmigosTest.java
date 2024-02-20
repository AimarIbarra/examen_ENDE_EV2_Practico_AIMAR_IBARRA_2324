package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumerosAmigosTest {

	@Test
	public void testAmigoMal() {
		assertFalse(new NumerosAmigos(100, 200).amigo());
	}
	
	@Test
	public void testAmigoPerfecto() {
		assertTrue(new NumerosAmigos(496, 496).amigo());
	}

	@Test
	public void testEsCeroN1() {
		assertNull(new NumerosAmigos(1, 0).esN1IgualAN2());
	}

	@Test
	public void testN1yN2SonIguales() {
		assertEquals(new NumerosAmigos(1, 1).esN1IgualAN2(), (Integer) 1);
	}

	@Test
	public void testN1yN2NoSonIguales() {
		assertNotEquals(new NumerosAmigos(1, 3).esN1IgualAN2(), (Integer) 1);
	}

}
