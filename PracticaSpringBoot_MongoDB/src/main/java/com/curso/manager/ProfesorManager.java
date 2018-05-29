package com.curso.manager;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.modelo.entidad.Profesor;
import com.curso.modelo.persistencia.ProfesorDao;
import com.curso.sequence.dao.SequenceDao;



@Service
@Transactional
public class ProfesorManager implements IProfesorManager {
	
	private static final String PROFESOR_SEQ_KEY = "profesor";

	@Autowired
	private ProfesorDao profesorDao;
	
	@Autowired
	private SequenceDao sequenceDao;

	public ProfesorDao getProfesorDao() {
		return profesorDao;
	}

	public void setProfesorDao(ProfesorDao profesorDao) {
		this.profesorDao = profesorDao;
	}

	public void insertarProfesor(Profesor p) {
		p.setIdProfesor(sequenceDao.getNextSequenceId(PROFESOR_SEQ_KEY));
		getProfesorDao().save(p);
	}
	
	@Override
	public Profesor obtenerProfesor(int id) {
		return getProfesorDao().findOne(id);
	}
	@Override
	public void updateProfesor(Profesor p) {
		getProfesorDao().save(p);
	}

	@Override
	public void borrarProfesor(Profesor p) {
		getProfesorDao().delete(p);
	}

	@Override
	public List<Profesor> listarProfesores() {
		return getProfesorDao().findAll();
	}

}
