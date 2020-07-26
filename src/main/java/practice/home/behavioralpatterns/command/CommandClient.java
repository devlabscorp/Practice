package practice.home.behavioralpatterns.command;

public class CommandClient {

    public static void main(String[] args) {
        CommandInvoker invoker = new CommandInvoker();
        String openingText = invoker.executeOperation(new OpenTextFileOperation(new TextFile("abc.txt")));
        System.out.println(openingText);

        String closingText = invoker.executeOperation(new CloseTextFileOperation(new TextFile("abc.txt")));
        System.out.println(closingText);
    }
}
