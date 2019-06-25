package com.johnsprogram.restservice.RestApp;

import com.what3words.javawrapper.What3WordsV3;
import com.what3words.javawrapper.response.ConvertToCoordinates;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author      John Jacob <johnjacob88@hotmail.co.uk>
 * @version     1.0
 */

@SpringBootApplication
public class RestAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestAppApplication.class, args);

		//Create instance of api with given key
		What3WordsV3 api = new What3WordsV3("VEXXXJRL");

		//Convert words to coordinates
		ConvertToCoordinates coordinates1 = api.convertToCoordinates("silk.slap.soils")
				.execute();

		ConvertToCoordinates coordinates2 = api.convertToCoordinates("zealous.range.garage")
				.execute();

		ConvertToCoordinates coordinates3 = api.convertToCoordinates("slurs.this.shark")
				.execute();


		//Print fetched JSON data to console
		System.out.println("Coordinates for 'silk.slap.soils': " + coordinates1 + "\n"
				           + "Coordinates for 'zealous.range.garage': " + coordinates2 + "\n"
				           + "Coordinates for 'slurs.this.shark': " + coordinates3);
	}

}
