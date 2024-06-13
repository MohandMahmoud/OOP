public abstract class ToyShop {
    Toy []Toys;
    Toy []cart;

    public void display_all_toys()
    {
        for(int i=0 ; i<Toys.length;i++)
        {
            if(Toys[i]!=null)
            Toys[i].display();
        }

    }

    public void  search(char type,int age)
    {
        for(int i=0;i<Toys.length;i++)
        {

            if(Toys[i].getType()==type&& (Toys[i].getAge_from()==age||Toys[i].getAge_to()==age))
            {
                Toys[i].display();

            }
        }
    }
    public void add_to_cart(Toy t)
        {
           for (int i=0;i<cart.length;i++)
           {
               if(cart[i]!=null)
               {
                   cart[i]=t;
               }

           }
        }
        public void total_price()
        {
            double total=0;
            double x;
            int y;
            for (int i=0;i<Toys.length;i++)
            {
                x=Toys[i].getPrice();
                y=Toys[i].getQuantities();
                total+=x*y;
            }
            System.out.println(total);
        }
        public abstract void  dv ();

}
