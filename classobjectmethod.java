class Animal {

    public void running(){
        System.out.println("I am running");
    }

    public static void main(String[] args) {
        System.out.println("When");

        Animal run = new Animal();
        run.running();
        Fly fl = new Fly();
        fl.fly();
    }
    
}

class Fly{
    public void fly(){
        System.out.println("I am flying");
    }
}
/* This is how to create class and methods and use objects to call the method */