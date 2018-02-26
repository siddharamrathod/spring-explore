package com.helloftp.sample.service;

import java.io.File;

public class LogService {
	
	public void log(final File file){
		System.out.println("Picked up file"+file.getName());
	}

}
