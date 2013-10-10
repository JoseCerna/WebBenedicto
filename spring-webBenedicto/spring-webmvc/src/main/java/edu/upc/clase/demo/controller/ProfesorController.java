/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.dao.ProfesorDao;
import edu.upc.clase.demo.entity.Profesor;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jose
 */

@Controller
public class ProfesorController {
    
       @Autowired
    private ProfesorDao objProfesorDao;
    private static Logger log = LoggerFactory.getLogger(ProfesorController.class);
    
    @RequestMapping("/ListarProfesores")
    public ModelAndView ListarProfesores() {
        ModelAndView mav = new ModelAndView("/ListarAlumnos");
        List<Profesor> Profesores = objProfesorDao.buscarTodos();
        mav.addObject("profesor", Profesores);
        return mav;
    }
    
}
