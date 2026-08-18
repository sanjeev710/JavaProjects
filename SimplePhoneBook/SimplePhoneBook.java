import java.sql.SQLOutput;
import java.util.*;

public class SimplePhoneBook {
    public static void addContact(String[] names, String[] phoneNumbers, String name, String phoneNumber, int count){
        names[count] = name;
        phoneNumbers[count] = phoneNumber;
    }

    public static int searchByName(String[] names, String name, int count){
        for(int i = 0; i < count; i++){
            if(names[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    public static int searchByPhoneNumber(String[] phoneNumbers, String phoneNumber, int count){
        for(int i = 0; i < count; i++){
            if(phoneNumbers[i].equals(phoneNumber)){
                return i;
            }
        }
        return -1;
    }

    public static void displayContacts(String[] names, String[] phoneNumbers, int count){
        if(count == 0){
            System.out.println("There is no contacts");
        }
        else{
            System.out.println("Contacts:");
            for(int i = 0; i < count; i++){
                System.out.println("Name: " + names[i]);
                System.out.println("Phone Number: " + phoneNumbers[i]);
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Stores names and phone numbers in string array
        String[] names = new String[5];
        String[] phoneNumbers = new String[5];
        String name;
        String phoneNumber;
        int count = 0;

        while(true) {
            System.out.println("Phone Book\n1. Add Contact\n2. Search Contact\n3. Display Contacts\n4. Exit");
            System.out.print("Please select the option: ");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the name: ");
                    name = scan.nextLine();
                    System.out.print("Enter the phone number: ");
                    phoneNumber = scan.nextLine();
                    addContact(names, phoneNumbers, name, phoneNumber, count);
                    count++;
                    break;

                case 2:
                    System.out.println("Search Name or Phone Number");
                    System.out.println("1. Name\n2. Phone Number");
                    System.out.print("Please select an option: ");
                    int select = scan.nextInt();
                    scan.nextLine();
                    if (select == 1) {
                        name = scan.nextLine();
                        int index = searchByName(names, name, count);
                        if (index == -1) {
                            System.out.println("There is no such contact!!!");
                        } else {
                            System.out.println("Phone Number: " + phoneNumbers[index]);
                        }
                    } else {
                        phoneNumber = scan.nextLine();
                        int index = searchByPhoneNumber(phoneNumbers, phoneNumber, count);
                        if (index == -1) {
                            System.out.println("There is no such contact!!!");
                        } else {
                            System.out.println("Name: " + names[index]);
                        }
                    }
                    break;

                case 3:
                    displayContacts(names, phoneNumbers, count);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
