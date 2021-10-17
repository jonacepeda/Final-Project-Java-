package Runner;

import Data.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        University myUniversity = new University();
        System.out.println("Welcome \n \n Choose an option:");
        myUniversity.communityCreation();
        Scanner scanner = new Scanner(System.in);
        String selection;
        int classSelection;

        do {
            System.out.println(" 1. Show all teachers \n 2. Print all the classes \n 3. Create a new student\n 4. Create a new class\n 5. Show all classes from a student \n 6. Exit");

                selection = scanner.next();


            try {
                switch (Integer.parseInt(selection)){
                    case 1:
                        System.out.println(myUniversity.getTeachersList());
                        System.out.println(" Insert any key to go back");
                        scanner.next();
                        break;
                    case 2:
                        do {
                            for (int i = 0; i < myUniversity.getSchoolClassesList().size(); i++) {
                                System.out.println((i + 1) + "." + myUniversity.getSchoolClassesList().get(i));
                            }
                            System.out.println("\nEnter the number of the class that you want more details\nPress 0 to go back");

                            classSelection = Integer.parseInt(scanner.next());

                            if (classSelection>0 && classSelection<myUniversity.getSchoolClassesList().size()+1) {
                                System.out.println("Teacher: " + myUniversity.getSchoolClassesList().get(classSelection - 1).getAssignedTeacher() + "\nStudent List:\n");
                                for (int i = 0; i < myUniversity.getSchoolClassesList().get(classSelection - 1).getStudentsList().size(); i++) {

                                    System.out.println(myUniversity.getSchoolClassesList().get(classSelection - 1).getStudentsList().get(i));
                                }
                                System.out.println("Press any key to go back");
                                scanner.next();
                            }else {
                                if (classSelection== 0) {
                                    System.out.println("Main Menu:");
                                }else {
                                    System.out.println("Incorrect input");
                                }
                            }

                        }while (classSelection!=0);
                        break;
                    case 3:

                        System.out.println("Insert the name of the new student");
                        String newStudentName = scanner.next();
                        System.out.println("Insert the age of the new student");
                        int newStudentAge = scanner.nextInt();
                        myUniversity.getStudentList().add(new Student(newStudentName, newStudentAge));
                        for (int i = 0; i < myUniversity.getSchoolClassesList().size(); i++) {
                            System.out.println((i + 1) + "." + myUniversity.getSchoolClassesList().get(i));
                        }
                        System.out.println("\nWhich course will be taken, please enter its number: ");
                        myUniversity.getSchoolClassesList().get(scanner.nextInt()-1).studentToClass(myUniversity.getStudentList().get(myUniversity.getStudentList().size()-1));
                        System.out.println("Successful registered \n");
                        break;

                    case 4:
                        System.out.println("Enter the name of the new course");
                        String newCourseName = scanner.next();
                        System.out.println("Insert the class room of the new class");
                        String newClassRoom = scanner. next();

                        for (int i = 0; i < myUniversity.getTeachersList().size(); i++) {
                            System.out.println((i + 1) + "." + myUniversity.getTeachersList().get(i));
                        }
                        System.out.println("Choose the number teacher that will be assigned to this new course:");
                        myUniversity.setSchoolClassesList(new SchoolClasses(newCourseName, newClassRoom, myUniversity.assignTeacher(scanner.nextInt()-1)));

                        int studentSelection;
                        do {
                        for (int i = 0; i < myUniversity.getStudentList().size(); i++) {
                            System.out.println((i + 1) + "." + myUniversity.getStudentList().get(i));
                        }
                        System.out.println("Which student do you want to add to this new course, press 0 to finish");
                        studentSelection = scanner.nextInt();
                        myUniversity.getSchoolClassesList().get(myUniversity.getSchoolClassesList().size()-1).studentToClass(myUniversity.getStudentList().get(studentSelection-1));
                        }while (studentSelection!=0);
                        System.out.println("Successful registered \n");


                        break;
                    case 5:
                        for (int i = 0; i < myUniversity.getStudentList().size(); i++) {
                            System.out.println((i + 1) + "." + myUniversity.getStudentList().get(i));
                        }
                        System.out.println("Select a student");
                        int idSelection = scanner.nextInt();
                        for (int i = 0; i < myUniversity.getSchoolClassesList().size(); i++) {
                            for (int j = 0; j < myUniversity.getSchoolClassesList().get(i).getStudentsList().size(); j++) {
                                if(myUniversity.getSchoolClassesList().get(i).getStudentsList().get(j).getId()==idSelection){
                                    System.out.println("\nThe student is registered in: " + myUniversity.getSchoolClassesList().get(i).getSubjectName());
                                }
                            }


                        }
                        System.out.println("\n");
                        break;
                    case 6:
                        System.out.println("Thanks, see you soon");
                        break;
                    default:
                        System.out.println("Incorrect Option, try again \n");
                        break;

                }
            }catch (Exception e) {
                System.out.println ("Please enter a number!\n");
                selection="1";
            }

            }while (Integer.parseInt(selection) != 6);


    }
}
