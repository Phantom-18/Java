class Testing{
    static void show(){
        System.out.println("Hello");
    }
    void showing(){
        System.out.println("Showing");
    }
    public static void main(String[] args) {
        Testing testing = new Testing();
        Testing.show();
        /*'show()' also gives output as we are calling the static method in the same class*/
        testing.showing();
    }
}