package org.horizoncolumbus.hs;

public class TechDistribution {

    public static void main(String[] args) {
	// write your code here
        boolean isJunior = false;
        boolean isSenior = false;
        boolean isTeacher = true;
        boolean isAdmin = false;
        boolean haveCTE = false;
        boolean atHome = false;

        if (isJunior || (isSenior && haveCTE)){
            System.out.println("Windows laptop given.");
        }
        else if (isTeacher || (isAdmin && atHome)){
            System.out.println("Macbook laptop given.");
        }
        else{
            System.out.println("Take your crusty and oily chromebook fool.");
        }
    }
}
