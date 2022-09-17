package strategy;

public class App {
    public static void main(String[] args) throws Exception {
        Library library = new Library();
        Game game = new Game();
        game.setPrice(100);
        game.setDigital(true);
        Book book = new Book();
        book.setPrice(50);
        book.setDigital(true);
        Magazine magazine = new Magazine();
        magazine.setPrice(10);
        magazine.setDigital(true);
        User user = new User(1, "Alberto", 1000);

        library.sellProduct(user, game, true);
        library.sellProduct(user, book, true);
        library.sellProduct(user, magazine, true);
        System.out.println(user.getName()+" balance: "+user.getBalance());
        System.out.println("Library balance: "+library.getBalance());

        game.setDigital(false);
        book.setDigital(false);
        magazine.setDigital(false);

        library.sellProduct(user, game, true);
        library.sellProduct(user, book, true);
        library.sellProduct(user, magazine, true);
        System.out.println(user.getName()+" balance: "+user.getBalance());
        System.out.println("Library balance: "+library.getBalance());

    }
}
