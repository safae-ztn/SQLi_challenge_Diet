
public class MealDecorator implements MealComponent{

	protected MealComponent meal;
	
	public MealDecorator(MealComponent meal) {
		this.meal = meal;
	}

	@Override
	public int getCalories() {
		return meal.getCalories();
	}

}
