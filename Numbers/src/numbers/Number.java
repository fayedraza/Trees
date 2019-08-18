package numbers;
//created by Fayed Raza
public class Number {
Number left,right;
static Boolean s = true;
static Boolean t = true;
int data;
//purpose is to implements trees which is a data structure
public Number(int data) {
	this.data=data;
}


//adds the number to the left or right
public void addNumber(int x) {
	if(x<=data) {
		if(left == null) {
			left = new Number(x);

		}else {
			left.addNumber(x);

		}
		
	}else if(x>data) {
		if(right == null) {
			right = new Number(x);
			
		}else {
			right.addNumber(x);
	
		}
		
	}
}

//finds the number
public boolean findNumber(int x) {
	if(x==data) {
		return true;
		
	}else if(x>data) {
		if(right == null)
			return false; 
		return right.findNumber(x);

	}else {
	
		
		if(left == null)
			return false; 
		return left.findNumber(x);
	}

	
	
}


//prints all of the numbers
public void print() {
	
	if(s) {		
	System.out.println();
	System.out.println("Numbers");
	}
	s=false;
	if(left != null)
		left.print();
	System.out.println(data);
	if(right != null)
		right.print();
}

public static void main (String[]args) {
	Number a = new Number(5);
	
	a.addNumber(1);
	a.addNumber(2);
	a.addNumber(56);
	a.addNumber(36);
	boolean s =(a.findNumber(8) && a.findNumber(56)) | a.findNumber(5);
	
	System.out.println(s);
	a.print();
	
	
}



}
