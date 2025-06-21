import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Observer> observers;
    private String latestNews;

    public NewsAgency() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }

    public void setNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(latestNews);
        }
    }
}
