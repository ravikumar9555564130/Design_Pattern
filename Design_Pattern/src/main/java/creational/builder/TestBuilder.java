package creational.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestBuilder {

	public static void main(String[] args) {

		SpringApplication.run(TestBuilder.class, args);

		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		
		System.out.println("comp :: " +comp);
	}

}
