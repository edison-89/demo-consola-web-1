package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void calcularDeuda();

	void guardarPaciente(Paciente paciente);// C

	void buscarPaciente(String cedula);// R

	void actualizarPaciente(Paciente paciente); // U

	void borrarPaciente(String cedula); // D
}
