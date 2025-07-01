package Task_June27;

import java.util.Scanner;

public class WebsiteTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a website URL: ");
        String url = scanner.nextLine();

        // Extract the domain extension
        String domainExtension = "";
        int lastDotIndex = url.lastIndexOf('.');
        if (lastDotIndex != -1 && lastDotIndex < url.length() - 1) {
            domainExtension = url.substring(lastDotIndex + 1);
        }

        // Determine the type of website using if-else conditions
        if (domainExtension.equalsIgnoreCase("com")) {
            System.out.println("This is a Commercial website.");
        } else if (domainExtension.equalsIgnoreCase("org")) {
            System.out.println("This is an Organization website.");
        } else if (domainExtension.equalsIgnoreCase("edu")) {
            System.out.println("This is an Educational institution website.");
        } else if (domainExtension.equalsIgnoreCase("gov")) {
            System.out.println("This is a Government website.");
        } else if (domainExtension.equalsIgnoreCase("net")) {
            System.out.println("This is a Network-related website.");
        } else {
            System.out.println("Unknown or generic website type.");
        }
    }

}

