class Testing{
    void show(int a, int b){
        System.out.println("Hello");
    }

    void show(String name){
        System.out.println("Gourab");
    }

    public static void main(String[] args) {
        Testing test = new Testing();
        test.show("Gourab");
        test.show(12, 14);
    }
}