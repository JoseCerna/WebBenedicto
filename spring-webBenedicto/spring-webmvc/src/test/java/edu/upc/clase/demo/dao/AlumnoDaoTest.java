/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Alumno;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jose_cerna
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
//@Transactional
public class AlumnoDaoTest {
    
    private static Logger log = LoggerFactory.getLogger(AlumnoDaoTest.class);
    
    @Autowired
    private AlumnoDao alumnoDao;
    
    @Test
    public void testInsertar() {
        System.out.println("Insertar");
        Alumno objAlumno = new Alumno("Julio","Garcia","Villar","06777618","julio.garcia@gmd.com","5550122","999999999",1);
        Integer id = alumnoDao.Insertar(objAlumno);
        Assert.assertNotNull(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Actualizar method, of class AlumnoDao.
     */
//    @Test
//    public void testActualizar() {
//        System.out.println("Actualizar");
//        Alumno objAlumno = null;
//        AlumnoDao instance = new AlumnoDaoImpl();
//        instance.Actualizar(objAlumno);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscarTodos method, of class AlumnoDao.
//     */
//    @Test
//    public void testBuscarTodos() {
//        System.out.println("buscarTodos");
//        AlumnoDao instance = new AlumnoDaoImpl();
//        List expResult = null;
//        List result = instance.buscarTodos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class AlumnoDaoImpl implements AlumnoDao {
//
//        public Integer Insertar(Alumno objAlumno) {
//            return null;
//        }
//
//        public void Actualizar(Alumno objAlumno) {
//        }
//
//        public List<Alumno> buscarTodos() {
//            return null;
//        }
//    }
}