/**
 * Created by java_dev on 26.06.17.
 */
public class Calculator {
    public static abstract class Operation  {
        private final String name;
        Operation(String name) { this.name = name; }
        public String toString() { return this.name; }

        //  Performs an arithmetic operation represented by this constant

        abstract double eval(double х, double у);

        //  Double nested anonymous classes

        public static final Operation PLUS = new Operation("+"){ double eval(double х, double у) { return х + у; }
        };
        public static final Operation MINUS = new Operation("-"){ double eval(double x, double y) {return x - y; }
        };
        public static final Operation TIMES = new Operation("*"){ double eval(double х, double у) {return х * у; }
        };
        public static final Operation DIVIDE = new Operation("/"){ double eval(double х, double у) { return х / у; }
        };
    }

    //  Returns the result of the specified operation

    public double calculate(double x, Operation operation, double у) { return operation.eval(x, у);
    }
}
