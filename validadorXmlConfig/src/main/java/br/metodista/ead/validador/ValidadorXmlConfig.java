package br.metodista.ead.validador;

import com.thoughtworks.xstream.XStream;

public class ValidadorXmlConfig implements IValidadorXml {

    @Override
    public Configuracao parse(String xml) throws Exception {

	XStream xStream;
	Configuracao xmlToConfig = null;

	try {
	    if (xml.equals("") == false) {
		xStream = new XStream();
		xStream.alias("configuracao", Configuracao.class);

		Object result = xStream.fromXML(xml);
		if (result != null) {
		    xmlToConfig = (Configuracao) result;
		}
	    }

	} catch (Exception e) {
	    throw new Exception("Erro parse XML: " + e.getMessage() + " --> Config: XML: " + xml);
	}

	return xmlToConfig;
    }

}
