package Playground;

public enum Enum {
    WON(200),LOST(100);
    private int price;
    private Enum(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "price=" + price +
                '}';
    }
}

