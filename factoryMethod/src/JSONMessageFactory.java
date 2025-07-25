public class JSONMessageFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
