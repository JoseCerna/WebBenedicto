/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.dao.impl.AcademiaDaoImpl;
import edu.upc.clase.demo.entity.Academia;
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
 * @author Omar
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-base-test.xml")
//@Transactional
public class AcademiaDaoTest {

    private static Logger log = LoggerFactory.getLogger(AcademiaDaoTest.class);
    
    @Autowired
    private AcademiaDao academiaDao;

    @Test
    public void InsertarAcademia() {
        System.out.println("Insertar");
        Academia objAcademia = new Academia("Oficina Principal", "SJL", "123456789", 1);
        Integer id = academiaDao.Insertar(objAcademia);
        Assert.assertNotNull(id);
        
    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of Insertar method, of class AcademiaDao.
//     */
//    @Test
//    public void testInsertar() {
//        System.out.println("Insertar");
//        Academia objAcademia = null;
//        AcademiaDao instance = new AcademiaDaoImpl();
//        Integer expResult = null;
//        Integer result = instance.Insertar(objAcademia);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Actualizar method, of class AcademiaDao.
//     */
//    @Test
//    public void testActualizar() {
//        System.out.println("Actualizar");
//        Academia objAcadobjAcademiaemia = null;
//        AcademiaDao instance = new AcademiaDaoImpl();
//        instance.Actualizar(objAcadobjAcademiaemia);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
////
//    /**
//     * Test of buscarTodos method, of class AcademiaDao.
//     */
//    @Test
//    public void testBuscarTodos() {
//        System.out.println("buscarTodos");
//        AcademiaDao instance = new AcademiaDaoImpl();
//        List expResult = null;
//        List result = instance.buscarTodos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of buscarporNombre method, of class AcademiaDao.
//     */
//    @Test
//    public void testBuscarporNombre() {
//        System.out.println("buscarporNombre");
//        String nombreAcademia = "";
//        AcademiaDao instance = new AcademiaDaoImpl();
//        Academia expResult = null;
//        Academia result = instance.buscarporNombre(nombreAcademia);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    public class AcademiaDaoImpl implements AcademiaDao {
//
//        public Integer Insertar(Academia objAcademia) {
//            return null;
//        }
//
//        public void Actualizar(Academia objAcadobjAcademiaemia) {
//        }
//
//        public List<Academia> buscarTodos() {
//            return null;
//        }
//
//        public Academia buscarporNombre(String nombreAcademia) {
//            return null;
//        }
//    }
}