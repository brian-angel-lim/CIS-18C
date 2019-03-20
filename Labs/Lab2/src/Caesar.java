//Shifts english alphabet letters a certain amount of values

public class Caesar implements Cipher{
    public String plainText = "";
    public int shift = 0;

    public Caesar(String plainText, int shift){
        this.plainText = plainText;
        this.shift = shift;
    }

    public String encrypt(String plainText, int shift){
        //26 = number of letters in English alphabet
        //shifting algorithm
        if(shift > 26){
            shift = shift%26;
        }
        else if(shift < 0){
            shift = (shift%26) + 26;
        }

        //Loop through this, shift every character inside it and then assign it
        //to the cipherText string
        String cipherText = "";
        int length = plainText.length();

        for(int i = 0; i < length; i++){
            char plain = plainText.charAt(i);
            //makes sure char is an alphabet letter
            if(Character.isLetter(plain)){
                //allows for both upper and lower case entries
                if(Character.isLowerCase(plain)){
                    char cipher = (char)(plain+shift);//type cast: (shift) int to char

                    if(cipher > 'z'){
                        cipherText += (char)(plain - (26 - shift));
                    }
                    else{
                        cipherText += cipher;
                    }
                }
                else if(Character.isUpperCase(plain)){
                    char cipher = (char)(plain+shift);//type cast: (shift) int to char

                    if(cipher > 'Z'){
                        cipherText += (char)(plain - (26 - shift));
                    }
                    else{
                        cipherText += cipher;
                    }
                }
            }
            else{
                cipherText += plain;
            }
        }
        return cipherText;
    }
}
