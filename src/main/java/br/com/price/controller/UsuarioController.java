package br.com.price.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.price.dao.UsuarioDao;
import br.com.price.model.Cidade;
import br.com.price.model.Endereco;
import br.com.price.model.Usuario;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioDao usuariodao;
	
	
	@RequestMapping("/formulario")
	public ModelAndView formulario(){
		ModelAndView modelAndView = new ModelAndView("cadastro/formulario");
		return modelAndView;
	}
	
	@RequestMapping("/okk")
	public ModelAndView incluir(Usuario usuario){
		System.out.println(usuario);
		ModelAndView modelAndView = new ModelAndView("cadastro/ok");
		usuariodao.incluir(usuario);
		return modelAndView ;	
	}


	
	@RequestMapping("/lista")
	public ModelAndView listar(){
		List<Usuario> usuarios = usuariodao.listar();
		ModelAndView modelAndView = new ModelAndView("cadastro/lista");
		modelAndView.addObject("usuario",usuarios);
		System.out.println(usuarios);
		return modelAndView;
	}
	
	@RequestMapping("/ok")
	protected ModelAndView service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		List<Endereco> enderecos = new ArrayList<>();
		Endereco endereco = new Endereco();
		Cidade cidade = new Cidade();
		usuario.setNome(req.getParameter("nome"));
		usuario.setEmail(req.getParameter("email"));
		endereco.setCep(req.getParameter("cep"));
		endereco.setLogradouro(req.getParameter("logradouro"));
		endereco.setNumero(req.getParameter("numero"));
		endereco.setComplemento(req.getParameter("complemento"));
		endereco.setBairro(req.getParameter("bairro"));
		cidade.setNome(req.getParameter("cidade"));
		endereco.setCidade(cidade);
		enderecos.add(endereco);
		usuario.setEndereco(enderecos);
		
		//Associando o ojeto a requisição
		req.setAttribute("usuario", usuario);
		//Criando um Despachante
		ModelAndView modelAndView = new ModelAndView("cadastro/ok");

		usuariodao.incluir(usuario);

		return modelAndView;
	}

}
