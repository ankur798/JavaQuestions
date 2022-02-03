

class A{
	int x;
	A(){
		x = 2;
		System.out.println("A Default Cons"+x);//2
	}
	A(int x ){
		this();
		x = 5;
		System.out.println("A Param Cons Call"+x);//5
		this.x = x + x;//12
	}
}
class B extends A{
	int x;
	B(){
		super(2);
		x++;
		System.out.println("B Default Cons call"+x);
	}
	B(int x){
		super(x * x);
		this.x = x + 2;//5
		System.out.println("B Param cons call"+x);//3
	}
	
}
class C extends B{
	int x;
	C(){
		super(3);
		x+=2;//2
		System.out.println("C Default Cons"+x);//2
	}
	C(int x){
		this();
		this.x = this.x + x + super.x + ((A)this).x;/*2+100+5+12*/
		System.out.println("X in C Param Cons Call "+this.x);//119
	}
}
public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C(100);
		

	}

}

