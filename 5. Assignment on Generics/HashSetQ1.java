package Assignment5;
import java.util.*;  

class Details {  
	int id;  
	String name,department;  
	int salary;

public Details(int id, String name, int salary, String department) {  
    this.id = id;  
    this.name = name;
    this.salary = salary;
    this.department = department;    
    
    }
}  

public class HashsetQ1 {  
	public static void main(String[] args) {  
		
	    HashSet<Details> set=new HashSet<Details>();  
	     
	    Details b1=new Details(1,"Soumya", 20000, "Development");  
	    Details b2=new Details(2,"Subham", 18000, "Testing");  
	    Details b3=new Details(3,"Sourav", 18500, "Marketing");  
	      
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);
    
	    for(Details b:set){  
	    System.out.println(b.id+" "+b.name+" earns "+b.salary+" Dept: "+b.department);
	    }
	  }
	}  

