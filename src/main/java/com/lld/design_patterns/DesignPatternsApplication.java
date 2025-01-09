package com.lld.design_patterns;

import com.lld.design_patterns.creational.abstractFactory.AbstractFactoryPatternRunner;
import com.lld.design_patterns.creational.builder.BuilderPatternRunner;
import com.lld.design_patterns.creational.factory.FactoryPatternRunner;
import com.lld.design_patterns.creational.objectPool.ObjectPoolRunner;
import com.lld.design_patterns.creational.prototype.PrototypePatternRunner;
import com.lld.design_patterns.creational.prototype.expensive.PrototypeExpensiveRunner;
import com.lld.design_patterns.creational.singleton.SingletonRunner;
import com.lld.design_patterns.structural.adapter.AdapterRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	private final SingletonRunner singletonRunner;
	private final FactoryPatternRunner factoryPatternRunner;
	private final AbstractFactoryPatternRunner abstractFactoryPatternRunner;
	private final BuilderPatternRunner builderPatternRunner;
	private final PrototypePatternRunner prototypePatternRunner;
	private final PrototypeExpensiveRunner prototypeExpensiveRunner;
	private final ObjectPoolRunner objectPoolRunner;
	private final AdapterRunner adapterRunner;

	public DesignPatternsApplication(SingletonRunner singletonRunner,
									 FactoryPatternRunner factoryPatternRunner,
									 AbstractFactoryPatternRunner abstractFactoryPatternRunner,
									 BuilderPatternRunner builderPatternRunner,
									 PrototypePatternRunner prototypePatternRunner,
									 PrototypeExpensiveRunner prototypeExpensiveRunner,
									 ObjectPoolRunner objectPoolRunner,
									 AdapterRunner adapterRunner) {
		this.singletonRunner = singletonRunner;
		this.factoryPatternRunner = factoryPatternRunner;
		this.abstractFactoryPatternRunner = abstractFactoryPatternRunner;
		this.builderPatternRunner = builderPatternRunner;
		this.prototypePatternRunner = prototypePatternRunner;
		this.prototypeExpensiveRunner = prototypeExpensiveRunner;
		this.objectPoolRunner = objectPoolRunner;
		this.adapterRunner = adapterRunner;
	}

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Running Design Patterns");
		singletonRunner.run();
		factoryPatternRunner.run();
		abstractFactoryPatternRunner.run();
		builderPatternRunner.run();
		prototypePatternRunner.run();
		prototypeExpensiveRunner.run();
		objectPoolRunner.run();
		adapterRunner.run();
	}
	
}
