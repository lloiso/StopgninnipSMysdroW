public class SpinWords {

    public String spinWords(String sentence) {

        String retSword = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                StringBuilder tmp2 = new StringBuilder(words[i]);
                int k = 0;
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    char c = words[i].charAt(j);
                    tmp2.setCharAt(k, c);
                    k++;
                }
                retSword = retSword.trim() + " " + tmp2.toString();
            }else {
                retSword = retSword.trim() + " " + words[i];
            }
        }
        String tmp3 = retSword.trim();
        //TODO: Code stuff here
        return tmp3;
    }
}
