package br.com.price.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.price.dao.CidadeDao;
import br.com.price.dao.EnderecoDao;
import br.com.price.dao.UsuarioDao;
import br.com.price.model.Usuario;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuariodao;
	
	@Autowired
	private EnderecoDao enderecoDao;
	
	@Autowired
	private CidadeDao cidadeDao;
	
	@RequestMapping("/formulario")
	public ModelAndView formulario(){
		ModelAndView modelAndView = new ModelAndView("cadastro/formulario");
		return modelAndView;
	}
	
	@RequestMapping("/ok")
	public ModelAndView incluir(Usuario usuario){
		System.out.println(usuario.getEnderecos());
		ModelAndView modelAndView = new ModelAndView("cadastro/ok");
		usuariodao.incluir(usuario);
		return modelAndView ;	
	}

	@RequestMapping("/lista")
	public ModelAndView listar(){
		List<Usuario> usuarios = usuariodao.listar();
		ModelAndView modelAndView = new ModelAndView("cadastro/lista");
		modelAndView.addObject("usuario",usuarios);
		
		return modelAndView;
	}
}
