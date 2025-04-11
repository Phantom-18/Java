class HeyThere{
    void Heyy(String name){
        System.out.println("Hey there!!!");
    }
}
class Helloooo extends HeyThere{
    void Heyy(String name){
        System.out.println("@####");
    }
    public static void main(String[] args) {
        HeyThere ht = new HeyThere();
        ht.Heyy("Gourab");

        Helloooo hl = new Helloooo();
        hl.Heyy("Gourab");
    }
}
/*Different class but have the same method name and also the parameters are different(but can also be same as we call the methods of different class having same name) which assigns which method has to be selected */