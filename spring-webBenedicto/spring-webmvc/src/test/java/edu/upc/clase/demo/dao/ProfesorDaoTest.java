/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Profesor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Jose
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")

public class ProfesorDaoTest {
    
  
   
    private static Logger log = LoggerFactory.getLogger(ProfesorDaoTest.class);
    
    @Autowired
    private ProfesorDao profesorDao;
    
    @Test
    public void testInsertar() throws ParseException {
        System.out.println("Insertar");
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formateador.parse("23/12/1995");
        Profesor objProfesor = new Profesor("Jose","Cerna","Ruiz",fecha,"j_cerna@hotmail.com","Su casa","4534232","943409432",1);
        Integer id = profesorDao.Insertar(objProfesor);
        Assert.assertNotNull(id);
    }

    /**
     * Test of Actualizar method, of class ProfesorDao.
     */
//    @Test
//    public void testActualizar() {
//        System.out.println("Actualizar");
//        Profesor objProfesor = null;
//        ProfesorDao instance = new ProfesorDaoImpl();
//        instance.Actualizar(objProfesor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of buscarTodos method, of class ProfesorDao.
     */
//    @Test
//    public void testBuscarTodos() {
//        System.out.println("buscarTodos");
//        ProfesorDao instance = new ProfesorDaoImpl();
//        List expResult = null;
//        List result = instance.buscarTodos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class ProfesorDaoImpl implements ProfesorDao {
//
//        public Integer Insertar(Profesor objProfesor) {
//            return null;
//        }
//
//        public void Actualizar(Profesor objProfesor) {
//        }
//
//        public List<Profesor> buscarTodos() {
//            return null;
//        }
//    }
}