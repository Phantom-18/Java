class E{
    void showE(){
        System.out.println("E class methods");
    }
}
class F extends E{
    void showF(){
        System.out.println("F class methods");
    }
}
class G extends F{
    void showG(){
        System.out.println("G class methods");
    }
    public static void main(String[] args) {
        E e = new E();
        e.showE();

        F f = new F();
        f.showE();
        f.showF();

        G g = new G();
        g.showE();
        g.showF();
        g.showG();
    }
}
/*code is correct but not runnung due to compiler error */

