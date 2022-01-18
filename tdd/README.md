Object Oriented Development
Week 2 Assessment – TDD Code

Assessment

Trainees have 1 hour to use TDD to write appropriate tests and the implementing code to meet the below requirements. **The implementing classes must implement the appropriate service interface provided.**

Trainees are provided with two interface files: 

* TaxCalculationService
    * This service requires an implementing class (ScottishTaxCalculator) that fulfils the interface contract. To be successful, the implementing class must return the appropriate double value representing a tax percentage when a double representing a income is passed in. They are as follows:
        * 0.0% when less than or equal to £11,850.
        * 19.0% when greater than or equal to £11,851 but less than or equal to £13,850.
        * 20.0% when greater than or equal to £13,851 but less than or equal to £24,000.
        * 21.0% when greater than or equal to £24,001 but less than or equal to £44,273.
        * 41.0% when greater than or equal to £44,274 but less than or equal to £150,000.
        * 46.0% when greater than £150,000.
* GroupControllerService
    * This service requires an implementing class that fulfils the interface contract. To be successful, the implementing class must return objects of the appropriate type and meet the requirements specified below (you may require some mock objects):
        * When asking the service implementation for all trainees, the trainees should be read from a DatabaseReader object (you do not need to fully implement the database reader’s methods).
        * When removing a trainee by their username, a DatabaseWriter object should be called (you do not need to fully implement the database reader’s methods) from the service implementation.
        * When adding a trainee through the service implementation, the trainee should be passed to a DatabaseWriter object(you do not need to fully implement the database reader)

Marking Scheme:
* Fail
    * Unable to meet either of the Service requirements
* Pass
    * The ScottishTaxCalculator implementation of TaxCalculatorService returns the correct values and there are passing JUnit tests that prove this.
* Merit
    * A GroupControllerService implementation has the correct behaviour and there are passing JUnit tests that prove this.
* Distinction
    * GroupControllerService and TaxCalculatorService both have implementations that have the correct behaviour with passing tests that prove this using both Mockito and JUnit tests where appropriate. 

   

