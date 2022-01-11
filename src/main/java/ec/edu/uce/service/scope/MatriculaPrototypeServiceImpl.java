package ec.edu.uce.service.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MatriculaPrototypeServiceImpl implements IMatriculaPrototypeService {

	private String nombre;

	@Override
	public String establecerNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
		return null;
	}

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	// Metodos SET y GET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
