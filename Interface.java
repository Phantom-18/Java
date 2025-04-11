interface I1{
    public void show();
}
interface I2{
    public void display();
}
public class Interface implements I1, I2{ //this is multiple inheritance 
    @Override
    public void show(){
        System.out.println("Hey there!!!");
    }
    @Override
    public void display(){
        System.out.println("I am Gourab");
    }
    public static void main(String[] args) {
        Interface i1 = new Interface();
        i1.show();
        Interface i2 = new Interface();
        i2.display(); 
    }
    
}
// code is correct but due to compiler error it's not working