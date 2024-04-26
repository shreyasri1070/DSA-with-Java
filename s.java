import java .util.*;
public class s{
    public static void main(String[] args) {
        String sentence="jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println(checkIfPangram(sentence));

    }
        static boolean checkIfPangram(String sentence) {
            ArrayList<Character> c = new ArrayList<Character>();
            c.add(sentence.charAt(0));
            for (int i = 1; i < sentence.length(); i++) {
                if (!c.contains(sentence.charAt(i))) {
                    c.add(sentence.charAt(i));
                }

                if (c.size() == 26) {
                    return true;
                }
            }
                return false;

        }
}
