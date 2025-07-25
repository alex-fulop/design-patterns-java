public class Main {
    public static void main(String[] args) {
        printMessage(new JSONMessageFactory());
        printMessage(new TextMessageFactory());
    }

    public static void printMessage(MessageFactory messageFactory) {
        Message message = messageFactory.getMessage();
        System.out.println(message.getContent());
    }
}