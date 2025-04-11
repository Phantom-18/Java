// 'this' keyword can be used to refer current class instance variable
class Demo1{
	int a;
	void setval(int a){
		this.a = a;
	}
	void show(){
		System.out.println(a);
	}
	public static void main(String[] args){
		Demo1 d = new Demo1();
		d.setval(1000);
		d.show();
	}
}