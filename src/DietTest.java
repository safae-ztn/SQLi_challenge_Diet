import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
To avoid an over weight and maintain a healthy life style a number of calories consumed by a Humain beign should not exceed an average
The purpose of this exercice is to calculate the number of calories of a given meal and if this meal is well-balanced.
 A meal is well-balanced means that it contains a three main nutrients: Carbohydrates, proteins and fats
Assumptions:
For this exercice we will consider:
 -Healthy meal is meal with an average  of 500 calories  and it contains carbohydrates, proteins, and fats.
Carbohydrates is composed of:
        -fruit, about 150 calories
        -vegetable, about 100 calories
Proteins composed of:
        -seafood, about 200 calories
        -egg, about 50 calories
Fats is composed of:
         -cheese, about 50 calories
         -peanuts, about 50 calories
 */
public class DietTest {

    private Diet diet = new Diet(500);


    @Test
    public void calculate_number_of_calories_of_a_meal() {
        assertEquals(50, diet.calculCalories("egg"));
        assertEquals(250, diet.calculCalories("egg,seafood"));
    }
    
    @Test
    public void meal_calories_equal_to__the_average() {
        assertEquals("good, number of calories as expected", diet.evaluateCalories("seafood,egg,fruit,vegetable"));
    }

    @Test
    public void meal_calories_less_than_the_average(){
        assertEquals("still 300 calories to be added", diet.evaluateCalories("egg,fruit"));
    }

    @Test
    public void meal_calories_great_than_the_average(){
        assertEquals("still 100 calories to be removed", diet.evaluateCalories("seafood,egg,fruit,vegetable,cheese,peanut"));
    }

    @Test
    public void meal_contains_all_required_nutrients(){
        assertEquals("good, your meal contains all required nutrients!", diet.evaluateNutrients("egg,fruit,peanut"));
    }

   @Test
    public void missing_nutrient_in_the_meal(){
        assertEquals("your meal doesn't contain fats!", diet.evaluateNutrients("egg,fruit"));
    }

}
