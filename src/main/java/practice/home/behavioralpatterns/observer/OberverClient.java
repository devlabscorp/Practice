package practice.home.behavioralpatterns.observer;

public class OberverClient {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        AbcChannel abcChannel = new AbcChannel();
        newsAgency.addObserver(abcChannel);
        CBSChannel cbsChannel = new CBSChannel();
        newsAgency.addObserver(cbsChannel);

        newsAgency.update("Corona Cases crossed 10k mark today");

        System.out.println(abcChannel);
        System.out.println(cbsChannel);

        newsAgency.update("Biden is leading by 9pts over President Trump");
        System.out.println(abcChannel);
        System.out.println(cbsChannel);
    }
}
