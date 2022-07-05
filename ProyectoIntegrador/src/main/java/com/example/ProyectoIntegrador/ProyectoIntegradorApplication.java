package com.example.ProyectoIntegrador;

import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.repository.OdontologoRepository;
import com.example.ProyectoIntegrador.service.OdontologoService;
import com.example.ProyectoIntegrador.service.impl.OdontologoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.*;

@SpringBootApplication
public class ProyectoIntegradorApplication {

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(ProyectoIntegradorApplication.class, args);



	}

}
