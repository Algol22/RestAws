package c_LiskovSubstitution_LSP.bad;

/*
The LSP states that objects of a superclass
should be replaceable with objects of its
subclasses without affecting the correctness of the program.

Bicycle class violates the LSP
because it throws an exception
for the startEngine() method, which is not supported.

Robert C. Martin summarizes it:
Subtypes must be substitutable for their base types.
 */
public class Vehicle {
    public void startEngine() {
        // Start the engine
    }
}

class Bicycle extends Vehicle {
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have an engine");
    }
}