
public class Peanuts extends MealDecorator implements Fats{

	public Peanuts(MealComponent meal) {
		super(meal);
	}

	@Override
	public int getCalories() {
		return meal.getCalories()+50;
	}

}
