package com.fdmgroup.tdd.groupcontroller;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class GroupControllerServiceTest {
	
	@Test
	public void test_GetAllTrainees() {
		// Mock
				DatabaseReader mockDR = mock(DatabaseReader.class);
				DatabaseWriter mockDW = mock(DatabaseWriter.class);
				TraineeController controller = new TraineeController(mockDR, mockDW);
				Trainee Jaspreet = new Trainee();

				//act
				controller.addTrainee(Jaspreet);
				controller.getAllTrainees();

				//verify
				verify(mockDR).readGroup();
		
	}
	
	@Test
	public void test_DeleteTrainee() {

		// Mock
		DatabaseReader mockDR = mock(DatabaseReader.class);
		DatabaseWriter mockDW = mock(DatabaseWriter.class);
		TraineeController controller = new TraineeController(mockDR, mockDW);
		Trainee Jaspreet = new Trainee();

		//act
//		controller.addTrainee(Jaspreet);
		controller.removeTraineeByUsername("Jaspreet");

		//verify
		verify(mockDW).deleteTraineeByUsername("Jaspreet");

	}
	
	@Test
	public void test_AddTrainee() {

		//Arrange or Mock
		DatabaseReader mockDR = mock(DatabaseReader.class);
		DatabaseWriter mockDW = mock(DatabaseWriter.class);
		TraineeController controller = new TraineeController(mockDR, mockDW);
		Trainee Jaspreet = new Trainee();

		//act
		controller.addTrainee(Jaspreet);

		//verify
		verify(mockDW).addTrainee(Jaspreet);

	}

	
}
