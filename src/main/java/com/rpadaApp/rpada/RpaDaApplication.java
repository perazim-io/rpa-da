package com.rpadaApp.rpada;

import com.rpadaApp.domain_model.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com.rpadaApp"})
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
