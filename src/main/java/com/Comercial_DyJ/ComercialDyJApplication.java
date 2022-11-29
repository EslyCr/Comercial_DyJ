package com.Comercial_DyJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class )//Para excluir ala base de datos
public class ComercialDyJApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComercialDyJApplication.class, args);
	}

}
