package estore;

public class Address {
    private String country;
    private String stateOfResidence;
    private String cityName;
    private String streetName;
    private int houseNumber;

    public Address(String country, String state, String city, String street, int houseNumber){
        this.country=country;
        stateOfResidence=state;
        cityName=city;
        streetName=street;
        this.houseNumber=houseNumber;
    }

    public void setCountry(String country) {this.country = country;}
    public void setStateOfResidence(String stateOfResidence) {this.stateOfResidence = stateOfResidence;}
    public void setCityName(String cityName) {this.cityName = cityName;}
    public void setStreetName(String streetName) {this.streetName = streetName;}
    public void setHouseNumber(int houseNumber) {this.houseNumber = houseNumber;}

    public String getCountry() {return country;}
    public String getStateOfResidence() {return stateOfResidence;}
    public String getCityName() {return cityName;}
    public String getStreetName() {return streetName;}
    public int getHouseNumber() {return houseNumber;}
}
