package com.nttdata.AirlineRadar;

import com.nttdata.AirlineRadar.dominio.model.Form;
import com.nttdata.AirlineRadar.dominio.model.Section;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
public class AirlineRadarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlineRadarApplication.class, args);
	}

}
