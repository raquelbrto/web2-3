package br.com.imd.papeis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imd.papeis.domain.Papel;
import br.com.imd.papeis.repositories.PapelRepository;

@RestController
public class PapelController {

	@Autowired
	private PapelRepository papelRepository;

	@RequestMapping("/papeis")
	public List<Papel> getPapeis() {
		return papelRepository.findAll();
	}
	
	@PostMapping("/papeis")
	public Papel addPapel(@RequestBody Papel papel) {
		return papelRepository.save(papel);
	}
}
