package poligon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AppTest {

	@Mock
	Object mock;

	App sut = new App();

	@Test
	void shouldSupportLombok() {
		assertThat(sut.getVersion()).isNotBlank();
		assertThat(mock).isNotNull();
	}

}
