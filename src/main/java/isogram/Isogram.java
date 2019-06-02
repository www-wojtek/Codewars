package isogram;

public class Isogram {

    public static void main(String[] args) {


        System.out.println(isIsogram("dermatoglyphics"));
    }

    public static boolean isIsogram(String str) {
        char[] strTab;

        if (str.isEmpty()) {
            return true;
        } else {
            str = str.toLowerCase();
            strTab = str.toCharArray();

            for (int i = 0; i < str.length(); i++) {

                for (int j = i + 1; j < str.length(); j++) {

                    if (strTab[i] == strTab[j]) {

                        return false;
                    }
                }
            }
        }
        return true;
    }
}

/*
https://www.codewars.com/kata/isograms/solutions/java/me/best_practice

Description:
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines
whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

isIsogram "Dermatoglyphics" == true
isIsogram "moose" == false
isIsogram "aba" == false

 */
