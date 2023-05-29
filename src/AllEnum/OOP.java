package AllEnum;

public class OOP {
    //trying method Overloading and overriding

    private String name;
    private String membership;

    public void set_Name(String name){
        this.name = name;
    }
    public String get_Name(){
        return name;
    }
    public void set_membership(String membership){
        this.membership = membership;
    }
    public String get_Membership(){
        return membership;
    }
    //overloading the method with a constructor
    public  void set_Membership(TryingEnum membership){
        this.membership = membership.name();
    }
    @Override
    public String toString(){
        return get_Name() + " " + get_Membership();
    }
}
