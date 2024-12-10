package X;

import java.util.regex.Pattern;

/* renamed from: X.Bp1  reason: case insensitive filesystem */
public class C23756Bp1 extends C25836Cmq {
    public final Pattern A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C23756Bp1)) {
                return false;
            }
            Pattern pattern = this.A00;
            Pattern pattern2 = ((C23756Bp1) obj).A00;
            if (pattern == null) {
                return pattern2 == null;
            }
            if (!pattern.equals(pattern2)) {
                return false;
            }
        }
    }

    public String toString() {
        String str = this.A02;
        if (str.startsWith("/")) {
            return str;
        }
        StringBuilder A0o = AnonymousClass8BW.A0o("/", str);
        A0o.append("/");
        return AnonymousClass000.A0y(this.A01, A0o);
    }

    public C23756Bp1(CharSequence charSequence) {
        String str;
        int i;
        String charSequence2 = charSequence.toString();
        int indexOf = charSequence2.indexOf(47);
        int lastIndexOf = charSequence2.lastIndexOf(47);
        String substring = charSequence2.substring(indexOf + 1, lastIndexOf);
        this.A02 = substring;
        int i2 = lastIndexOf + 1;
        if (charSequence2.length() > i2) {
            str = charSequence2.substring(i2);
        } else {
            str = "";
        }
        this.A01 = str;
        int i3 = 0;
        for (char c : str.toCharArray()) {
            Integer[] A002 = AnonymousClass00R.A00(7);
            int length = A002.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i = 0;
                    break;
                }
                Integer num = A002[i4];
                if (C25345Ce4.A00(num) == c) {
                    i = C25345Ce4.A01(num);
                    break;
                }
                i4++;
            }
            i3 |= i;
        }
        this.A00 = Pattern.compile(substring, i3);
    }

    public C23756Bp1(Pattern pattern) {
        this.A02 = pattern.pattern();
        this.A00 = pattern;
        int flags = pattern.flags();
        StringBuilder A10 = AnonymousClass000.A10();
        for (Integer num : AnonymousClass00R.A00(7)) {
            int A012 = C25345Ce4.A01(num);
            if ((A012 & flags) == A012) {
                A10.append(C25345Ce4.A00(num));
            }
        }
        this.A01 = A10.toString();
    }
}
