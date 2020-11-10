
public class Egg extends MealDecorator implements Proteins{

	public Egg(MealComponent meal) {
		super(meal);
	}

	public int getCalories() {
		return meal.getCalories()+50;
	}

}
