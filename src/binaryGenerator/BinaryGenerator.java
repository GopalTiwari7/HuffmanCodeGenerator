/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public StringBuilder convertNormalStringToBinaryString() {
        userInputStringInLowerCase.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<userInputStringInLowerCase.length();i++){
            int a = userInputStringInLowerCase.charAt(i);
            String s = Integer.toBinaryString(a);
            int asciiLength = 8 - s.length();
            stringBuilder.append("0".repeat(asciiLength));
            stringBuilder.append(s);
        }


        return stringBuilder;
    }
}
