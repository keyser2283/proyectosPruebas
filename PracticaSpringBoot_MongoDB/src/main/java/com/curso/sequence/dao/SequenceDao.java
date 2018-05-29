package com.curso.sequence.dao;

import com.curso.sequence.exception.SequenceException;

public interface SequenceDao{
	
	int getNextSequenceId(String key) throws SequenceException;

}

