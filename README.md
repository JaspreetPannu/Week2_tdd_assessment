# Week2_tdd_assessment


Assessment

Trainees have 1 hour to use TDD to write appropriate tests and the implementing code to meet the below requirements. The implementing classes must implement the appropriate service interface provided.

Trainees are provided with two interface files:

· TaxCalculationService

o This service requires an implementing class (ScottishTaxCalculator) that fulfils the interface contract. To be successful, the implementing class must return the appropriate double value representing a tax percentage when a double representing an income is passed in. They are as follows:

§ 0.0% when less than or equal to £11,500.

§ 19.0% when greater than or equal to £11,851 but less than or equal to £13,850.

§ 20.0% when greater than or equal to £13,851 but less than or equal to £24,000.

§ 21.0% when greater than or equal to £24,001 but less than or equal to £44,273.

§ 41.0% when greater than or equal to £44,274 but less than or equal to £150,000.

§ 46.0% when greater than £150,000.

· GroupControllerService

o This service requires an implementing class that fulfils the interface contract. To be successful, the implementing class must return objects of the appropriate type and meet the requirements specified below (you may require some mock objects to fully test):

§ When asking the service implementation for all trainees, the trainees should be read from the DatabaseReader class (you should use the class provided and do not need to implement the database reader’s methods).

§ When removing a trainee by their username, a DatabaseWriter object should be called (you should use the class provided and do not need to implement the database writer’s methods) from the service implementation.

§ When adding a trainee through the service implementation, the trainee should be passed to a DatabaseWriter object(you should use the class provided and do not need to implement the database writer’s methods)
