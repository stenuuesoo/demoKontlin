package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private lateinit var mockMvc: MockMvc

	@Test
	fun `should return greeting for provided name`() {
		val name = "John"
		mockMvc.perform(get("/$name"))
			.andExpect(status().isOk)
			.andExpect(content().string("Hello, hello $name"))
	}
}