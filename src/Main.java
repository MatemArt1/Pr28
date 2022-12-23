public class Main {
    /*
    A Needle in the Haystack.
    Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

"found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)
["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
     */
    public static String findNeedle(Object[] haystack) {
        // Your code here
        for (int i = 0; i < haystack.length; i++)
        {
            if (haystack[i] == "needle")
            {
                String S = "found the needle at position " + i;
                return S;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}