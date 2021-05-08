package sr.unasat.caesar;

public class Caesar {

    private int shift;
    private int amountCharactersAlphabeth;
    private int startingValueForBasicLatinLowerCaseCharacters;
    private int startingValueForBasicLatinUpperCaseCharacters;

    public Caesar(int keyWithDirection){
        this.shift = keyWithDirection;
        this.amountCharactersAlphabeth = 26;
        this.startingValueForBasicLatinUpperCaseCharacters = 65;
        this.startingValueForBasicLatinLowerCaseCharacters= 97;
    }



    public String encrypt(String stringToEncrypt) {

      /*  for (char i = 'a'; i <='z'; i++){
            System.out.println((int) i);
       // 'a' = 97 + 0;
       // 'z' = 97 + 25;
       ...............
        }

        for (char i = 'A'; i <='Z'; i++){
            System.out.println((int) i);
        // 'A' = 65 + 0;
        // 'Z' = 65 + 25;
        ..............
        }*/

        StringBuilder result = new StringBuilder();
        for (int i=0; i<stringToEncrypt.length(); i++)
        {
            if (Character.isUpperCase(stringToEncrypt.charAt(i)))
            {
                char ch = (char)(((int)stringToEncrypt.charAt(i) +
                        shift - startingValueForBasicLatinUpperCaseCharacters)
                        % amountCharactersAlphabeth
                        + startingValueForBasicLatinUpperCaseCharacters);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)stringToEncrypt.charAt(i) +
                        shift - startingValueForBasicLatinLowerCaseCharacters)
                        % amountCharactersAlphabeth
                        + startingValueForBasicLatinLowerCaseCharacters);
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String decrypt(String stringToDecrypt ) {

        StringBuilder result = new StringBuilder();
        for (int i=0; i<stringToDecrypt.length(); i++)
        {
            if (Character.isUpperCase(stringToDecrypt.charAt(i)))
            {
                char ch = (char)(((int)stringToDecrypt.charAt(i) +
                        -shift - startingValueForBasicLatinUpperCaseCharacters)
                        % amountCharactersAlphabeth
                        + startingValueForBasicLatinUpperCaseCharacters);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)stringToDecrypt.charAt(i) +
                        -shift - startingValueForBasicLatinLowerCaseCharacters)
                        % amountCharactersAlphabeth
                        + startingValueForBasicLatinLowerCaseCharacters);
                result.append(ch);
            }
        }
        return result.toString();

    }
}
