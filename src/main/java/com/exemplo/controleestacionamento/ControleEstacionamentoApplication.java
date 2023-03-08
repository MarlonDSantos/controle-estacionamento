package com.exemplo.controleestacionamento;

import com.exemplo.controleestacionamento.models.ParkingSpotModel;
import com.exemplo.controleestacionamento.repositories.ParkingSpotRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class ControleEstacionamentoApplication {
	private final ParkingSpotRepository parkingSpotRepository;

	public ControleEstacionamentoApplication(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ControleEstacionamentoApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Olá Mundo!";
	}


}
