package Com;
import java.util.Scanner;
public class DublicateCharacters {
	public static void main(String[] args) {
		 Scanner b = new Scanner (System.in); 
		     String a = "";
		    
		     System.out.println("Enter a words: ");
		     a = b.nextLine();
		     System.out.println(a);
		  int count=0;
		  //occurrence 
		    for(int i=0;i<a.length();i++) {
		     if(a.charAt(i)=='a'){
		    	 count++;
		     }
		    }
		    System.out.println("....occurrence...");
		    System.out.println("a--->"+count);
		    String temp = ""; 
		         for (int i = 0; i < a.length(); i++)
		         {
		           if (temp.indexOf(a.charAt(i)) == - 1)
		           {
		            temp =temp + a.charAt(i);
		         }
		     }
		   System.out.println(".....unique charactors ......");
		   System.out.println(temp);
		   System.out.println();
		   System.out.println("unique charactor count:" +"   "+temp.length());
	        String Str=" " ;
	        
	        //reverse the character ....
		    for(int i=temp.length()-1;i>=0;i--)
		    {
		    Str=Str+temp.charAt(i);
		    }
		      System.out.println("Reversed words: "+ Str); 
		      System.out.println(".....Splits the characters....");
		      String[] Splits= Str.split("a");
		      for(String Split:Splits){
		    	  System.out.println(Split);
		      }
		
		
	}
		   }
