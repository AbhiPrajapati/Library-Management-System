package librarySys;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Library {
    public  ArrayList<Integer> lib_student;
    public  ArrayList<Integer> lib_teacher;
    public  ArrayList<Book> lib_book;
    public Hashtable<String,String> lib_admin;
    private String access;
    private int tries;

    Library() {
        this.tries = 3;
        this.lib_admin = new Hashtable<>();
        lib_admin.put("admin", "1234");
        lib_admin.put("admin1", "12345");
        lib_admin.put("admin2", "12346");
        this.lib_student = new ArrayList<>();
        this.lib_teacher = new ArrayList<>();
        this.lib_book = new ArrayList<>();
    }

    boolean login(String userName, String pass) {
        if(this.tries == 0)
        {
            System.out.println("You have exceeded the try limit..");
            return false;
        }
        while (this.tries > 0) {

            if (this.lib_admin.contains(pass) && this.lib_admin.get(userName) == (pass)) {
                System.out.println("Login SuccessFull...");
                this.access = "admin";
                return true;
            } else {
                System.out.println("Please Enter valid Credentials.. you have "+this.tries+ "tries left");
                Scanner in = new Scanner(System.in);
                userName = in.nextLine();
                pass = in.nextLine();
                tries--;
                login(userName,pass);
                //If three tries are done the program will terminate
            }
        }
        return false;
    }







}
