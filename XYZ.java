class ABC{
	int a;
	void setvalue(int a){
		this.a = a;
	}
	void show(){
		System.out.println(a);
	}
}
class XYZ{
	public static void main(String[] args){
		ABC a = new ABC();
		a.setvalue(100);
		a.show();
	}
}// this keyword