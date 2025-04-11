/*'super' keyword can be used to invoke immediate parent class constructr */
class john{
    john(){
        System.out.println("Hiiiiiii...");
    }
}
class super3 extends john{
    super3(){
        super();
        System.out.println("Helloooo");
    }
    public static void main(String[] args) {
        super3 obj3 = new super3();
    }
}/*compiler error */