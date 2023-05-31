package d_Interface_Segregation_ISP;

/*
By separating interfaces into units,
this principle helps in reducing dependencies
and promoting flexibility in code design

It means that we should design smaller
and more specific interfaces

`Machine` interface violates the ISP because
it includes methods for both printing and scanning,
which may not be supported by all implementing classes.

 */
public interface Machine {
    void print();
    void scan();
}

class AllInOneMachine implements Machine {
    public void print() {
        // Print a document
    }

    public void scan() {
        // Scan a document
    }
}

class PrinterMachine implements Machine {
    public void print() {
        // Print a document
    }

    public void scan() {
        throw new UnsupportedOperationException("Scanning not supported on this machine");
    }
}

