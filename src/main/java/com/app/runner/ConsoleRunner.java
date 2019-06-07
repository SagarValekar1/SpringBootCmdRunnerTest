package com.app.runner;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ConsoleRunner implements ApplicationRunner {
	private Set<String> profiles;
@Override
public void run(ApplicationArguments args) throws Exception {
	
	profiles=args.getOptionNames();
	System.out.println(profiles);
	System.out.println(args.getOptionValues("profiles"));
}
}
