package com.example.ProyectoIntegrador;

import com.example.ProyectoIntegrador.model.Domicilio;
import com.example.ProyectoIntegrador.model.Odontologo;
import com.example.ProyectoIntegrador.model.Paciente;
import com.example.ProyectoIntegrador.service.PacienteService;
import com.example.ProyectoIntegrador.service.impl.OdontologoServiceImpl;
import com.example.ProyectoIntegrador.service.impl.PacienteServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ProyectoIntegradorApplicationTests {

	/*------------------------------Inyección de dependencias------------------------------------*/

	@Autowired
	PacienteServiceImpl pacienteService;

	@Autowired
	OdontologoServiceImpl odontologoService;

	/*----------------------------------Cargo data de prueba------------------------------------*/
	public void cargarData(){
	Domicilio domicilio = new Domicilio("Avenida de Mayo", 1111, "CABA", "Buenos Aires");
	Paciente paciente1 = pacienteService.agregar(new Paciente("Santiago", "López", "3416589", LocalDate.of(2022,10,21), domicilio));
	}

	/*----------------------------------Tests---------------------------------------------------*/

	@Test
	public void listarOdontologosTest(){
		Odontologo odontologo = new Odontologo(15, "Julian", "Alvarez", "211090");
		odontologoService.agregar(odontologo);
		List<Odontologo> listaOdontologos = odontologoService.listar();

		Assert.assertNotNull(listaOdontologos);
		Assert.assertTrue(listaOdontologos.size() > 0);

	}

	@Test
	public void agregarYBuscarPacienteTest(){
		cargarData();
		Domicilio domicilio2 = new Domicilio("Avenida San Martin", 2020, "Florida", "Buenos Aires");
		Paciente paciente2 = pacienteService.agregar(new Paciente("Luciana", "Perez", "12456789", LocalDate.of(2021,10,21), domicilio2));

		Assert.assertNotNull(pacienteService.buscarPorId(paciente2.getId()));
	}



}
