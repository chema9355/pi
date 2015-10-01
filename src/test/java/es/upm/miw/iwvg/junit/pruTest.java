package es.upm.miw.iwvg.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class pruTest {
	private pru pr;
	
	@Before
	public void before()
	{
		pr=new pru(2);
	}
	
	@Test
	public void testGet()
	{
		assertEquals(2, pr.getnum());
	}
}
