package OOPS.InterFaces;

public class Car implements Engine,Break{

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("I accelerate like a normal car");
    }
    
}
