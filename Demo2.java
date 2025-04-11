// 2. 'this' can be used to invoke current class method(implicitly)
class Demo2{
	void display(){
		System.out.print("Hello");
	}
	void show(){
		this.display();//display() gives the same output as the compiler itself considers 'this'
	}
	public static void main(String[] args){
		Demo2 d2 = new Demo2();
		d2.show();
	}
} 