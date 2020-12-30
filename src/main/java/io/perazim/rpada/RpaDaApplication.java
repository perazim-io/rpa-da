package io.perazim.rpada;

import com.google.gson.stream.JsonToken;
import datamodellers.EntityCanvas;
import domain_model.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RpaDaApplication {

	public static void main(String[] args) {

		SpringApplication.run(RpaDaApplication.class, args);

		new Thread(new Runnable() {
			@Override
			public void run() {
				DataLoader.getInstance().init();
			}
		}).start();

	}

}
