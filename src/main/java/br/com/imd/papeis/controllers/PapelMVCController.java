package br.com.imd.papeis.controllers;

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

import br.com.imd.papeis.domain.Papel;
import br.com.imd.papeis.repositories.PapelRepository;

@Controller
public class PapelMVCController {

	@Autowired
	private PapelRepository papelRepository;
	
	@GetMapping("/novopapel")
	public String salvar(Model model, Papel papel) {
		model.addAttribute("papel", new Papel());
		return "form";
	}

	@PostMapping("/salvar")
	public String addPapel(RedirectAttributes attr, Papel papel) {
		 papelRepository.save(papel);
		 return "redirect:/listar";
	}
	
	@GetMapping("/listar")
	  public String greetingSubmit(ModelMap model) {
	    model.addAttribute("papeis", papelRepository.findAll());
	    return "result";
	}
	
	
	@GetMapping("/delete")
	public String deletePapel(@PathVariable("id") Long id, ModelMap model) {
		papelRepository.deleteById(id);
		model.addAttribute("success", "Departamento excluído com sucesso.");
		return "papeis/lista";
	}
}
