class Test{
    String name;
    int age;

    public Test(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Test t1 = new Test("Gourab", 22);
        Test t2 = new Test("Ghanshyam", 20);
        System.out.println(t1.name +" " + t2.name);
    }
}