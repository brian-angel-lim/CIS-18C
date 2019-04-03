public class CaeserCipher implements ICipher {

    @Override
    public String encode(String key, String plainText) {
        // Get each letter of plainText from the base alphabet
        // by shifting it KEY number of characters.


        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder cipherText = new StringBuilder();
        Integer shift = Integer.parseInt(key);
        boolean lower = false;
        boolean upper = false;

        for (int i = 0; i < plainText.length(); i++) {
            lower = false;
            upper = false;

            // If we didn't find in the uppercase alphabet
            Integer indexOfCurrentLetter = upperAlphabet.indexOf(plainText.charAt(i));
            if (indexOfCurrentLetter < 0) {
                //look in the lower-case alphabet
                indexOfCurrentLetter = upperAlphabet.indexOf(plainText.charAt(i));
                lower = true;
            } else {
                // It was found in the upper-case alphabet
                upper = true;
            }

            if (indexOfCurrentLetter >= 0) {
                Integer shiftedIndex = (indexOfCurrentLetter + shift) % upperAlphabet.length();
                indexOfCurrentLetter = (indexOfCurrentLetter + shift) % upperAlphabet.length();
                if (upper) {
                    cipherText.append(upperAlphabet.charAt(indexOfCurrentLetter));
                } else {
                    cipherText.append(lowerAlphabet.charAt(shiftedIndex));
                }
            } else {
                cipherText.append(plainText.charAt(i));
            }
        }
        // Return array of those characters as cipherText.
        return cipherText.toString();

    }

    @Override
    public String decode(String key, String cipherText) {
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder cipherText = new StringBuilder();
        Integer shift = Integer.parseInt(key);
        boolean lower = false;
        boolean upper = false;

        for (int i = 0; i < cipherText.length(); i++) {
            lower = false;
            upper = false;

            // If we didn't find in the uppercase alphabet
            Integer indexOfCurrentLetter = upperAlphabet.indexOf(cipherText.charAt(i));
            if (indexOfCurrentLetter < 0) {
                //look in the lower-case alphabet
                indexOfCurrentLetter = upperAlphabet.indexOf(cipherText.charAt(i));
                lower = true;
            } else {
                // It was found in the upper-case alphabet
                upper = true;
            }

            if (indexOfCurrentLetter >= 0) {
                Integer shiftedIndex = (indexOfCurrentLetter - shift) % upperAlphabet.length();
                indexOfCurrentLetter = (indexOfCurrentLetter - shift) % upperAlphabet.length();
                if (upper) {
                    plainText.append(upperAlphabet.charAt(indexOfCurrentLetter));
                } else {
                    plainText.append(lowerAlphabet.charAt(shiftedIndex));
                }
            } else {
                plainText.append(cipherText.charAt(i));
            }
        }

        // Return array of those characters as cipherText.
        return cipherText.toString();

    }
}
