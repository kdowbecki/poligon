package poligon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class AppTest {

  @Mock
  Object mock;

  @InjectMocks
  App sut;

  @Test
  void shouldSupportLombok() {
    assertThat(sut.getVersion()).isEqualTo("1");
  }

  @Test
  void shouldSupportMockito() {
    assertThat(mock).isNotNull();
  }

}
