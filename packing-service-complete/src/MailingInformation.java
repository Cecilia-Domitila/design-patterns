class MailingInformation {

    private String senderName;
    private String senderAddress;
    private String receiverName;
    private String receiverAddress;

    String getSenderName() {
        return senderName;
    }

    MailingInformation setSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    String getSenderAddress() {
        return senderAddress;
    }

    public MailingInformation setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }

    String getReceiverName() {
        return receiverName;
    }

    public MailingInformation setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    String getReceiverAddress() {
        return receiverAddress;
    }

    public MailingInformation setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }
}
