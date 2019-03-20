//Shifts english alphabet letters a certain amount of values

public class Caesar {

    public static String encrypt(String plainText, int shift){
        //26 = number of letters in English alphabet
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
                char cipher = (char)(plain+shift);//type cast: (shift) int to char

                Character.toUpperCase(cipher);
                if(cipher > 'Z'){
                    cipherText += (char)(plain - (26 - shift));
                }
                else{
                    cipherText += cipher;
                }
            }
            else{
                cipherText += plain;
            }
        }//end of for loop
        return cipherText;
    }

    public static void main(String[] args){
        String test = "This is a cesar cipher";
        String cipher = encrypt(test, 5);
        System.out.println(cipher);
    }
}
