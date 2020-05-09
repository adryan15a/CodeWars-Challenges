package exercises;

public class TwinStrings {

	/*
    test 2 strings are twins
    ex(String a = "abc"; String b = "bac"; - true)
      (String a = "bac"; String b = "bace"; - false)
     */

    public boolean verifyTwinStrings(String a, String b) {
        boolean result = false;
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        int trueCount = 0;

        if (c.length == d.length) {

            for (int i = 0; i < c.length; i++) {

                for (int j = 0; j < d.length; j++) {

                    if (c[i] == d[j]) {
                        trueCount += 1;
                    }
                }
            }
            if (trueCount == c.length) {
                result = true;
            }
        }
        return result;
    }
}
