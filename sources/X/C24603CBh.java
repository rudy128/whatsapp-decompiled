package X;

/* renamed from: X.CBh  reason: case insensitive filesystem */
public abstract class C24603CBh {
    public static String A00(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 'A' || charAt > 'Z') {
                i++;
            } else {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
        }
        return str;
    }
}
