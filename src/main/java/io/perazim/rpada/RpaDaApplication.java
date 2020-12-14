package io.perazim.rpada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RpaDaApplication {

	public static void main(String[] args) {

		SpringApplication.run(RpaDaApplication.class, args);

		GetEntityCanvasData.getInstance().init();
		if(GetEntityCanvasData.getInstance().isDataLoaded()){
			GetEntityCanvasData.getInstance().makeEntCanvasData();
		}


	}

}
