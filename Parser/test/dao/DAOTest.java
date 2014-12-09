/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import DAO.DataAccessLayer;
import DAO.Document;
import DAO.Term;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import parser.ParserManager;

/**
 *
 * @author User
 */
public class DAOTest {

    public DAOTest() {
    }

    /**
     * Test of testAddDocumentsToDB method, of class DAO.
     */
    @Test
    public void testAddDocumentsToDB() throws IOException {
        System.out.println("addDocumentsToDB");
        ParserManager pm = new ParserManager();
        List<Document> documents = null;
        documents = pm.MultipleParse(".//resources");
        DataAccessLayer instance = new DataAccessLayer();
        instance.addDocumentsToDB(documents);
    }

    /**
     * Test of testAddCurrentTermToDB method, of class DAO.
     */
    @Test
    public void testAddCurrentTermToDB() {
        System.out.println("addCurrentTermToDB");
        List<Term> terms = null;
        DataAccessLayer instance = new DataAccessLayer();
        instance.addTermsToDB(terms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTermToTTerm method, of class DAO.
     */
    @Test
    public void testAddCurrentDocumentToDB() throws MalformedURLException {
        /*System.out.println("addTermToTTerm");
        ParserManager pm = new ParserManager();
        DAO instance = new DAO();
        Term term = new Term("comi", 3);
        Document document = pm.Parse(".\\resources\\pdf\\Hello.pdf");
        instance.addTermToTTerm(term);*/
    }

    /**
     * Test of addTermsToDB method, of class DataAccessLayer.
     */
    @Test
    public void testAddTermsToDB() {
        System.out.println("addTermsToDB");
        List<Term> terms = null;
        DataAccessLayer instance = new DataAccessLayer();
        instance.addTermsToDB(terms);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTermId method, of class DataAccessLayer.
     */
    @Test
    public void testGetTermId() {
        System.out.println("getTermId");
        String Stem = "stop";
        DataAccessLayer instance = new DataAccessLayer();
        int expResult = 7;
        int result = instance.getTermId(Stem);
        assertEquals(expResult, result);
    }

    /**
     * Test of addDocumentToTDocument method, of class DAO.
     *//*
    @Test
    public void testAddDocumentToTDocument() throws MalformedURLException {
        System.out.println("addDocumentToTDocument");
        ParserManager pm = new ParserManager();
        DAO instance = new DAO();
        Document document = pm.Parse(".\\resources\\pdf\\Hello.pdf");
        instance.addDocumentToTDocument(document);
    }*/

}