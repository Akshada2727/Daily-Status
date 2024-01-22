package oops;


		
		
		
		class Ani {
		    public void eat() {
		        System.out.println("Animal is eating.");
		    }
		}

		
		class Mammal extends Ani {
		    public void breathe() {
		        System.out.println("Mammal is breathing.");
		    }
		}

		class Reptile extends Ani {
		    public void crawl() {
		        System.out.println("Reptile is crawling.");
		    }
		}

		
		class Platypus extends Mammal {
		    public void layEggs() {
		        System.out.println("Platypus is laying eggs.");
		    }
		}

		
		class Dolphin extends Mammal {
		    public void swim() {
		        System.out.println("Dolphin is swimming.");
		    }
		}

		public class HybridInheritance {
		    public static void main(String[] args) {
		       
		        Platypus platypus = new Platypus();
		        Dolphin dolphin = new Dolphin();

		     
		        platypus.eat();     
		        platypus.breathe(); 
		        platypus.layEggs(); 

		        dolphin.eat();      
		        dolphin.breathe();  
		        dolphin.swim();     
		    }
		


	}


