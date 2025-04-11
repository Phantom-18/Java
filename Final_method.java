class Memo{
    final void m1(){
        System.out.println("Heyyyy");
    }
}
class Final_method extends Memo{
    /*@Override
    void m1(){
        System.out.println("heyyyy");
    }*/ //this method produces error as final method can't be overridden
    public static void main(String[] args) {
        Final_method fm = new Final_method();
        fm.m1();
    }
}