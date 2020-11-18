package BuilderPattern1;

public class MargaritaPizzaBuilder extends PizzaBuilder {




    @Override
    void ChooseDough() {
        pizza.setDough("thin");
    }

    @Override
    void ChooseSize() {
       pizza.setSize("Medium");
    }

    @Override
    void ChooseSauce() {
pizza.setSauce("Tomato");
    }

    @Override
    void AddExtraCheese() {
pizza.setWithExtraCheese(true);
    }

    @Override
    void ChooseType() {
pizza.setName("Margarita");
    }

    @Override
    void AddNotes() {
pizza.setNotes("");
    }
}
