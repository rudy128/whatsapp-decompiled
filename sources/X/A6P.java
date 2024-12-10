package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class A6P {
    public static final Pattern A02 = Pattern.compile("(\\d{3})(\\d{2,3})");
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        A6P a6p = (A6P) obj;
        return TextUtils.equals(this.A00, a6p.A00) && TextUtils.equals(this.A01, a6p.A01);
    }

    public static A6P A00(String str) {
        String str2 = "000";
        String str3 = str2;
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                try {
                    str2 = String.format(Locale.US, "%03d", new Object[]{Integer.valueOf(matcher.group(2))});
                } catch (NumberFormatException e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("mccmnc/parse mnc not parseable as integer: ");
                    C108985cd.A1M(matcher.group(2), A10, e);
                }
            }
        }
        return new A6P(str3, str2);
    }

    public static String A01(String str, String str2) {
        if (str != null) {
            Matcher matcher = A02.matcher(str);
            if (matcher.matches()) {
                return AnonymousClass001.A1H("-", matcher.group(2), AnonymousClass000.A11(matcher.group(1)));
            }
        }
        return str2;
    }

    public int hashCode() {
        int A002 = C17900vP.A00(this.A00);
        return (A002 * 31) + C108955ca.A06(this.A01);
    }

    public A6P(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MccMnc<");
        A10.append(this.A00);
        A10.append(",");
        A10.append(this.A01);
        return AnonymousClass000.A0y(">", A10);
    }
}
