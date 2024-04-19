package anuj;

import java.lang.Comparable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
             

//Assigning Default vALUE to the object

//public class First {
//	String name;
//	int id;
//	
//	public void display() {
//		System.out.println(id+" "+name);
//	}
//
//	public static void main(String[] args) {
//		First f1= new First();
//		First f2= new First();
//		f1.display();
//		f2.display();
//		
//	
//	
//		
//	}
//	
//
//}
//public class First
//{  
//    First(int a, int b)  
//    {  
//        System.out.println("a = "+a+" b = "+b);  
//    }  
//    First(int a, float b)  
//    {  
//        System.out.println("a = "+a+" b = "+b);  
//    }  
//    public static void main (String args[])  
//    {  
//        byte a = 10;   
//        float b = 15.2f;  
//        First test = new First(a,b);  
//    }  
//}  
//
//public class First {
//	public static void main(String[] args) {
//		Long num1 = 100L;
//		Long num2 = 100L;
//		Long num3 = 500l;
//		long num4 = 500l;
//
//		System.out.println(num3==num4);
//		if (num1 == num2) {
//			System.out.println("num1==num2");
//		}
//
//		else {
//			System.out.println("num1!=num2");
//	}
//		if (num3 == num4) {
//			System.out.println("num3==num4");
//		} else {
//			System.out.println("num3!=num4");
//		}
//	}
//
//}
////		

//class First{
//	int price;
//	String author;
//@Override
//public String toString() {
//	return price+" "+author;
//   }
//public static void main(String[] args) {
//	First f= new First();
//	f.price=2000;
//	f.author="Anuj";
//	System.out.println(f);
//}
//	
//}

//
//class First{
//static int a;
// String b;
//public First(String b){this.b=b;}
//public String toString() {
//	return a+" "+b;
//}
//public static void main(String[] args) {
//First n=new First("Anuj");
//
// System.out.println(a);
// System.out.println(n);
//}
//}


//
//class First{
//	String name;
//	String name1;
//	@Override
//	public String toString() {
//		return name;
//	}
//
//	
//public static void main(String[] args) {
//	First f= new First();
//	f.name="Qspider";
//	f.name1="Chandigarh";
//	System.out.println(f);
//	System.out.println(f.name);
//	
//	
//}
//}





//boolean equals(object o)

//
//class First{
//	String name;
//	
//
//	@Override
//	public boolean equals(Object obj) {
//		First f=(First)obj;
//		if (this.name==f.name)
//			return true;
//		else
//			return false;
//	}
//public static void main(String[] args) {
//	First f= new First();
//	f.name="Chandigarh";
//	First f1= new First();
//	f1.name="Chandigarh";
//	System.out.println(f);
//	System.out.println(f1.name);
//	System.out.println(f.equals(f1));
//	
//}
//}
//

//
//
//class First{
//	String name;
	

//	@Override
//	public boolean equals(Object obj) {
//		First f=(First)obj;
//		if (this.name==f.name)
//			return true;
//		else
//			return false;
//	}
	
//	@Override
//	public int hashCode() {
//		int n=Objects.hash(name);
//		return n;
//	}
//public static void main(String[] args) {
//	First f= new First();
//	f.name="Chandigarh";
//	First f1= new First();
//	f1.name="Chandigar";
//
//	System.out.println(f.equals(f1));
//	First f2=f1;
//	
//	System.out.println(f.hashCode());
//	System.out.println(f1.hashCode());
//	System.out.println(f2.hashCode());
//}
//}
//
//class First{
//	public static void main(String[] args) {
//		int[] a= {9,8,0,5,2,1,4,5,7,5};
//		for(int i:a) {
//			System.out.println(i);
//		}
//		
//	}
//}

//class First{
//	private int id;
//	
//	public void setId(int id) {
//		this.id=id;
//		
//	}
//	public int getId() {
//		return id;
//	}
//	
//		public static void main(String[] args) {
//			First d=new First();
//			d.setId(101);
//			System.out.println(d.getId());
//		}
//	
//}
//Default constructor
//class First{
//	First(){
//		System.out.println("Default constructor");
//	}
//	public static void main(String[] args) {
//		First f= new First();
//		
//				
//	}
//}


