package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GageOne implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Option args
		//(01)read all keys
		@SuppressWarnings("unused")
		Set<String> optionkey=args.getOptionNames();

		//(02)one key realted values

		List<String> list=args.getOptionValues("Profile");
		System.out.println(list);

		//(03)check for key exist

		System.out.println(args.containsOption("nature"));
		System.out.println("db");

		//----------------------------Non-Option--------------------------------
		List<String> nonop=args.getNonOptionArgs();
		System.out.println(nonop);

		//---------------------------All_Args-----------------------------------
		String[] arr=args.getSourceArgs();
		System.out.println("arr");
		System.out.println(Arrays.asList(arr));

	}


}
