package Mounirit_Controle;

public class Class_Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Write_in_JSON RJ = new Write_in_JSON(); // Class �criture en Json
		Decouper_String D_S = new Decouper_String(); // Class d�coupage de String en tableau de chars
		 
		 // R�cuperer un String de SALMANE
		
		//---- ICI IL ME FAUT LE NOM DE LA FONCTION DE SALMANE POUR L' APPELER
		
		//______________________________________________________
		
		
		
		 // D�couper Le string
		char[] t = D_S.Decouper("Le String r�cuper� de salmane") ;
		for (int j=0;j<t.length;j++){System.out.println(t[j]);} // Affichage
		//______________________________________________________
		
		
	   	 // Chercher le codage de chaque caract�re chez Quentin
		
		//---- ICI IL ME FAUT LE NOM DE LA FONCTION DE SALMANE POUR L' APPELER
		
		//______________________________________________________
		
		 
		   
		 // Remplire un fichier JSON
		  RJ.Write("fichierJson", "Ce String est r�cuper� de la class de quentin"); // Le nom de fichier est : "test"
		 //______________________________________________________
		
		
		
		
		 

	}

}
