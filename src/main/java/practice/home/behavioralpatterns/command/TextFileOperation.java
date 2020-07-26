package practice.home.behavioralpatterns.command;


//Simply put, the pattern intends to encapsulate in an object all the data required for performing a given action (command),
// including what method to call, the method's arguments, and the object to which the method belongs.
// This model allows us to decouple objects that produce the commands from their consumers
@FunctionalInterface
public interface TextFileOperation {
    String execute();
}
