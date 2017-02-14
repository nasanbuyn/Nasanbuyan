 package dataStructures;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MyStack extends DerivedArrayStack{
    public MyStack(int initialCapacity){
    	super(initialCapacity);
   }
    public MyStack() {
		// TODO Auto-generated constructor stub
	}
	public MyStack rand()
    {
    	Scanner k = new Scanner(System.in);
    	ArrayList list = new ArrayList();
    	
    	System.out.println("hemjeeg oruulna uu?");
    	int a = k.nextInt();
    	MyStack stack1 = new MyStack(a);
    	MyStack stack2 = new MyStack(a);
    	System.out.println("stack element:");
   for(int i = 0; i<a; i++){
	   int b = k.nextInt();
	  stack1.push(b);
	  
  }
   while(!stack1.empty()){
   list.add(stack1.peek());
   stack1.pop();
   //System.out.println(list);
   }
      Collections.shuffle(list);
   //System.out.println(list);
   
   for(int i = 0; i<list.size(); i++){
   stack1.push(list.get(i));
  
    }
return stack1;   
    }
	public MyStack unique(){
		Scanner inpu  = new Scanner(System.in);
		ArrayList list = new ArrayList();
				
		
		System.out.println("jagsaaltiin hemjeeg oruulna uu?");
		int a = inpu.nextInt();
		MyStack stack1 = new MyStack(a);
		MyStack stack2 = new MyStack(a);
		for(int i =0; i<a; i++){
		int b = inpu.nextInt();
		stack1.push(b);
						
		}
		while(!stack1.empty()){
			if(!list.contains(stack1.peek())){
				list.add(stack1.peek());
			}
			
			stack1.pop();
		}
		
	    for(int i = list.size()-1; i>=0; i--){
	    	stack1.push(list.get(i));
	    	    }
return stack1;
	  }
	public MyStack addRange(){
		int array[];
		ArrayList list = new ArrayList();
		Scanner inpu1 = new Scanner(System.in);
		System.out.println("stack size:");
		int a = inpu1.nextInt();
		System.out.println("array size:");
		int a1 = inpu1.nextInt();
		array = new int[a1];
		MyStack stack1 = new MyStack(a);
		MyStack stack2 = new MyStack(a);
		System.out.println("stack element:");
		for(int i = 0; i<a; i++){
			int b = inpu1.nextInt();
			stack1.push(b);
		}
		
		System.out.println("array element:");
		for(int j=0; j<array.length; j++){
			array[j] = inpu1.nextInt();
			stack1.push(array[j]);
		}
		while(!stack1.empty()){
			stack2.push(stack1.peek());
			stack1.pop();
		}
		
		return stack2;
	}
	public MyStack toArray(){
		Scanner inpu2 = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("stack size:");
		int a = inpu2.nextInt();
		MyStack stack1 = new MyStack(a);
		MyStack stack2 = new MyStack(a);
		System.out.println("stack elements:");
		for(int i = 0; i<a; i++){
			int b = inpu2.nextInt();
			stack1.push(b);
		}
		while(!stack1.empty()){
			arr.add(stack1.peek());
			stack1.pop();
		}
		for(int i = 0; i<arr.size(); i++){
			stack1.push(arr.get(i));
		}
		return stack1;
		
	}
	public boolean exists(Object element){
		int k =0;
		Scanner inpu3 = new Scanner(System.in);
		boolean egg = false ;
		for(int i = 0; i<super.size(); i++){
			if(element==super.peek()){
				super.pop();
				k+=1;
			}
		}
			if(k==0){
                egg = false;		
					}
			if(k>0){
				egg = true;
			}
		return egg;
      	
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		System.out.println("------------------------------------------------");
		System.out.println("1.stack-n elementuudiig sanamsargui holij gargah");
		System.out.println("2.Dawhardsan elementuudiig hasah");
		System.out.println("3.addRange");
		System.out.println("4.toArray");
		System.out.println("5.boolean");
		System.out.println("------------------------------------------------");
		int key = k.nextInt();
		int vi;
		
		if(key==1){
		MyStack stack1 = new MyStack();
		MyStack stack2 = stack1.rand();
		
		for(int i =0; i<stack2.size(); i++){
			System.out.println(stack2.get(i));
		}
		}
		if(key==2){
		MyStack stack1 = new MyStack();
		MyStack stack2 = stack1.unique();
		for(int i =0; i<stack2.size(); i++){
			System.out.println(stack2.get(i));
		}
		
	}
		if(key==3){
			MyStack stack2 = new MyStack();
			MyStack stack1 = stack2.addRange();
			System.out.println("addRange:");
			for(int i =0; i<stack1.size(); i++){
				System.out.println(stack1.get(i));
		}
	}
		if(key==4){
			MyStack stack1 = new MyStack();
			MyStack stack2 = stack1.toArray();
			System.out.println("toArray:");
			for(int i =0; i<stack2.size(); i++){
			System.out.println(stack2.get(i));
		}
}
		if(key==5){
			Object gu = new Object();
			System.out.println("stack size");
			int u = k.nextInt();
			MyStack g = new MyStack();
			System.out.println("stack element:");
			for(int i = 0; i<u; i++){
				int b = k.nextInt();
			g.push(b);
			}
			System.out.println("shalgah utga:");
			gu = k.nextInt();
			boolean t = g.exists(gu);
			System.out.println(t);
		}
	}
}

