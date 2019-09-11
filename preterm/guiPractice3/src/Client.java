// a client object

import java.util.Random;

public class Client {
    private String lastname;
    private String firstname;
    private int id;

    Client(String l, String f, int i) {
        lastname = l;
        firstname = f;
        id = i;
    }

    @Override
    public String toString(){
        return lastname + ", " + firstname;
    }

    int getClientId() {
        return id;
    }

    String getClientLastName() {
        return lastname;
    }

    String getClientFirstName() {
        return firstname;
    }

    String getClientInitials() {
        char[] initialsArr = {' ', ' '};
        initialsArr[0] = firstname.charAt(0);
        initialsArr[1] = lastname.charAt(0);
        return new String(initialsArr);
    }

    String getFullClientString() {
        System.out.println("==========================================================");
        String full = ("id: " + id + " || lastname: " + lastname + " || firstname:  " + firstname + " || ");
        return full;
    }
}
