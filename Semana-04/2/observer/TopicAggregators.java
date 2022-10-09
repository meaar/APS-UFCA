package observer;

public class TopicAggregators extends Aggregators {

    private String topic;

    public TopicAggregators(ConcreteSubject c, String topic) {
        super(c);
        this.topic = topic;
    }
    @Override
    public void addNews(News news) {
        if (news.getTopic().equals(this.topic)){
            super.getNews().add(news);
            if (super.getNews().size()%10 == 0) {
                String newsText = null;
                for (News newsObj : super.getNews()) {
                    if (newsText != null) {
                        newsText = newsText+" : "+newsObj.getText();
                    }else{
                        newsText = newsObj.getText();
                    }
                }
                super.notifyNews("Noticias("+newsText+")", news.getDay(), news.getMonth(), this.topic);
            }
        }else{
            System.out.println("A noticia não contem um topico definido");
        }
    }
    
}
