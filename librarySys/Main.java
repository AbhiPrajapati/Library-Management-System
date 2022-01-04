package librarySys;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------- Welcome to Library Management System 📚📕🧾 --------------------------------");
        System.out.println("Pleas Enter Your Login Credential😎😎");
        Library lib = new Library();
        lib.login("admin","1234");

        while(true){
            System.out.println("----------------------------------------------------------");
            System.out.println(" 1] Book details \n 2] Student Details \n 3] Teacher Details \n 4] Book Manipulation \n 5]" +
                    " Student manipulation \n 6] Teacher Manipulation \n 7] All Issued Book \n 8] All Student Details \n 9] All teacher Details \n 10] Exit" );
            System.out.println("----------------------------------------------------------");
            System.out.println("Select a Options");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Get Book Details");
                    break;
                case 2:
                    System.out.println("Get Student Details");
                    break;
                case 3:
                    System.out.println("Get Teacher Details");
                    break;
                case 4:
                    System.out.println("Book Manipulation");
                    boolean t = true;
                    while(t == true){
                        System.out.println("---------------Book Section------------------");
                        System.out.println(" 1] Add Book \n 2] Remove Book \n 3] Update Book \n 4] Back to Main Menu");
                        System.out.println("---------------------------------------------");
                        int ch = sc.nextInt();
                        switch (ch){
                            case 1:
                                System.out.println("Add book");
                                break;
                            case 2:
                                System.out.println("Remove book");
                                break;
                            case 3:
                                System.out.println("Update Book");
                                break;
                            case 4:
                                t =false;
                            default:
                                System.out.println("Select A Valid Option ❌❌❌❌❌❌❌❌❌❌ ");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Student Manipulation");
                    boolean tt = true;
                    while(tt == true){
                        System.out.println("---------------Student Section------------------");
                        System.out.println(" 1] Add Student \n 2] Remove Student \n 3] Update Student \n 4] Back to Main Menu");
                        System.out.println("---------------------------------------------");
                        int ch = sc.nextInt();
                        switch (ch){
                            case 1:
                                System.out.println("Add Student");
                                break;
                            case 2:
                                System.out.println("Remove Student");
                                break;
                            case 3:
                                System.out.println("Update Student");
                                break;
                            case 4:
                                tt =false;
                            default:
                                System.out.println("Select A Valid Option ❌❌❌❌❌❌❌❌❌❌ ");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Teacher Manipulation");
                    boolean t3 = true;
                    while(t3 == true){
                        System.out.println("---------------Teacher Section------------------");
                        System.out.println(" 1] Teacher Book \n 2] Teacher Book \n 3] Teacher Book \n 4] Back to Main Menu");
                        System.out.println("---------------------------------------------");
                        int ch = sc.nextInt();
                        switch (ch){
                            case 1:
                                System.out.println("Add Teacher");
                                break;
                            case 2:
                                System.out.println("Remove Teacher");
                                break;
                            case 3:
                                System.out.println("Update Teacher");
                                break;
                            case 4:
                                t3 =false;
                            default:
                                System.out.println("Select A Valid Option ❌❌❌❌❌❌❌❌❌❌ ");
                        }
                    }
                    break;
                case 7:
                    System.out.println("Get All Booked Issued");
                    break;
                case 8:
                    System.out.println("Get all Student Details");
                    break;
                case 9:
                    System.out.println("Get all Teacher Details");
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Please Enter the Valid Credential...🚀");

            }
        }


    }
}
