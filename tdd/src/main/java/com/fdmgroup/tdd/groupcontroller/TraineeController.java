package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class TraineeController implements GroupControllerService {

	private DatabaseReader dr;
	private DatabaseWriter dw;

	public TraineeController(DatabaseReader dr, DatabaseWriter dw) {
		// TODO Auto-generated constructor stub
		
		this.dr = dr;
		this.dw = dw;
		
	}

	public void addTrainee(Trainee any) {
		// TODO Auto-generated method stub
		dw.addTrainee(any);
		
	}

	public Map<String, Trainee> getAllTrainees() {
		return dr.readGroup();
		// TODO Auto-generated method stub
		
	}

	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		
		dw.deleteTraineeByUsername(traineeUsername);
		
	}

}
