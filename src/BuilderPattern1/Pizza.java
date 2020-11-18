package BuilderPattern1;

public class Pizza {
    private String dough;
    private String size;
    private String sauce;
    private Boolean withExtraCheese = Boolean.FALSE;
    private String name;
    private String notes;

    public String getDough() {
        return dough;
    }

    public String getSize() {
        return size;
    }

    public String getSauce() {
        return sauce;
    }



    public Boolean getWithExtraCheese() {
        return withExtraCheese;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }



    public void setWithExtraCheese(Boolean withExtraCheese) {
        this.withExtraCheese = withExtraCheese;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", size='" + size + '\'' +
                ", sauce='" + sauce + '\'' +
                ", withExtraCheese=" + withExtraCheese +
                ", name='" + name + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
