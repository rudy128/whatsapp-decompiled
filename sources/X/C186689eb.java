package X;

import java.util.regex.Matcher;

/* renamed from: X.9eb  reason: invalid class name and case insensitive filesystem */
public class C186689eb {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C186689eb(String str, boolean z) {
        Matcher matcher = A4I.A0B.matcher(str);
        matcher.find();
        this.A00 = matcher.group();
        boolean z2 = false;
        if (z) {
            int indexOf = str.indexOf(164);
            this.A01 = str.substring(0, indexOf);
            this.A02 = str.substring(indexOf + 1);
            if (matcher.start() > indexOf) {
                z2 = true;
            }
        } else {
            this.A02 = "";
            this.A01 = "";
        }
        this.A03 = z2;
    }
}