// Parameterized Constructor

//
//class First{
//	int id;
//	String name;
//	First(int id){
//		this.id=id;
//		
//	}
//	First(int id, String name){
//		this(id);
//		this.name=name;
//	}
//	public static void main(String[] args) {
//		First f=new First(101,"Anuj");
//		System.out.println(f.id);
//	}
//}
// Method Overloading
//class First{
//	static int a;
//	static int b;
//	static int c;
//	static int First(int a, int b){
//		return a+b;
//	}
//	static int First(int a,int b,int c){
//		return a+b+c;
//	}
//	public static void main(String[] args) {
//		System.out.println(First.First(1,2));
//		System.out.println(First.First(1, 2, 3));
//	}
//}
//


//SIngle Inheritence

//class Third{
//	void eat() {
//		System.out.println("eating....");
//	}}
//	
//	class Second extends Third{
//		void drink() {
//			System.out.println("Drinking Water...");
//		}}
//	class First{
//		public static void main(String[] args) {
//		Second e=new Second();
//			e.drink();
//			e.eat();
//		
//}}

//Single Inheritance
//class Animal{  
//void eat(){System.out.println("eating...");}  
//}  
//class Dog extends Animal{  
//void bark(){System.out.println("barking...");}  
//}  
//class First{  
//public static void main(String args[]){  
//Dog d=new Dog();  
//d.bark();  
//d.eat();  
//}}  


// Multilevel Inheritance
//
//class Bank{
//	void Sbi() {System.out.println("Sbi Bank Is invoked.....");
//}}
//class Bank1 extends Bank{
//	void Pnb() {System.out.println("PNB BANK IS INVOKED...");
//}}
//class Bank2 extends Bank1{
//	void Uco() {System.out.println("Uco Bank is Invoked....");
//}}
//
//class First{
//	public static void main(String[] args) {
//		Bank2 p=new Bank2();
//		p.Uco();
//		p.Pnb();
//		p.Sbi();
//		
//	}
//}


// Heriarchical Inheritance
//class Bank{
//	void Sbi() {System.out.println("SBI BANK IS INVOKED");
//}}
//class Bank1 extends Bank{
//	void Pnb() {System.out.println("PNB BANK IS INVOKED");
//}}
//class Bank2 extends Bank{
//	void Uco() {System.out.println("UCO BANK IS INVOKED");
//	
//	}}
//class First{
//	public static void main(String[] args) {
//		Bank2 b=new Bank2();
//		b.Uco();
//		b.Sbi();
//	//	b.Pnb(); error
//		System.out.println("Object for second class");
//		Bank1 b1=new Bank1();
//		b1.Pnb();
//		b1.Sbi();
//	//	b1.Uco(); error
//	}
//}


//Why multiple inheritance is not supported

//class A{
//	void msg() {System.out.println("Hello");
//}}
//class B extends A{
//	void msg() {System.out.println("Anuj");
//}}
//class C extends A,B{
//// Suppose
//}}
//class First{
//	public static void main(String[] args) {
//		C a=new C();
//		a.msg();
//		
//	}
//}

// Method Overriding
//class Bank{
//	int roi() {return 0;
//}}
//class Sbi extends Bank{
//	int roi() {return 5;}
//}
//class Pnb extends Bank{
//	int roi() {return 8;}
//}
//class Uco extends Bank{
//	int roi() {
//		return 7;
//	}
//}
//class First{
//	public static void main(String[] args) {
//		Sbi s=new Sbi();
//		Pnb p=new Pnb();
//		Uco u=new Uco();
//		System.out.println(s.roi());
//		System.out.println(p.roi());
//		System.out.println(u.roi());
//	}
//}

