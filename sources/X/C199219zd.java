package X;

import android.icu.text.UnicodeSet;
import android.os.Build;

/* renamed from: X.9zd  reason: invalid class name and case insensitive filesystem */
public class C199219zd {
    public static final C199219zd A02 = new C199219zd("");
    public static final boolean A03 = C108975cc.A1C(Build.VERSION.SDK_INT, 24);
    public final UnicodeSet A00;
    public final String A01;

    public boolean A00(int i) {
        String str;
        int type;
        UnicodeSet unicodeSet;
        if (A03 && (unicodeSet = this.A00) != null) {
            return unicodeSet.contains(i);
        }
        String str2 = this.A01;
        int hashCode = str2.hashCode();
        if (hashCode == -1633268329) {
            str = "[:^S:]";
        } else if (hashCode != -1605334735) {
            if (hashCode == 0 || hashCode != 888719627) {
                return false;
            }
            str = "[[:^S:]&[:^Z:]]";
        } else if (str2.equals("[:digit:]")) {
            return Character.isDigit(i);
        } else {
            return false;
        }
        if (!str2.equals(str) || (type = Character.getType(i)) == 26 || type == 25 || type == 27 || type == 28) {
            return false;
        }
        return true;
    }

    public C199219zd(String str) {
        UnicodeSet unicodeSet;
        this.A01 = str;
        if (!A03) {
            unicodeSet = null;
        } else if (str.isEmpty()) {
            unicodeSet = UnicodeSet.EMPTY;
        } else {
            unicodeSet = new UnicodeSet(str);
        }
        this.A00 = unicodeSet;
    }
}
