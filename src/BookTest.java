public class BookTest {
    static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("you can win");
        book1.setAuthor("Shiva Kheda");
        book1.setPrice(100);
        book1.getPrice();

        book1.displayDetails();

        System.out.println("-----------------------------");


        Book book2 = new Book();
        book2.title = "Money Psychology";
        book2.author="I dont know";
        book2.setPrice(-1000);
        book2.getPrice();

        book2.displayDetails();


    }

}
