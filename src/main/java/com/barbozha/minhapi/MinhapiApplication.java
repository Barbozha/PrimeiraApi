package com.barbozha.minhapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barbozha.minhapi.domain.Usuario;
import com.barbozha.minhapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MinhapiApplication implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MinhapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario us1 = new Usuario(null, "Jorge Paulo", "barboza", "123456");
		Usuario us2 = new Usuario(null, "Pedro de Toledo", "toledo", "123456");
		Usuario us3 = new Usuario(null, "Angélica Migliori", "angelica", "123456");
		Usuario us4 = new Usuario(null, "Ana Rita de Cássia", "ana", "123456");
		Usuario us5 = new Usuario(null, "Leonardo Migliori", "leonardo", "123456");
		
		usuarioRepository.saveAll(Arrays.asList(us1,us2,us3,us4));
		
	}

}
