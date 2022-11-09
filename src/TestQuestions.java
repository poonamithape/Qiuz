import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TestQuestions  {

	public static void main(String[] args) {
		Quiz q=new Quiz();
		q.Logic();
	}
}

class Quiz  {
	int ScoreCount;
	Scanner sc=new Scanner(System.in);
	public void Logic() {
				
		/*List<Questions> questions=new ArrayList<Questions>();
		Random random=new Random();
		for( int i=1;i<=10;i++)
		{
			
		}
       int i=random.nextInt(10);		
		System.out.println(+i);*/

	Questions q1=new Questions(1,"  Which of the following is not an OOPS concept in Java?",
			 "a) Polymorphism" ,
			"b) Inheritance" ,
			"c) Compilation" , 
			"d) Encapsulation\r\n");
	Questions q2=new Questions(2,"  Which of the following is a type of polymorphism in Java Programming?" , 
			"a) Multiple polymorphism",
			"b) Compile time polymorphism", 
			"c) Multilevel polymorphism", 
			"d) Execution time polymorphism \r\n");
	Questions q3=new Questions(3,"  What is the extension of compiled java classes?\r\n" ,
			"a) .txt" , 
			"b) .js" , 
			"c) .class" , 
			"d) .java \r\n");
	Questions q4=new Questions(4,"  Which exception is thrown when java is out of memory?" , 
			"a) MemoryError" , 
			"b) OutOfMemoryError" , 
			"c) MemoryOutOfBoundsException" ,
			"d) MemoryFullException \r\n");
	Questions q5=new Questions(5,"  Which of these are selection statements in Java?\r\n" ,
			"a) break" , 
			"b) continue" , 
			"c) for()" , 
			"d) if()\r\n");
	Questions q6=new Questions(6,"  Which of these keywords is used to define interfaces in Java?" , 
			"a) intf" , 
			"b) Intf" , 
			"c) interface" , 
			"d) Interface\r\n");
	Questions q7=new Questions(7,"  Which of the following is a superclass of every class in Java?" , 
			"a) ArrayList", 
			"b) Abstract class" , 
			"c) Object class" , 
			"d) String\r\n");
	Questions q8=new Questions(8,"  What is the extension of java code files?" , 
			"a) .js" , 
			"b) .txt" , 
			"c) .class" , 
			"d) .java\r\n");
	Questions q9=new Questions(9,"  Which of these packages contains the exception Stack Overflow in Java?", 
			"a) java.io" , 
			"b) java.system" , 
			"c) java.lang" , 
			"d) java.util");
	Questions q10=new Questions(10,"  Which one of the following is not an access modifier?",
			"a) Protected" , 
			"b) Void" , 
			"c) Public",  
			"d) Private \r\n");
		Map<Questions,Character> hmap=new HashMap<>();
	hmap.put(q1, 'c');
	hmap.put(q2, 'b');
	hmap.put(q3, 'c');
	hmap.put(q4, 'b');
	hmap.put(q5, 'd');
	hmap.put(q6, 'c');
	hmap.put(q7, 'c');
	hmap.put(q8, 'd');
	hmap.put(q9, 'c');
	hmap.put(q10, 'b');
	for(Map.Entry<Questions,Character> map:hmap.entrySet()) {
		System.out.print(map.getKey().getQueNo());
		System.out.println(map.getKey().getQuestion());
	System.out.println(map.getKey().getOption1());
	System.out.println(map.getKey().getOption2());
	System.out.println(map.getKey().getOption3());
	System.out.println(map.getKey().getOption4());
	
	System.out.println("Enter Your Answer");
	Character ans=sc.next().charAt(0);
	int cans=Character.compare(ans, map.getValue());
	if(cans==0) {
		ScoreCount++;
		}

	}
	System.out.println("Score="+ScoreCount);

		if(ScoreCount>8 && ScoreCount <=10){
			System.out.println("Class A");
		}
		else if(ScoreCount>6 && ScoreCount <=8) {
			System.out.println("Class B");

		}
		else if(ScoreCount == 5) {
			System.out.println("Class C");

		}
		else if(ScoreCount<5) {
			System.out.println("Class D");}
	
		}
}
	

	
	
	
	
	

	

