package observer;

public class App {
    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        TopicAggregators topic = new TopicAggregators(concreteSubject, "Livro");
        MonthAggregators monthAggregators = new MonthAggregators(concreteSubject);
        for (int i = 0; i < 10; i++) {
            News news = new News("Teste "+i, 0, 0, "Livro");
            topic.addNews(news);
        }
        News news1 = new News("Greve em são paulo", 0, 0, "greve");
        News news2 = new News("Funcionarios dos correios saem para as ruas", 0, 0, "greve");
        News news3 = new News("Nova lei aprovada deixam os taxitas em greve", 0, 0, "greve");
        News news4 = new News("Aumento do preço do diesel afeta caminhoneiros", 0, 2, "greve");
        monthAggregators.addNews(news1);
        monthAggregators.addNews(news2);
        monthAggregators.addNews(news3);
        monthAggregators.addNews(news4);

    }
}
