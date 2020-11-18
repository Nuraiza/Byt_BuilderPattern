package BuilderPattern1;

public class CapriciozaPizzaBuilder extends PizzaBuilder {


    @Override
    void ChooseDough() {
        pizza.setDough("thick");
    }

    @Override
    void ChooseSize() {
pizza.setSize("Medium");
    }

    @Override
    void ChooseSauce() {
pizza.setSauce("Garlic");
    }

    @Override
    void AddExtraCheese() {
pizza.setWithExtraCheese(false);
    }

    @Override
    void ChooseType() {
pizza.setName("Capricioza");
    }

    @Override
    void AddNotes() {
pizza.setNotes("");
    }
}
