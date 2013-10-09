/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.controller;

import edu.upc.clase.demo.dao.AlumnoDao;
import edu.upc.clase.demo.entity.Alumno;
import edu.upc.clase.demo.entity.CriterioBusqueda;
import edu.upc.clase.demo.entity.Usuario;
import edu.upc.clase.demo.service.UsuarioService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jose_cerna
 */
@Controller
public class AlumnoController {
    
    @Autowired
    private AlumnoDao objAlumnoDao;
    private static Logger log = LoggerFactory.getLogger(AlumnoController.class);
    
    @RequestMapping("/ListarAlumnos")
    public ModelAndView ListarAlumnos() {
        ModelAndView mav = new ModelAndView("/ListarAlumnos");
        List<Alumno> Alumnos = objAlumnoDao.buscarTodos();
        mav.addObject("alumno", Alumnos);
        return mav;
    }
}
