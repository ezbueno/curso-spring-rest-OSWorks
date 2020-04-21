package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar( ) {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Ezandro");
		cliente1.setEmail("ezandrobueno@yahoo.com.br");
		cliente1.setTelefone("11 99914-1793");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Nayara");
		cliente2.setEmail("nay@teste.com.br");
		cliente2.setTelefone("11 99999-9999");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
