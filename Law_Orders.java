package com.sc.next;

import java.util.HashMap;
import java.util.Scanner;

public class Law_Orders {
   static Scanner sc = new Scanner(System.in);
  static  HashMap<String, String> lawOrder = new HashMap<String, String>();

 static void display(){
   	for (String key : lawOrder.keySet()) {
	    String value = lawOrder.get(key);
	    System.out.println(key + " , " + value);
	}
 }
   static void search(){
	     System.out.println("ENTER THE YEAR: ");
         String key = sc.next();
         boolean found = false;
         for (String law : lawOrder.keySet()) {
             if (lawOrder.get(law).equals(key)) {
                 System.out.println(law);
                 found = true;
             }
         }
         if (!found) {
             System.out.println("LAW NOT FOUND!!");
         }
    
   }
 
    public static void main(String[] args) {

        lawOrder.put("CRIMINAL LAW (AMENDMENT) ACT", "2018");
        lawOrder.put("THE INDIAN PENAL CODE ACT", "1860");
        lawOrder.put("THE COMMISSIONS OF INQUIRY (CENTRAL) RULES", "1972");
        lawOrder.put("THE ARMED FRORCES (SPECIAL POWERS) ACT", "1958");
        lawOrder.put("THE BORDER SECURITY FORCE ACT", "1948");
        lawOrder.put("THE CENTRAL RESERVE POLICE FORCE ACT", "1992");
        lawOrder.put("THE NATIONAL SECURITY GUARD ACT", "1986");
        lawOrder.put("THE CENSUS ACT, 1948", "1948");
        lawOrder.put("THE CENTRAL RESERVE POLICE FRORCE RULES", "1955");
        lawOrder.put("THE CENTRAL INDUSTRIAL SECURITY ACT", "1968");

        System.out.println("\t\tWELCOME TO THE DIGITALIZATION OF LAW AND ORDER");
        System.out.println("MENU : \nENTER - \n1.DISPLAY THE LAWS \n2.TO SEARCH BY YEAR\n3.UPDATE DETAILS OF LAW \n4.EXIT");

        int ch = sc.nextInt();
        while (ch != 4) {
            switch (ch) {
                case 1:
                	display();
                 break;

                case 2:
                	search();
                    break;

                case 3:
                    System.out.println("ENTER THE LAW NAME TO UPDATE: ");
                    sc.nextLine();
                    String currentLaw = sc.nextLine();
                    if (lawOrder.containsKey(currentLaw)) {
                        System.out.println("ENTER THE UPDATED LAW NAME: ");
                        String updatedLaw = sc.nextLine();
                        System.out.println("ENTER THE YEAR: ");
                        String updatedYear = sc.nextLine();
                        lawOrder.remove(currentLaw); 
                        lawOrder.put(updatedLaw, updatedYear); 
                        System.out.println("LAW UPDATED SUCCESSFULLY!");
                    } else {
                        System.out.println("LAW NOT FOUND!!");
                    }
                    System.out.println("UPDATED DETAILS ARE: ");
                    System.out.println();
                    display();
                    break;
                default:
                    System.out.println("INVALID CHOICE!!");
                    break;
            }

            System.out.println("\nMENU : \nENTER - \n1.DISPLAY THE LAWS \n2.TO SEARCH BY YEAR\n3.UPDATE DETAILS OF LAW \n4.EXIT");
            ch = sc.nextInt();
        }

        System.out.println("END OF THE PROGRAM!!\nHOPE YOU ENJOYED!!");
    }
}
