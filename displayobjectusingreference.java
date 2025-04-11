class Birds{
    int age;
    String name;
    
    public int age(){
        return age;
    }
    public String name(){
        return name;
    }

    public static void main(String[] args) {
        Birds hello = new Birds();
        hello.age =10;
        hello.name = "Navin";
        System.out.println(hello.name() + " is of age " + hello.age()); 
    }
}