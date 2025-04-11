abstract class vehicle{
    abstract void start(); 
} 
class car extends vehicle{
    void start(){
        System.out.println("Starts by key");
    }
}
class scooter extends vehicle{
    void start(){
        System.out.println("Starts by kick");
    }
    
    public static void main(String[] args){
        //vehicle v = new vehicle() can't create object for an abstract class
        car c = new car();
        c.start();
        
        scooter sc = new scooter();
        sc.start();
    }
} 