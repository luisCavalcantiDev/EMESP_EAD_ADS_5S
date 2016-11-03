package br.metodista.ead.validador;

import java.util.Map;
import static org.junit.Assert.*;

/**
 *
 * @author LuisGustavo
 */
public class ValidadorXmlConfigTest {

    public ValidadorXmlConfigTest() {
    }

    @org.junit.Test
    public void testParse001ComXmlValido() throws Exception {
	System.out.println("parse");
	String xml = "<configuracao><chave>1234</chave><valor>10</valor></configuracao>";
	
	ValidadorXmlConfig instance = new ValidadorXmlConfig();
	Configuracao expResult = new Configuracao("1234", 10);
	Configuracao result = instance.parse(xml);
	
	assertEquals(expResult.getChave(), result.getChave());
	assertEquals(expResult.getValor(), result.getValor());
    }

}
