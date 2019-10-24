package pack;
import classe.hello;
import static org.junit.Assert.*;

import org.junit.Test;

public class helloTest {

		@Test
		public void test() {
			assertEquals(3,hello.somme(1,2));
	}

}
