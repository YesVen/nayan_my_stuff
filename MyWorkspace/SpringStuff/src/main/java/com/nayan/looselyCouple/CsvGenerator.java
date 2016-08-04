package com.nayan.looselyCouple;

import org.springframework.stereotype.Component;

@Component
public class CsvGenerator implements OutputGenerator{

	public void generateOutput() {
		
		System.out.println("generating CSV output");
	}

}
