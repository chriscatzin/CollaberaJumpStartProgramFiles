public class Seats {
    private Seats[] dataSeats;
    private String row;
    private String column;
    private String lastname;
    private String firstname;
    private int id;

    Seats(String a, String b, int c) {
        lastname = a;
        firstname = b;
        id = c;
    }

    int getSeatId() {
        return id;
    }

    String getRow(){
        return row;
    }

    String getColumn(){
        return column;
    }
    String getClientInitials() {
        char[] initialsArr = {' ', ' '};
        initialsArr[0] = firstname.charAt(0);
        initialsArr[1] = lastname.charAt(0);
        return new String(initialsArr);
    }


}
