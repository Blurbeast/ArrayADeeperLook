package estore;

public class User {
    private int userAge;
    private String userEmail;
    private String userMobile;
    private String userName;
    private UserType userType;
    private Address userAddress;
    public User(String name, String mobile, String email, int age, UserType type, Address address){
        userAge=age;
        userEmail=email;
        userMobile=mobile;
        userName=name;
        userType=type;
        userAddress=address;
    }
    public int getUserAge() {return userAge;}
    public void setUserAge(int userAge) {this.userAge = userAge;}
    public String getUserEmail() {return userEmail;}
    public void setUserEmail(String userEmail) {this.userEmail = userEmail;}
    public String getUserMobile() {return userMobile;}
    public void setUserMobile(String userMobile) {this.userMobile = userMobile;}
    public String getUserName() {return userName;}
    public void setUserName(String userName) {this.userName = userName;}
    public UserType getUserType() {return userType;}
    public void setUserType(UserType userType) {this.userType = userType;}
    public Address getUserAddress() {return userAddress;}
    public void setUserAddress(Address userAddress) {this.userAddress = userAddress;}
    @Override
    public String toString(){
        return ("Hello "+userName+"\nYour mail: "+userEmail+"\nMobile Number is: "+userMobile);
    }
}
