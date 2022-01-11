package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	void insertar(Paciente paciente);//C
	void buscarPorCedula(String cedula);//R
	void actualizar(Paciente paciente); //U
	void borrar(String cedula); //D
}
