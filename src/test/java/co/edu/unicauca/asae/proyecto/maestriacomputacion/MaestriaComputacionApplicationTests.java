package co.edu.unicauca.asae.proyecto.maestriacomputacion;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaestriaComputacionApplicationTests {

	@Test
	void contextLoads() {
		String var = "2";
		assertThat("2",var);
	}

}
