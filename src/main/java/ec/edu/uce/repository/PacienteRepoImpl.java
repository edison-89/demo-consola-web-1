package ec.edu.uce.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo {

	private static final Logger LOG = LoggerFactory.getLogger(PacienteRepoImpl.class);

	@Override
	public void insertar(Paciente paciente) {
//		System.out.println("Se guardo en la base: " + paciente); No debo usar syso
		LOG.info("Se guardo en la base: " + paciente);
	}

	@Override
	public void buscarPorCedula(String cedula) {
//		System.out.println("Buscando a: " + cedula); No debo usar syso
		LOG.info("Buscando a: " + cedula);
	}

	@Override
	public void actualizar(Paciente paciente) {
//		System.out.println("Acualizando a: " + paciente); No debo usar syso
		LOG.info("Acualizando a: " + paciente);
	}

	@Override
	public void borrar(String cedula) {
//		System.out.println("Borrando a: " + cedula); No debo usar syso
		LOG.info("Borrando a: " + cedula);
		LOG.error("Ha ocurrido un error fatal en la elimnación");
	}

}
