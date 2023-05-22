package estore;

public class Billing {
    private String receiverName;
    private String receiverNumber;
    private Address receiverAddress;
    private CardCVV cardInfo;
    public Billing(String receiverName, String receiverNumber, Address receiverAddress) {
        this.receiverName = receiverName;
        this.receiverNumber = receiverNumber;
        this.receiverAddress = receiverAddress;
    }
    public String getReceiverName() {return receiverName;}
    public void setReceiverName(String receiverName) {this.receiverName = receiverName;}
    public String getReceiverNumber() {return receiverNumber;}
    public void setReceiverNumber(String receiverNumber) {this.receiverNumber = receiverNumber;}
    public Address getReceiverAddress() {return receiverAddress;}
    public void setReceiverAddress(Address receiverAddress) {this.receiverAddress = receiverAddress;}
    public CardCVV getCardInfo() {return cardInfo;}
    public void setCardInfo(CardCVV cardInfo) {this.cardInfo = cardInfo;}
}
