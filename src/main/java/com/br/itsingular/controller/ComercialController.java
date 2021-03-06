package com.br.itsingular.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.br.itsingular.entity.Comercial;
import com.br.itsingular.entity.Requisicao;
import com.br.itsingular.services.ComercialService;
import com.br.itsingular.services.RequisicaoServices;
import com.br.itsingular.utils.PageWrapper;


@Controller
@RequestMapping(value = "/comercial")
public class ComercialController {
	
	@Autowired
	private ComercialService comercialService;
	
	@Autowired
	private RequisicaoServices requisicaoServices;
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping("/cadastro")
	public ModelAndView novo(){
		ModelAndView view = new ModelAndView("CadastroComercial");
		view.addObject(new Comercial());
		return view;
	}
	
	@PostMapping("/salvar")
	public ModelAndView salvar(@Validated Comercial comercial, BindingResult result){
		if(result.hasErrors()){
			return new ModelAndView("CadastroComercial") ;
		}
		
		try{
			ModelAndView modelAndView = new ModelAndView("CadastroComercial");
			this.comercialService.create(comercial);
			modelAndView.addObject("message","Success");
			modelAndView.addObject("comercial", new Comercial());
			return modelAndView;
		}catch(IllegalArgumentException e){
			throw new RuntimeException("Erro ao registrar o comercial");
		}
	}
	
	@GetMapping("/informacoes")
	public ModelAndView listarInfo(Model model, @RequestParam(name = "page", defaultValue = "0") final int page, @RequestParam(name = "size", defaultValue = "5") final int size){
		
		Object email = session.getAttribute("email");

		Page<Requisicao> requisicoes = this.requisicaoServices.getInfoBySolicitante(String.valueOf(email), page, size);
		
		PageWrapper<Requisicao> requisicoesPage = new PageWrapper<Requisicao>(requisicoes, "/comercial/informacoes");
		
		ModelAndView view = new ModelAndView("ViewComercial");
		view.addObject("requisicoes", requisicoesPage) ;
		model.addAttribute("requisicoes", requisicoes.getContent());
        model.addAttribute("page", requisicoesPage);
		return view;
	}
	
	@GetMapping("/filtrar")
	public ModelAndView listar(Model model, @RequestParam final String filtro){
		ModelAndView view = new ModelAndView("ViewComercial");
		List<Requisicao> requisicoes = null;
		 
		if (StringUtils.isBlank(filtro)) {
			requisicoes = this.requisicaoServices.listarRequisicoes();
		} else {
			requisicoes = this.requisicaoServices.filtrarRequisicao(filtro);
		}		
	
		view.addObject("requisicoes", requisicoes);
		model.addAttribute("filtro", filtro);
		return view;
	}
}
