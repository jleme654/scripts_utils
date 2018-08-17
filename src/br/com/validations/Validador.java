package br.com.validations;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

/**
 * 2018-08-17
 * @author julio
 *
 */
public class Validador {
	
	public static final String BASE_PATH = "properties/xsd";

	public void valida(File xml, File xsd) throws Exception {
		Source schemaFile = new StreamSource(xsd);
		Source xmlFile = new StreamSource(xml);
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(schemaFile);
		Validator validator = schema.newValidator();
		validator.validate(xmlFile);
		System.out.println("validado sem erros");
	}

	public static void main(String[] args) {
		try {
			String pedidoXML = String.format("%s/pedido.xml", BASE_PATH);
			String pedidoXSD = String.format("%s/pedido.xsd", BASE_PATH);
			File xml = new File(pedidoXML);
			File xsd = new File(pedidoXSD);
			new Validador().valida(xml, xsd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}