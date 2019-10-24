package hello2;

import static org.junit.Assert.*;

import org.junit.Test;

import hello2.hello.A;

public class HelloTest {

	@Test
	public void test() {
		hello h = new hello();
		A a = new hello.A();
		a.dummy(4);
	}

}
