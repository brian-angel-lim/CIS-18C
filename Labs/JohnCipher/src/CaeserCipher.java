public class CaeserCipher implements ICipher {

    @Override
    public String encode(String key, String plainText) {
        // Get each letter of plainText from the base alphabet
        // by shifting it KEY number of characters.


        String currentAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder cipherText = new StringBuilder();
        Integer shift = Integer.parseInt();

        for (int i = 0; i < plainText.length(); i++) {
            Integer indexOfCurrentLetter = currentAlphabet.indexOf(plainText.charAt(i));
            indexOfCurrentLetter = (indexOfCurrentLetter + key) % currentAlphabet.length();
        }
        // Return array of those characters as cipherText.

    }

    @Override
    public String decode(String key, String cipherText) {
        return null;
    }
}
