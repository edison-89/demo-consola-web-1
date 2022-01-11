package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService {

//	private PacienteRepoImpl paciente = new PacienteRepoImpl(); desacoplamos con Spring
//	private IPacienteRepo paciente = new PacienteRepoImpl(); No se debe acoplar
	@Autowired
	private IPacienteRepo paciente;

	@Override
	public void calcularDeuda() {
		// Traer de la base la dueda
		// Mutiplocarla por 12%
		// Calcularle la multa
		// ......logica
	}

	@Override
	public void guardarPaciente(Paciente paciente) {
		this.paciente.insertar(paciente);
	}

	@Override
	public void buscarPaciente(String cedula) {
		this.paciente.buscarPorCedula(cedula);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		this.paciente.actualizar(paciente);
	}

	@Override
	public void borrarPaciente(String cedula) {
		this.paciente.borrar(cedula);
	}

}
