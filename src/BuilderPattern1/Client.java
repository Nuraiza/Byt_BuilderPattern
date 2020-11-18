package BuilderPattern1;

public class Client {

    public static void main(String[] args) {
	Employee e = new Employee();
	MargaritaPizzaBuilder mb = new MargaritaPizzaBuilder();
	CapriciozaPizzaBuilder cp = new CapriciozaPizzaBuilder();
	e.setPizzaBuilder(mb);
	e.constructPizza();
	Pizza readyPizza = e.getPizza();


    }
}
