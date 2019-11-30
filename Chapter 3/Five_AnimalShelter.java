class Five_AnimalShelter {
	// 1. FIFO(queue)
	// 2. choose cat or dog
	public static void main(String[] args) {
		Queue<String> Cats = new LinkedList<>();
		Queue<String> Dogs = new LinkedList<>();

		Cats.add("A");
		Cats.add("B");
		Cats.add("C");
		Cats.add("D");
		Cats.add("E");

		Dogs.add("a");
		Dogs.add("b");
		Dogs.add("c");
		Dogs.add("d");
		Dogs.add("e");
		System.out.println(Cats);
		System.out.println(Dogs);

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to adpot a dog or cat? ");
		String catOrDog = keyboard.next();
		if(catOrDog.equals("dog")) {
			System.out.println(dequeueDog(Dogs));
		}
		if(catOrDog.equals("cat")) {
			System.out.println(dequeueCat(Cats));
		}

	}
	private static String dequeueDog(Queue<String> Dogs){
		if(!Dogs.isEmpty()){
			return Dogs.remove();
		}
		else{
			System.out.println("There are no more available dogs");
			return " ";
		}
	}

	private static String dequeueCat(Queue<String> Cats){
		if(!Cats.isEmpty()){
			return Cats.remove();
		}
		else{
			System.out.println("There are no more available cats");
			return " ";
		}
		
	}



}
