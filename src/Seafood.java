
public class Seafood extends MealDecorator implements Proteins{

	public Seafood(MealComponent meal) {
		super(meal);
	}

	public int getCalories() {
		return meal.getCalories() + 200;
	}

}
