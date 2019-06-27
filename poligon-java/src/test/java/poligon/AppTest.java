package poligon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {

	@Test
	void testAppHasAGreeting() {
		App sut = new App();
		assertNotNull(sut.getGreeting());
	}

}
