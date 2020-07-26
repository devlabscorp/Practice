package practice.home.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// When an object changes it state all its dependents are notified and updated accordingly
public class NewsAgency {
    private List<Channel> channelList = new ArrayList<>();
    private String news;

    public void addObserver(Channel channel) {
        channelList.add(channel);
    }

    public void update(String news) {
        this.news = news;
        channelList.forEach(ch -> ch.update(news));
    }
}
