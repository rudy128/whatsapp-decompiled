package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0yC  reason: invalid class name and case insensitive filesystem */
public final class C19430yC implements C19420yB {
    public static final C19430yC A02;
    public static final String A03 = A00("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final Set A04 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C19290xy[]{new C19290xy("proto"), new C19290xy("json")})));
    public final String A00;
    public final String A01;

    static {
        String A002 = A00("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String A003 = A00("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        A02 = new C19430yC(A002, A003);
    }

    public C19430yC(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public static String A00(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = length - length2;
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(length + length2);
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(str.charAt(i2));
            if (length2 > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }
}
