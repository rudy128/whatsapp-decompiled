package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2pA  reason: invalid class name and case insensitive filesystem */
public abstract class C61122pA {
    public static final List A00 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBAN", "FBAV", "FBLC", "FBSV"}));
    public static final List A01 = Collections.unmodifiableList(Arrays.asList(new String[]{"FBBR", "FBBD", "FBBV", "FBCA", "FBPN", "FBDM"}));

    public static String A00(String str) {
        String str2;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                str2 = "&amp;";
            } else if (charAt < ' ' || charAt > '~') {
                sb.append("&#");
                sb.append(Integer.toString(charAt));
                str2 = ";";
            } else {
                sb.append(charAt);
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
