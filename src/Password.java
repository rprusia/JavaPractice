/**
 * Background
 * Different sites have different password requirements.
 *
 * You have grown tired of having to think up new passwords to meet all the different rules, so you write a small piece of code to do all the thinking for you.
 *
 * Kata Task
 * Return any valid password which matches the requirements.
 *
 * Input:
 *
 * len = password must be this length
 * flagUpper = must (or must not) contain UPPERCASE alpha
 * flagLower = must (or must not) contain lowercase alpha
 * flagDigit = must (or must not) contain digit
 *
 * Notes
 * Only alpha-numeric characters are permitted
 * The same character cannot occur more than once in the password!
 * All test cases guarantee that a valid password is possible
 * FUNDAMENTALS
 */

import java.util.Random;

public class Password {

    public static String makePassword(int len, boolean flagUpper, boolean flagLower, boolean flagDigit) {

        StringBuilder sb = new StringBuilder();
        StringBuilder currentString = new StringBuilder();
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digit = "0123456789";
        int numberOfChars = 0;
        int index = 0, digitIndex = 0;

        do {

                index = (int) (alpha.length() * Math.random());
                digitIndex = (int) (digit.length() * Math.random());

                if (flagLower) {

                    // get random lowercase value append to currentString
                    currentString.append(Character.toString(alpha.toLowerCase().charAt(index))).toString();

                    if (sb.length() == len) {
                        break;
                    }

                    if (writeUniqueValue(sb, currentString)) {

                        sb.append(currentString.toString());
                        numberOfChars++;

                    }
                    currentString.setLength(0);
                }
                if (flagUpper) {

                    currentString.append(Character.toString(alpha.toUpperCase().charAt(index))).toString();
                    if (sb.length() == len) {
                        break;
                    }
                    if (writeUniqueValue(sb, currentString)) {

                        sb.append(currentString.toString());
                        numberOfChars++;

                    }
                    currentString.setLength(0);
                }

                if (flagDigit) {

                    currentString.append(Character.toString(digit.charAt(digitIndex))).toString();
                    if (sb.length() == len) {
                        break;
                    }

                    if (writeUniqueValue(sb, currentString)) {

                        sb.append(currentString.toString());
                        numberOfChars++;

                    }
                    currentString.setLength(0);
                }

            } while (sb.length() <= len);


        return sb.toString();
    }


        public static boolean writeUniqueValue (StringBuilder uniqueSb, StringBuilder currentStringValue){
            // determine if currentString value exists in sb
            if (uniqueSb.indexOf(currentStringValue.toString(), 0) == -1) {  // char does not exist, append to sb stringbuilder

                return true;

            } else {

                return false;

            }
        }
    }

