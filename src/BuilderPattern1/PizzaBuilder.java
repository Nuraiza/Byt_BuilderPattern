package BuilderPattern1;

abstract class PizzaBuilder {
    protected Pizza pizza;


    public void CreateNewPizza() {
        pizza = new Pizza();
    }

    abstract void ChooseDough();
    abstract void ChooseSize();
    abstract void ChooseSauce();
    abstract void AddExtraCheese();
    abstract void ChooseType();
    abstract void AddNotes();

    public Pizza Build(){return this.pizza;}
}
