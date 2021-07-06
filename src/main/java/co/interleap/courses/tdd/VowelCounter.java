package co.interleap.courses.tdd;

public class VowelCounter {

    public int getNumber(String name){
        int num = 0;
        for(int i = 0; i< name.length(); i++) {
            String current = name.substring(i, i+1);
            boolean isVowel = false;
            String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
            for(String vowel : vowels){
                if(current.equals(vowel))
                    num++;
            }
        }
        return num;
    }
}
