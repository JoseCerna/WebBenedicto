/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.dao.AcademiaDao;
import edu.upc.clase.demo.entity.Academia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Omar
 */
@Controller
public class AcademiaController {
    
    @Autowired
    private AcademiaDao objAcademiaDao;
    private static Logger log = LoggerFactory.getLogger(AcademiaController.class);
    
    @RequestMapping(value = "/MantenimientoAcademia", method = RequestMethod.GET)
    public ModelAndView newAcademia() {
        ModelAndView mav = new ModelAndView("/MantenimientoAcademia");
        Academia academia = new Academia();
        mav.getModelMap().put("academia", academia);
        return mav;
    }
}

