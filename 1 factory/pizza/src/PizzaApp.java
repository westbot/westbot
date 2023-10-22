
public class PizzaApp {

	public static void main(String[] args) {
		// Объект класса фабрика
		PizzaFactory pf = new PizzaFactory();

		// мясная пицца
		Pizza beaf = pf.createPizza(PizzaType.BEAF);
		System.out.println("Name: " + beaf.getName());
		System.out.println("Ingredients: " + beaf.getIngredients());
		System.out.println();

		// вегетарианская
		Pizza vegan = pf.createPizza(PizzaType.VEGAN);
		System.out.println("Name: " + vegan.getName());
		System.out.println("Ingredients: " + vegan.getIngredients());
		System.out.println();

		// морепродукты
		Pizza sea = pf.createPizza(PizzaType.SEA);
		System.out.println("Name: " + sea.getName());
		System.out.println("Ingredients: " + sea.getIngredients());
		System.out.println();
	}

}
