
public class Vegetable extends MealDecorator implements Carbohydrates{

	public Vegetable(MealComponent meal) {
		super(meal);
	}

	public int getCalories() {
		return meal.getCalories() + 100;
	}

}
