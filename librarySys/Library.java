package librarySys;

import java.util.ArrayList;
import java.util.Hashtable;

public class Library {
    private final ArrayList<Integer> lib_student;
    private final ArrayList<Integer> lib_teacher;
    private final Hashtable lib_admin;
    private String access;


    Library() {
        this.lib_admin = new Hashtable();
        lib_admin.put("admin", "1234");
        lib_admin.put("admin1", "12345");
        lib_admin.put("admin2", "12346");
        this.lib_student = new ArrayList<>();
        this.lib_teacher = new ArrayList<>();
    }

    void login(String userName, String pass) {
        for (int i = 0; i < 3; i++) {
            int tries = 3;
            if (this.lib_admin.contains(userName) && this.lib_admin.get(userName) == pass) {
                System.out.println("Login SuccessFull...");
                this.access = "admin";
                break;
            } else {
                System.out.println("Please Enter valid Credentials.. you have "+tries+ "tries left");
                tries--;
                //If three tries are done the program will terminate
            }
        }
    }


}
