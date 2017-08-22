package test.ca.server.DB;

/**
 * Created by ghory on 2017. 08. 22..
 */
public class User {
    private final long id;
    private String firstName;
    private String lastName;

    public User(long id ,String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("{\"firstName\":\"%s\", \"lastName\":\"%s\"}",this.firstName,this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
