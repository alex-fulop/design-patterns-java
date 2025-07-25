public abstract class MessageFactory {

    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.getContent();

        return msg;
    }

//    Factory Method
    protected abstract Message createMessage();
}
