public class Book_sorted extends Book {
    public int size = 0;
    public  Book []BooKs=new Book[size];
    public int max =-1;
    public Book_sorted(String isbn, String title, float price) {
        super(isbn, title, price);
    }



    public void sorted()
    {
        for (int i=0;i<BooKs.length;i++)
        {
            if(BooKs[i].price>max)
            {
              max = (int) BooKs[i].price;

            }
            System.out.println(BooKs[i].price);

        }
    }

}
