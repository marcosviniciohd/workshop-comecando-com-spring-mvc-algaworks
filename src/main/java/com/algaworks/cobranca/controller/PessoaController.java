package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.Pessoa;
import com.algaworks.cobranca.repository.Pessoas;

@Controller
@RequestMapping("pessoas")
public class PessoaController {
	
	@Autowired
	private Pessoas pessoas;
	
	@RequestMapping("/novoUsuario")
	public String novoUsuario() {
		return "CadastroPessoa";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView salvar(Pessoa pessoa) {
		pessoas.save(pessoa);
		ModelAndView mv = new ModelAndView("CadastroPessoa");
		mv.addObject("mensagem", "Novo usuário salvo com sucesso!");
		return mv;
	}

}
