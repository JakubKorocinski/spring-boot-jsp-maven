package com.sanddhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class SanddhubApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SanddhubApplication.class);
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SanddhubApplication.class, args);

		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("   _____                    _      _  _             _                              ");
		System.out.println("  / ____|                  | |    | || |           | |         /\\                  ");
		System.out.println(" | (___    __ _  _ __    __| |  __| || |__   _   _ | |__      /  \\    _ __   _ __  ");
		System.out.println("  \\___ \\  / _` || '_ \\  / _` | / _` || '_ \\ | | | || '_ \\    / /\\ \\  | '_ \\ | '_ \\ ");
		System.out.println("  ____) || (_| || | | || (_| || (_| || | | || |_| || |_) |  / ____ \\ | |_) || |_) |");
		System.out.println(" |_____/  \\__,_||_| |_| \\__,_| \\__,_||_| |_| \\__,_||_.__/  /_/    \\_\\| .__/ | .__/ ");
		System.out.println("                                                                     | |    | |    ");
		System.out.println("                                                                     |_|    |_|");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}
}
