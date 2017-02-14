package dataStructures;
import java.util.*;
public class MyHash {
  
	protected static class HashEntry{
		protected Object key;
		protected Object element;
		private HashEntry(){
					}
		private HashEntry(Object theKey, Object theElement){
			key = theKey;
			element = theElement;
					}
	}
	protected int divisor;
	protected HashEntry[] table;
	protected int size;
	public MyHash(int theDivisor){
		divisor = theDivisor;
		table = new HashEntry[divisor];
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public int size(){
		return size;
	}
	private int search(Object theKey){
		int i = Math.abs(theKey.hashCode())%divisor;
		int j = i;
		do{
			if(table[j]==null || table[j].key.equals(theKey))
				return j;
			j = (j+1) % divisor;
		}while (j != 1);
		return j;
	}
	public Object get(Object theKey){
		int b = search(theKey);
		if(table[b] == null || !table[b].key.equals(theKey))
			return null;
		return table[b].element;
		
	}
	public Object put(Object theKey, Object theElement){
		int b = search(theKey);
		if(table[b] == null){
			table[b] = new HashEntry(theKey, theElement);
			size++;
			return null;
		}else{
			if(table[b].key.equals(theKey)){
				Object elementToReturn = table[b].element;
				return elementToReturn;
				
			}else
				throw new IllegalArgumentException("уучлаарай хүснэгт дүүрсэн байна");
		}
	}
		public void output(){
			for(int i = 0; i<divisor; i++)
				if(table[i] == null)
					System.out.println("Хоосон");
				else
					System.out.println(table[i].element);
		}
	public Object updateElement(Object theKey, Object theElement1){
		table[search(theKey)].element = theElement1;
		Object elementToUpdate = table[search(theKey)];
		
		return elementToUpdate;
	}
	public Object updateToKey(Object theKey, Object theNewKey){
		
		Object elementToUpdate = table[search(theKey)].element;
		delete(theKey);
		put(theNewKey, elementToUpdate);
	return elementToUpdate;
	}
	public void delete(Object theKey){
		table[search(theKey)] = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyHash h = new MyHash(35);
    Scanner in = new Scanner(System.in);
    System.out.println("--------програмыг ажиллуулах командууд--------");
    System.out.println("");
    System.out.println("Оюутан нэмж бүртэгэх бол   :-----command = нэмэх");
    System.out.println("Оюутан бүртэглээс хасах бол:-----command = хасах");
    System.out.println("Оюутаны мэдээлэл харах бол :-----command = харах");
    System.out.println("Оюутан хайх бол            :-----command = хайх");
    System.out.println("Оюутаны код шинчлэх бол    :-----command = Кодшинчлэх");
    System.out.println("Оюутаны нэр шинчлэх бол    :-----command = Нэршинчлэх");
    System.out.println("");
    String temp = "exit";
    String command = "";
    while(command.equals(temp)==false){
    	try{
    		System.out.println("Та коммандаа оруулна уу:");
    		command = in.next();
       		if(command.equals("нэмэх")){
    			System.out.println("Оюутаны код:");
    			String code = in.next();
    			System.out.println("Оюутаны нэр:");
    			String name = in.next();
    			int key = Integer.parseInt(code.substring(2));
    			h.put(key, name);
    			System.out.println("Амжилттай бүртгэгдлээ!");
    		}
    		if(command.equals("хасах")){
    			System.out.println("Оюутаны код:");
    		    String removedCode = in.next();
    		    int key = Integer.parseInt(removedCode.substring(2));
    		    h.delete(key);
    		    System.out.println(removedCode+" устгагдлаа");
    	}
    		if(command.equals("харах")){
    		h.output();
    }
    		if(command.equals("хайх")){
    			String searchedCode = in.next();
    			int key = Integer.parseInt(searchedCode.substring(2));
    			System.out.println(h.get(key));
    		}
    		if(command.equals("Кодшинчлэх")){
    			System.out.println("Оюутаны код:");
    			String OldCode = in.next();
    			System.out.println("шинчилсэн код:");
    			String NewCode = in.next();
    			int oldKey = Integer.parseInt(OldCode.substring(2));
    			int newKey = Integer.parseInt(NewCode.substring(2));
    			h.updateToKey(oldKey, newKey);
    			System.out.println("Амжилттай заслаа !");
    		}
    		if(command.equals("Нэршинчлэх")){
    			System.out.println("Оюутаны код:");
    			String Code = in.next();
    			System.out.println("шинчилсэн нэр:");
    			String newName = in.next();
    			int key = Integer.parseInt(Code.substring(2));
    			h.updateElement(key, newName);
    			System.out.println("Амжилттай заслаа!");
    		}
    		
    		
    			}catch(Exception e){
    				System.out.println("Мэдээллээ шалагна уу?");
    			}

}
}
}