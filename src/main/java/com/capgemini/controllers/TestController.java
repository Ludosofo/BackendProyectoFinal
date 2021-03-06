package com.capgemini.controllers;

import com.capgemini.entities.Usuario;
import com.capgemini.servicies.IOfertaServ;
import com.capgemini.servicies.IUsuarioServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
    
    // TRUNCATE + INSERT INTO de datos por defecto del proyecto
	@Autowired private IUsuarioServ usuarioService;
	@Autowired private IOfertaServ ofertaService;

    @GetMapping("/getUsuario")
	public ModelAndView usuariosCalls(){
		System.out.println(">>> /test/getUsuario");
		ModelAndView mav = new ModelAndView("test");

		Usuario user = usuarioService.findById(1);

		System.out.println(">>> Nuestro usuario es:");
		System.out.println(user.toString());
		mav.addObject("title", "Queremos obtener un usuario con findById(1)");
		mav.addObject("data", "Todo correcto" );
		return mav;
	}
}
