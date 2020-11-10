
public class Cheese extends MealDecorator implements Fats{

	public Cheese(MealComponent meal) {
		super(meal);
	}

	@Override
	public int getCalories() {
		return meal.getCalories()+50;
	}

}
