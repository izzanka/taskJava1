/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskjava1;

/**
 *
 * @author ASUS
 */
public class TaskJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Biodata biodata = new Biodata();
        System.out.println("Full name      : " + biodata.getFullName());
        System.out.println("Place of birth : " + biodata.getPlaceOfBirth());
        System.out.println("Date of birth  : " + biodata.getDateOfBirth());
        System.out.println("Hobby          : " + biodata.getHobby());
        System.out.println("Zodiac         : " + biodata.getZodiac());
        System.out.println("Favorite food  : " + biodata.getFavoriteFood());
        System.out.println("Future goal    : " + biodata.getFutureGoal());

    }
    
}
