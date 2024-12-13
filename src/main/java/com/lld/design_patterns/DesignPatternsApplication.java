package com.lld.design_patterns;

import com.lld.design_patterns.behavioral.factory.FactoryPatternRunner;
import com.lld.design_patterns.behavioral.singleton.SingletonRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	private final SingletonRunner singletonRunner;
	private final FactoryPatternRunner factoryPatternRunner;

	public DesignPatternsApplication(SingletonRunner singletonRunner,
									 FactoryPatternRunner factoryPatternRunner) {
		this.singletonRunner = singletonRunner;
		this.factoryPatternRunner = factoryPatternRunner;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Running Design Patterns Demo");
		singletonRunner.run();
		factoryPatternRunner.run();
	}
	
}
