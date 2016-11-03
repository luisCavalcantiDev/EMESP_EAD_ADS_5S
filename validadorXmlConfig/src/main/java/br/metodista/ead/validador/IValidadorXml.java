package br.metodista.ead.validador;

import java.util.Map;

public interface IValidadorXml {
    
    public Configuracao parse(String xml) throws Exception;
    
}
