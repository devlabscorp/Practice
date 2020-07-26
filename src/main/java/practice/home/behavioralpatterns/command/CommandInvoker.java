package practice.home.behavioralpatterns.command;

public class CommandInvoker {
    public String executeOperation(TextFileOperation textFileOperation) {
        return textFileOperation.execute();
    }
}
