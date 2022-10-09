package observer;

public class MonthAggregators extends Aggregators {

    private News lastNews;

    public MonthAggregators(ConcreteSubject c) {
        super(c);
    }
    @Override
    public void addNews(News news) {
        super.getNews().add(news);
        if (this.lastNews == null){
            this.lastNews = news;
        }else{
            if (this.lastNews.getMonth() != news.getMonth()){
                String newsText = null;
                for (News newsObj : super.getNews()) {
                    if (newsText != null) {
                        newsText = newsText+" : "+newsObj.getText();
                    }else{
                        newsText = newsObj.getText();
                    }
                   
                }
                super.notifyNews("Noticias antigas("+newsText+")\nNova noticia("+news.getText()+")", 0, news.getMonth(), "Mensal");
            }
            this.lastNews = news;
        }
    }
    
}
