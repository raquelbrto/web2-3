package br.com.imd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.imd.domain.Papel;
import br.com.imd.repositories.PapelRepository;

@Controller
public class PapelMVCController {

	@Autowired
	private PapelRepository papelRepository;
	
	@GetMapping("/novopapel")
	public String greetingForm(Model model) {
		model.addAttribute("papel", new Papel());
		return "form";
	}
	
	@PostMapping("/novopapel")
	  public String greetingSubmit(@ModelAttribute Papel papel, Model model) {
	    model.addAttribute("papel", papel);
	    return "result";
	}
	
	
	@RequestMapping("/papeis")
	public String getPapeis(ModelMap model) {
		model.addAttribute("departamentos", papelRepository.findAll());
		return "/papeis/lista";
	}

	@PostMapping("/papeis")
	public String addPapel(RedirectAttributes attr, Papel papel) {
		 papelRepository.save(papel);
		 return "redirect:/papeis/lista";
	}
	
	@GetMapping("/papeis")
	public String deletePapel(@PathVariable("id") Long id, ModelMap model) {
		papelRepository.deleteById(id);
		model.addAttribute("success", "Departamento excluído com sucesso.");
		return "papeis/lista";
	}
}
