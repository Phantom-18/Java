class H{
    void showH(){
        System.out.println("H class methods");
    }
}
class I extends H{
    void showI(){
        System.out.println("I class methods");
    }
}
class J extends H{
    void showJ(){
        System.out.println("J class methods");
    }
    public static void main(String[] args) {
        H h = new H();
        h.showH();

        I i = new I();
        i.showH();
        i.showI();

        J j = new J();
        j.showH();
        j.showI();
        j.showJ();
    }
}
/*we can access the methods of H through J but can'tdo that for I as J doesn't extend to I
 this is an example of Hierarchial Inheritance */

