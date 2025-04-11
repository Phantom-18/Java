class ANIMAL{

    void eat(){
        System.out.println("I am eating");
    }
}
class DOG extends ANIMAL{
    public static void main(String[] args) {
        DOG dog = new DOG();
        dog.eat();
    }
}