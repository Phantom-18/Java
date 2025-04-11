final class Deka{
    void mask(){
        System.out.println("The mask is here");
    }
}
class Final_class extends Deka{ //ths class can't be inheroted as it's final class
    @Override
    void mask(){
        super.mask();
        System.out.println("It's duplicate mask");
    }
    public static void main(String[] args) {
        Final_class fc = new Final_class();
        fc.mask();
    }
}