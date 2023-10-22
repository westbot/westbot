// Класс Фабрика
public class PizzaFactory {
	// фабричный метод возвращает пиццу запрошенного типа
	public Pizza createPizza(PizzaType pt) {
		Pizza pz = null;
		switch (pt) {
		case BEAF:
			pz = new Pizza() {
				@Override
				public String getName() {
					return "Beaf pizza";
				}
				@Override
				public String getIngredients() {
					return "Dough, Beaf.";
				}
			};
			break;
		case VEGAN:
			pz = new Pizza() {
				@Override
				public String getName() {
					return "Vegan pizza";
				}
				@Override
				public String getIngredients() {
					return "Dough, Vegetables.";
				}
			};
			break;
		case SEA:
			pz = new Pizza() {
				@Override
				public String getName() {
					return "Sea pizza";
				}
				@Override
				public String getIngredients() {
					return "Dough, Seafood.";
				}
			};
			break;
		default:
			break;
		}
		return pz;
	}
}
