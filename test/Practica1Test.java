import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import practica1.Practica1;

public class Practica1Test {

	List<Double> listaReal = new ArrayList<Double>();
	List<Double> listaEsperada = new ArrayList<Double>();

	@Before
	public void setListas() throws Exception {
		// setear lista real
		listaReal.add(Practica1.suma(2, 1));
		listaReal.add(Practica1.suma(-1, 2));
		listaReal.add(Practica1.suma(2, -1));
		listaReal.add(Practica1.resta(2, 1));
		listaReal.add(Practica1.resta(1, 2));
		listaReal.add(Practica1.resta(2, -1));
		listaReal.add(Practica1.multiplicacion(2, 1));
		listaReal.add(Practica1.multiplicacion(-1, 2));
		listaReal.add(Practica1.multiplicacion(1, -2));
		listaReal.add(Practica1.division(2, 1));
		listaReal.add(Practica1.division(-2, 1));
		listaReal.add(Practica1.division(2, -1));
		listaReal.add(Practica1.division(0, 2));
		listaReal.add(Practica1.division(2, 0));
		// setear lista esperada
		listaEsperada.add(3.0);
		listaEsperada.add(1.0);
		listaEsperada.add(1.0);
		listaEsperada.add(1.0);
		listaEsperada.add(-1.0);
		listaEsperada.add(3.0);
		listaEsperada.add(2.0);
		listaEsperada.add(-2.0);
		listaEsperada.add(-2.0);
		listaEsperada.add(2.0);
		listaEsperada.add(2.0);
		listaEsperada.add(2.0);
		listaEsperada.add(0.0);
		listaEsperada.add(0.0);
	}

	@Test
	public void testOperaciones() {
		try {
		assertEquals(listaReal, listaEsperada);
		}catch(AssertionError e) {
			throw new AssertionError("El resultado de la lista, es diferente del esperado. " + e);
		}
	}
}
