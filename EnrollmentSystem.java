import java.util.Scanner;
public class EnrollmentSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("1.) Enroll a student\n");
        System.out.print("2.) About\n");
        System.out.print("3.) Exit\n");
        
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                System.out.print("\n\tENROLLMENT FORM\n\n");
                System.out.print("Name : ");
                input.nextLine();
                String name = input.nextLine();
                
                System.out.print("Middle Name : ");
                String middleName = input.nextLine();
                
                System.out.print("Surname : ");
                String surname = input.nextLine();
                
                System.out.print("Age : ");
                int age = input.nextInt();
                
                System.out.print("School he/she graduated at : ");
                input.nextLine();
                String school = input.nextLine();
                
                System.out.print("Primary Address : ");
                String address = input.nextLine();
                
                System.out.print("Email : ");
                String email = input.nextLine();
                
                System.out.print("Cell#: ");
                String number = input.nextLine();
                
                System.out.print("Father`s Full Name : ");
                String father = input.nextLine();
                
                System.out.print("Cell#: ");
                String cellFather = input.nextLine();
                
                System.out.print("Mother`s Full Name : ");
                String mother = input.nextLine();
                
                System.out.print("Cell#: ");
                String cellMother = input.nextLine();
                
                System.out.print("Guardian`s Full Name : ");
                String guardian = input.nextLine();
                
                System.out.print("Cell#: ");
                String cellGuardian = input.nextLine();
                
                System.out.print("Grade entering : ");
                String grade = input.nextLine();
                
                System.out.print("\n\n" + name + " is successfully enrolled!\n\n");
                break;
                
            case 2:
                System.out.print("\n\nWelcome to Our Enrollment System!\nAt Bacani`s National High School, we are dedicated to providing a seamless and efficient\nenrollment process for our students. Our state-of-the-art enrollment system is designed to\nsimplify the registration experience, saving you time and effort.");
                break;
                
            case 3:
                System.out.print("\n\n---EXITING---\n\n");
                break;
            
            default:
                System.out.print("\n\nINVALID CHOICE!\n\n");
            
            
        }
        
    }
}
