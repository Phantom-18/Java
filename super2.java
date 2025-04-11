/*'super' keyword can invoke immediate parent class method */
class Anil{
    void s1(){
        System.out.println("Hey....");
    }
}
class super2 extends Anil{
    @Override
    void s1(){
        System.out.println("What's up..");
    }
    void show(){
        s1();
        super.s1();
    }
    public static void main(String[] args) {
        super2 obj = new super2();
        obj.show();
    }
}