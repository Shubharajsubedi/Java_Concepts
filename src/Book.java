public class Book {
    String title;
    String author;
    private double price;


    public  void setTitle(String titlePara){
        if(titlePara.isEmpty()){
            System.out.println("Title empty");
            //throw new IllegalArgumentException("Title empty");
        }else {
            this.title = titlePara;
        }

    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String authorPara){
        if(authorPara.isEmpty()){
            System.out.println("Author empty");
        }else  {
            this.author = authorPara;
        }
    }
    public String getAuthor(){
        return author;
    }


    public void setPrice (double pricePara){
        if (pricePara < 0){
            System.out.println("The price must mot be negative:");
        }else {
            price = pricePara;
        }
    }



    public double getPrice(){
        return price;
    }

    void displayDetails(){
        System.out.println("The name of the book is "+title);
        System.out.println("The author of the book is "+author);
        System.out.println("The price of the book is "+price);

    }




}
