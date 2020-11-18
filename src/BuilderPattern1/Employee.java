package BuilderPattern1;

public class Employee {
    private PizzaBuilder pb;

    public void setPizzaBuilder(PizzaBuilder pizzab) {
        pb = pizzab;
    }

    public Pizza getPizza() {
        return pb.Build();
    }

    public void constructPizza() {
        pb.CreateNewPizza();
       pb.ChooseDough();
       pb.ChooseSize();
       pb.ChooseSauce();
       pb.AddExtraCheese();
       pb.ChooseType();
       pb.AddNotes();
    }
}
