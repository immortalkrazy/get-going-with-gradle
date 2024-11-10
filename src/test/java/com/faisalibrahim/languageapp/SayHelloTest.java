package com.faisalibrahim.languageapp;

import org.junit.jupiter.api.Test;
import com.faisalibrahim.languageapp.SayHello;
import java.io.IOException;

public class SayHelloTest {
	@Test
	public void testSayHello() throws IOException {
		SayHello.main(new String[] {"en"});
	}
}