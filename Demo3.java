// 3. 'this' can be used to invoke current class constructor
/*class Demo3{
	Demo3(){	
		System.out.println("no argument constructor");
	}
	Demo3(int a){
		this();//this calls the no argument constructor;
		System.out.println("Parameterized constructor");
		
	}
	public static void main(String[] args){
		Demo3 d3 = new Demo3(11);
	}
}*/

class Demo3{
	Demo3(){
		this(120);// cals the parameterized constructor	
		System.out.println("no argument constructor");
	}
	Demo3(int a){
		System.out.println("Parameterized constructor");
		
	}
	public static void main(String[] args){
		Demo3 d3 = new Demo3();
	}
}
//Note:- Both the constructors can't be called together