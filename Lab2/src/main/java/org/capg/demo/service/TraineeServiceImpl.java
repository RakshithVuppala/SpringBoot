package org.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Trainee;
import org.capg.demo.dao.TraineeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jpaService")
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeJpaRepository tDao;
	
	@Override
	public List<Trainee> printAllTrainee() {
		
		return tDao.findAll();
	}

	@Override
	public List<Trainee> findByName(String name) {
		return tDao.findByTraineeName(name);
	}

	@Override
	public Trainee findById(int id) {
		Optional<Trainee> op= tDao.findById(id);
		if(op.isPresent())
			return op.get();
		return null;
	}

	@Override
	public List<Trainee> deleteTrainee(int id) {
		tDao.deleteById(id);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> insertTrainee(Trainee t) {
		tDao.saveAndFlush(t);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> updateTrainee(Trainee t) {
		tDao.saveAndFlush(t);
		return tDao.findAll();
	}

	
}
