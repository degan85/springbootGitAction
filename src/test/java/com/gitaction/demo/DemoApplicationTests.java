package com.gitaction.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertThat(true).isTrue();
	}

}
