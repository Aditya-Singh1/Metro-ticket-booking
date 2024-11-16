package TrainManage;
import java.util.Scanner;
class Manage{
	Scanner sc=new Scanner(System.in);
static String start[]={"mohannagar","shadra","newdelhi"};
static String end[]={"mohannagar","shadra","newdelhi"};
 

 void search() { 
 System.out.println();

 System.out.println("enter your Start Station");
 String strt=sc.nextLine().toLowerCase();
 System.out.println("enter end your Station");
 String nd =sc.nextLine().toLowerCase();


if(start[0].equals(strt)&&  end[1].equals(nd)) {////////1
	
	System.out.println("start destination="+strt);
	System.out.println("end destination="+nd);

	System.out.println("20 Mins");
	System.out.println("Stops 5");

	System.out.println("BlueLine");
	System.out.println("Switch 2");
	System.out.println("Fare 20 RS");

	
}
else if(start[0].equals(strt)&&end[2].equals(nd)) {//////////////////2
	System.out.println("start destination="+strt);
	System.out.println("end destination="+nd);

	System.out.println("15 Mins");
	System.out.println("Stops 5");

	System.out.println("RedLine");
	System.out.println("Switch 1");
	System.out.println("Fare 15 RS");

}

else if(start[1].equals(strt)&&end[0].equals(nd)) {/////////////////3
	System.out.println("start destination="+strt);
	System.out.println("end destination="+nd);

	System.out.println("13 Mins");
	System.out.println("Stops 5");

	System.out.println("BlueLine");
	System.out.println("Switch 1");
	System.out.println("Fare 40 RS");

}
else if(start[1].equals(strt)&&end[2].equals(nd)) {///////////////////4
	System.out.println("start destination="+strt);
	System.out.println("end destination="+nd);

	System.out.println("17 Mins");
	System.out.println("Stops 5");

	System.out.println("greenLine");
	System.out.println("Switch 2");
	System.out.println("Fare 15 RS");

}

else if(start[2].equals(strt)&&end[0].equals(nd)) {///////////////////5
	System.out.println("start destination="+strt);
	System.out.println("end destination="+nd);

	System.out.println("14 Mins");
	System.out.println("Stops 5");

	System.out.println("purple");
	System.out.println("Switch 1");
	System.out.println("Fare 19 RS");

}
else if(start[2].equals(strt)&&end[1].equals(nd)) {//////////////////////////6
	System.out.println("start destination="+strt);
	System.out.println("end destination="+nd);

	System.out.println("15 Mins");
	System.out.println("Stops 8");

	System.out.println("yellow");
	System.out.println("Switch 3");
	System.out.println("Fare 19 RS");

}



else {
	System.out.println("Wrong station");

}


 }
 
 
void ticket() {
	

System.out.println("enter your Start Station");
String strt=sc.nextLine().toLowerCase();
System.out.println("enter end your Station");
String nd =sc.nextLine().toLowerCase();
String a1[][]= {{"Start      ","end    ","line   ","time  ","fare  "},{strt,nd,"blueLine","20 mins","20 Rs"}};	
String a2[][]= {{"Start      ","end    ","line   ","time  ","fare  "},{strt,nd,"redLine","15 mins","15 Rs"}};	
String a3[][]= {{"Start      ","end    ","line   ","time  ","fare  "},{strt,nd,"blueLine","13 mins","40 Rs"}};	
String a4[][]= {{"Start      ","end    ","line   ","time  ","fare  "},{strt,nd,"greenLine","17 mins","15 Rs"}};	
String a5[][]= {{"Start      ","end    ","line   ","time  ","fare  "},{strt,nd,"PurpleLine","14 mins","19 Rs"}};	
String a6[][]= {{"Start      ","end    ","line   ","time  ","fare  "},{strt,nd,"YellowLine","15 mins","19 Rs"}};	

if(start[0].equals(strt)&&end[1].equals(nd)) {////////////1
	
	System.out.println();
	System.out.println();
	System.out.println("YOUR TICKET ");

for(int i=0;i<2;i++) {
	
	for(int j=0;j<a1[i].length;j++) {
		
			
		System.out.print(a1[i][j]+" ");		


		}
		
	System.out.println();  
	}
System.out.println();
}




else if(start[0].equals(strt)&&end[2].equals(nd)) {/////////////////2
	
	System.out.println();
	System.out.println();
	System.out.println("YOUR TICKET ");

for(int i=0;i<2;i++) {
	
	for(int j=0;j<a2[i].length;j++) {
		
			
		System.out.print(a2[i][j]+" ");		


		}
		
	System.out.println();  
	}
System.out.println();
}



else if(start[1].equals(strt)&&end[0].equals(nd)) {///////////////3
	
	System.out.println();
	System.out.println();
	System.out.println("YOUR TICKET ");

    for(int i=0;i<2;i++) {
	
	for(int j=0;j<a3[i].length;j++) {
		
			
		System.out.print(a3[i][j]+" ");		


		}
		
	System.out.println();  
	}
System.out.println();
}

else if(start[1].equals(strt)&&end[2].equals(nd)) {//////////////4
	
	System.out.println();
	System.out.println();
	System.out.println("YOUR TICKET ");

for(int i=0;i<2;i++) {
	
	for(int j=0;j<a4[i].length;j++) {
		
			
		System.out.print(a4[i][j]+" ");		


		}
		
	System.out.println();  
	}
System.out.println();
}

else if(start[2].equals(strt)&&end[0].equals(nd)) {/////////////5
	
	System.out.println();
	System.out.println();
	System.out.println("YOUR TICKET ");

for(int i=0;i<2;i++) {
	
	for(int j=0;j<a5[i].length;j++) {
		
			
		System.out.print(a5[i][j]+" ");		


		}
		
	System.out.println();  
	}
System.out.println();
}
else if(start[2].equals(strt)&&end[1].equals(nd)) {
	
	System.out.println();
	System.out.println();
	System.out.println("YOUR TICKET ");

for(int i=0;i<2;i++) {  
	
	for(int j=0;j<a6[i].length;j++) { 
		
			
		System.out.print(a6[i][j]+" ");		


		}
		
	System.out.println();  
	}
System.out.println();

}



else {
	System.out.println("Not found try again !");
}


 }


void exit() {
	
	
}


}




public class TrainStation extends Manage {
	
	
	public static void main(String[] args) {
		Scanner s1=new Scanner (System.in);
		char next;
		do {
			
			int i;
		System.out.println("metro ticket system\n\npress 1 for Search\npress 2 for ticket book");
	
		i=s1.nextInt();
		Manage s=new Manage();
		System.out.println("Available station\n\nmohannagar\nshadra\nnewdelhi ");
		
		
		
		switch(i) {
		
		case 1:
			s.search();
			
			break;
			
		case 2:
			s.ticket();
			break;
			
			
			default:
				System.out.println("NOT FOUND ");
				
		}
		
		
		System.out.println("Press y for next  Press E for exit");
		next=s1.next().charAt(0);
		
    System.out.println();
		
		
		if(next=='E'||next=='e') {
			
			
			  s.exit();
		}
		
		
		}
		while(next=='y'|| next=='Y');
		
		
		}

	
	}
		
		
	


