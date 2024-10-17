package com.mycompany;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloBootApplicationTests {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("===> beforeAll()");
	}
	
	@BeforeEach
	void before() {
		System.out.println("---> before()");
	}

	@Test
	void testMethod() {
		System.out.println("===> testMethod()");
		assertTrue(true);
		assertNull(null);
		assertEquals(12, 12);
	}
	
	@AfterEach
	void after() {
		System.out.println("---> after()");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("===> afterAll()");
	}

}
