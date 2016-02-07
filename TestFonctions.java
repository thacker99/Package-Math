class TestFonctions{
	
	public static void main(String[] args){
		
		// déclaration des variables 
		int x = 10;
		int y = -3;
		int val;
		Fonctions f = new Fonctions(); // création de l'objet f 
		
		// teste et affichage de l'addition
		val = f.addition(x,y);
		System.out.println(x + " + " + y + " = " + val);
		
		// teste et affichage de la soustraction
		val = f.soustraction(x,y);
		System.out.println(x + " - " + y + " = " + val);
		
		// calcul et affichage du cube d'un entier
		System.out.println("cube( + "+ x + ") = " + f.cube(x));
		
	}
	
}