// Upcasting (Converting child reference to parent type)
//class Bank{
//	int roi() {return 0;
//}}
//class Sbi extends Bank{
//	int roi() {return 5;}
//}
//class Pnb extends Bank{
//	int roi() {return 8;}
//}
//class Uco extends Bank{
//	int roi() {
//		return 7;
//	}
//}
//class First{
//	public static void main(String[] args) {
////		Sbi s=new Sbi();
////		Pnb p=new Pnb();
////		Uco u=new Uco();
////		System.out.println(s.roi());
////		System.out.println(p.roi());
////		System.out.println(u.roi());
//		Bank b=new Uco();//Upcasting
//		System.out.println(b.roi());
//	
//		//Downcasting
//		Uco c=(Uco)b;
//		System.out.println(c.roi());
//	}
//}

//
//class First{
//	public static void main(String[] args) {
//		char a=1;
//		char b=2;
//		System.out.println(a+b);
//	}
//}

// to string 
//class First{
//	String name;
//	First(){
//		this.name="Anuj";
//	}
////	@Override
////	public String toString() {
////		return name;
////	}
//	public static void main(String[] args) {
//		First f=new First();
//		System.out.println(f);
//	}
//}

//equals 
//class First{
//	int a;
//	@Override
//	public boolean equals(Object obj) {
//		First f=(First)obj;
//		if (this.a==f.a) {
//			return true;
//			
//		}else return false;
//	}
//	
//	public static void main(String[] args) {
//		First f= new First();
//		f.a=2;
//		First f1=new First();
//		f1.a=2;
//		System.out.println(f.equals(f1));
//	}
//}


//public int hashcode
//class First{
//	String name;
//	
//	@Override
//	public int hashCode() {
//		int n=Objects.hash(name);
//				return n;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		First f=(First)obj;
//		if(this.name==f.name) {
//			return true;
//		}else return false;
//	}
//	public static void main(String[] args) {
//		First f=new First();
//		First f2=new First();
//		f2.name="Anuj";
//		First f3=new First();
//		System.out.println(f.equals(f3));
//		System.out.println(f.hashCode());
//		System.out.println(f2.hashCode());
//		System.out.println(f3.hashCode());
//	}
//	
//}

// Array concepts
//class First{
//	public static void main(String[] args) {
////		int[] a= {1,2,3,4,5};
////		System.out.println(a[0]);
////		System.out.println(a[1]);
////		System.out.println(a[2]);
////		System.out.println(a[3]);
////		System.out.println(a[4]);
//		int[] a= new int[5];
////		a[3]=4;
////		a[5]=9; exception Array Index out of boundException
////		 
////		Means Size of an array is fixed.
////		System.out.println(a[3]);
//		System.out.println(a.length);
//		
//	}
//}
//
//
//
//class First{
//	public static void main(String[] args) {
//		int[] a= {1,2,3,4,5,6,7,88};
//		for(int n: a) {
// 		  System.out.println(n);
//  		}
// 	}
//}

//
//
//import java.lang.String;
//class First{
//	public static void main(String[] args) {
//		String a="Anuj";
//		System.out.println(a);
//		//Array char
//		char[] b= {'A','n','u','j'};
//		System.out.println(b);
//		
//		System.out.println(a.length());
//		System.out.println(b.length);
//	}
//}
//
//
//class First implements Comparable{
//	String name;
//	
//	First(String name){
//		this.name=name;
//	}
////	@Override
////	public String toString() {
////		return name;
////	}
//	public int compareTo(Object o) {
//		
//		First f =(First)o;
//		return this.name.compareTo(f.name);
//		
//	}
//	public static void main(String[] args) {
//		First f[]= {new First("Anuj"),new First("Sharma")};
//		Arrays.sort(f);
//		for(int i=0; i<f.length;i++) {
//			System.out.println(f[i]);
//		}
//		System.out.println();
//	}
//}

//
//
//class First{
//public static void main(String[] args) {
//	ArrayList al=new ArrayList();
//	al.add(3);
//	al.add(32);
//	System.out.println(al);
//	
//}	
//}
class First{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}