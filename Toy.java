public class Toy {
    private char Type;
    private String name;
    private double price;
    private int age_from ;
    private  int age_to;
    private int quantities;

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }



    public char getType() {
        return Type;
    }

    public void setType(char type) {
        Type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge_from() {
        return age_from;
    }

    public void setAge_from(int age_from) {
        this.age_from = age_from;
    }

    public int getAge_to() {
        return age_to;
    }

    public void setAge_to(int age_to) {
        this.age_to = age_to;
    }



    public Toy(char type, String name, double price, int quantities, int age_from, int age_to) {
        this.Type = type;
        this.name = name;
        this.price = price;
        this.quantities=quantities;
        this.age_from = age_from;
        this.age_to = age_to;
    }

   public void display()
   {
       System.out.println(Type);
       System.out.println(name);
       System.out.println(price);
       System.out.println(quantities);
       System.out.println(age_from);
       System.out.println(age_to);
   }


}
