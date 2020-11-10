
public class Fruit extends MealDecorator implements Carbohydrates{

	public Fruit(MealComponent meal) {
		super(meal);
	}

	@Override
	public int getCalories() {
		return meal.getCalories()+ 150;
	}

}
