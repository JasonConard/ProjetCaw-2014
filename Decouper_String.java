package Mounirit_Controle;

public class Decouper_String {
	
 public Decouper_String(){  System.out.println("d�coupage de String en chaine caract�res");}
	//--------------------------------
	
	      public char[] Decouper( String string_�_d�couper){	
			
			 
			  String str = string_�_d�couper;
			  char tableau_de_carat�res[] = new char[str.length()];
			 
			  System.out.println("Les carat�res r�cup�r�s de salmane sont :");
		for(int i=0 ;i<str.length()-1;i++){	  
			  tableau_de_carat�res[i] = str.charAt(i);  		  
		                                  }
		return tableau_de_carat�res;
			                      }
	//--------------------------------
}


