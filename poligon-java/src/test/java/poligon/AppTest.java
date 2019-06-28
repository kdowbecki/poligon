package poligon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AppTest {

	private App sut = new App();

	@Test
	void shouldSupportLombok() {
		assertThat(sut.getVersion()).isNotBlank();
	}

}
