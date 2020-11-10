
public class Diet {
	
	private final int calories;
	private MealComponent mealComponent;

	public Diet(int calories) {
		this.calories = calories;
		mealComponent = new ConcreteMeal();
	}
	
	public int calculCalories(String Totalmeal) {
		//int res = 0;
		 //MealComponent meal = null;
		 String[] arrOfStr = Totalmeal.split(",");
		 mealComponent = new ConcreteMeal();
		 for(String m : arrOfStr) {
			 switch (m) {
		         case "fruit":
		        	 mealComponent = new Fruit(mealComponent);
		             break;
		         case "vegetable":
		        	 mealComponent = new Vegetable(mealComponent);
		             break;
		         case "seafood":
		        	 mealComponent = new Seafood(mealComponent);
		             break;
		         case "egg":
		        	 mealComponent = new Egg(mealComponent);
		             break;
		         case "cheese":
		        	 mealComponent = new Cheese(mealComponent);
		             break;
		         case "peanut":
		        	 mealComponent = new Peanuts(mealComponent);
		             break;
			 }
		 }
		 return mealComponent.getCalories();
	}
	
	public String evaluateCalories(String Totalmeal) {
		int res = 0;
		String print = "";
		mealComponent = new ConcreteMeal();
		 String[] arrOfStr = Totalmeal.split(",");
		 for(String m : arrOfStr) {
			 switch (m) {
		         case "fruit":
		        	 mealComponent = new Fruit(mealComponent);
		             break;
		         case "vegetable":
		        	 mealComponent = new Vegetable(mealComponent);
		             break;
		         case "seafood":
		        	 mealComponent = new Seafood(mealComponent);
		             break;
		         case "egg":
		        	 mealComponent = new Egg(mealComponent);
		             break;
		         case "cheese":
		        	 mealComponent = new Cheese(mealComponent);
		             break;
		         case "peanut":
		        	 mealComponent = new Peanuts(mealComponent);
		             break;
			 }
		 }
		res = mealComponent.getCalories();
		if(res < calories) {
			print ="still "+ (this.calories-res) +" calories to be added";
		}else if(res > this.calories) {
			print ="still "+ (res - this.calories) +" calories to be removed";
		}else {
			print = "good, number of calories as expected";
		}
		return print;
	}

	public String evaluateNutrients(String meal) {
		String res ="";
		boolean containCarbo = false;
		boolean containProteins = false;
		boolean cotainsFats = false;
		String[] arrOfStr = meal.split(",");
		for(int i=0 ; i<arrOfStr.length; i++) {
			if(arrOfStr[i].equals("egg") || arrOfStr[i].equals("seafood")) {
				containProteins = true;
			}else if(arrOfStr[i].equals("fruit") || arrOfStr[i].equals("vegetable")){
				containCarbo = true;
			}else if(arrOfStr[i].equals("cheese") || arrOfStr[i].equals("peanut")) {
				cotainsFats = true;
			}
		}
		if(containProteins==true && containCarbo==true && cotainsFats==true) {
			res = "good, your meal contains all required nutrients!";
		}else if(cotainsFats==false) {
			res = "your meal doesn't contain fats!";
		}else {
			res = "your meal doesn't contain something!";
		}
		return res;
	}
	
}
