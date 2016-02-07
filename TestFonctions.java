class TestFonctions{
	
	public static void main(String[] args){
		
		int x = 10;
		int y = -3;
		int val;
		Fonctions f = new Fonctions();
		val = f.addition(x,y);
		System.out.println(x + " + " + y + " = " + val);
		val = f.soustraction(x,y);
		System.out.println(x + " - " + y + " = " + val);
		
	}
	
}