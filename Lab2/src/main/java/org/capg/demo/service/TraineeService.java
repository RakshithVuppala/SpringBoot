package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Trainee;

public interface TraineeService {
	public List<Trainee> printAllTrainee();
	public List<Trainee> findByName(String name);
	public Trainee findById(int id);
	public List<Trainee> deleteTrainee(int id);
	public List<Trainee> insertTrainee(Trainee t);
	public List<Trainee> updateTrainee(Trainee t);
}
