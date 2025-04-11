class Demo{
    String colour;
    int age;
    void initObj(String c, int a){
        colour = c;
        age = a;
    }
    void display(){
        System.out.println(colour + " " + age);
    }
    public static void main(String[] args) {
        Demo de = new Demo();
        de.initObj("Black", 10);
        de.display();
    }
}