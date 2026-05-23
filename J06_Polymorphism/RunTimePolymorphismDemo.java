// Run-time polymorphism is also known as dynamic polymorphism or late binding. Run-time polymorphism is a polymorphism that is resolved during the run time process. Runtime polymorphism is achieved through method overriding, where a subclass provides its own implementation of a method that is already defined in the parent class.

// When a subclass provides a specific implementation for a method that is already defined in its parent class, it is called Method Overriding. The overridden method in the subclass must have the same name, parameters, and return type as the method in the parent class.

package J06_Polymorphism;

class Bird {
    void fly() {
        System.out.println("Bird is flying...!");
    }
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flies high...!");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flies small distances...!");
    }
}

class RunTimePolymorphism {
    public static void main(String[] args) {
        Bird b1 = new Eagle();      //upcasting
        Bird b2 = new Sparrow();   //upcasting

        b1.fly();
        b2.fly();
    }
}
