package com.app.runner;

import java.util.Arrays;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements CommandLineRunner {
	
@Override
public void run(String... args) throws Exception {
	
	System.out.println("from runner");
	System.out.println(args);
	System.out.println(Arrays.asList(args));
}
}
