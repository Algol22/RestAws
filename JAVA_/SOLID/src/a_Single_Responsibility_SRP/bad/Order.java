package a_Single_Responsibility_SRP;

/*
The Single Responsibility Principle means that a
class should have only one job to do. It should
focus on doing one specific thing well.
If a class has multiple responsibilities,
it becomes harder to understand and maintain.

the Order class has two responsibilities: creating an order
and saving it to the database.
This violates the SRP.
 */

public class Order_bad {
    public void createOrder() {
        // Create the order
    }

    public void saveOrder() {
        // Save the order to the database
    }
}
