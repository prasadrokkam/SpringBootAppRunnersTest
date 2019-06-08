package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//---Option Args----
		// 1. read all keys
		Set<String> optionKeys = args.getOptionNames();
		System.out.println(optionKeys);
		
		//2.One key realted values
		List<String> list = args.getNonOptionArgs();
		System.out.println(list);
		
		//3.check for key exist
		System.out.println(args.containsOption("nature"));
		System.out.println(args.containsOption("db"));
		
		
		//---Non Option Args---
		List<String> nonOptionArgs = args.getNonOptionArgs();
		System.out.println(nonOptionArgs);
		
		//--- All args---
		String[] sourceArgs = args.getSourceArgs();
		System.out.println(sourceArgs);
		System.out.println(Arrays.asList(sourceArgs));
	}

}
