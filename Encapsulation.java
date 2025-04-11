class Employee{
    private int empid;//data hiding
    public void setEmpid(int eid){
        empid = eid;
    }
    public int getEmpid(){
        return empid;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}