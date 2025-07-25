public class TextMessageFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
