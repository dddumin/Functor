package model;

public class StringFilter {
    public boolean isWord(String str){
        for (Character c : str.toCharArray()) {
            if (!Character.isLetter(c))
                return false;
        }
        return true;
    }
}
