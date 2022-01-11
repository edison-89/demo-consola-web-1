package ec.edu.uce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.service.scope.IMatriculaPrototypeService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

@SpringBootApplication
public class DemoConsolaWeb1Application implements CommandLineRunner {

	private static final Logger LOG = LogManager.getLogger(DemoConsolaWeb1Application.class);

	@Autowired
	private IMatriculaSingletonService objeto1;

	@Autowired
	private IMatriculaSingletonService objeto2;
	
	@Autowired
	private IMatriculaSingletonService objeto3;
	
	
	//Scope Prototype
	@Autowired
	private IMatriculaPrototypeService pro1;
	
	@Autowired
	private IMatriculaPrototypeService pro2;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaWeb1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LOG.info("Impresión valor del objeto");
		this.objeto1.establecerValor("EDISON");
		LOG.info(this.objeto1.obtenerCodigo());
		LOG.info("Objeto 2");
		LOG.info(this.objeto2.obtenerCodigo());
		LOG.info("Objeto 3");
		LOG.info(this.objeto3.obtenerCodigo());
		this.objeto3.establecerValor("PEPITO");
		LOG.info("Objeto 1 nuevo");
		LOG.info(this.objeto1.obtenerCodigo());
		
		LOG.info("************Prototype********************");
		this.pro1.establecerNombre("JUANITO");
		LOG.info(this.pro1.obtenerNombre());
		LOG.info("Pro 2");
		this.pro2.establecerNombre("MARIA");
		LOG.info(this.pro2.obtenerNombre());
		LOG.info(this.pro1.obtenerNombre());
	}

}
