package com.johnsprogram.restservice.RestApp;

import com.what3words.javawrapper.What3WordsV3;
import com.what3words.javawrapper.response.ConvertToCoordinates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestAppApplication.class, args);

		What3WordsV3 api = new What3WordsV3("VEXXXJRL");
		ConvertToCoordinates coordinates = api.convertToCoordinates("silk.slap.soils")
				.execute();
		System.out.println("Coordinates for 'silk.slap.soils': " + coordinates);
		ConvertToCoordinates coordinates2 = api.convertToCoordinates("zealous.range.garage")
				.execute();
		System.out.println("Coordinates for 'zealous.range.garage': " + coordinates2);
		ConvertToCoordinates coordinates3 = api.convertToCoordinates("slurs.this.shark")
				.execute();
		System.out.println("Coordinates for 'slurs.this.shark': " + coordinates3);
	}

}
