package X;

import java.math.BigDecimal;
import java.util.HashMap;

public class A6S {
    public static final A6S A01 = new A6S("USD");
    public static final A6S A02 = new A6S("XXX");
    public final String A00;

    public static int A00(String str) {
        Number A1D = C108945cZ.A1D(C108955ca.A0y(str), C62972sI.A01);
        if (A1D == null) {
            return 2;
        }
        return A1D.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0058, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r0 == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r1 = r6.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        if (r1.isEmpty() == false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r1 = X.A4I.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        r4 = new X.C185829dD(r1, r8);
        r3 = r6.A0N();
        r1 = r4.A01.A00;
        r2 = r4.A00.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (r1.equals(r2) != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r1 = X.AnonymousClass001.A1H(";", r2, X.AnonymousClass000.A11(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r1 = new X.A4I(r4, new X.A2Z(r1, r3), r6);
        r1.A00 = r5.A00;
        r1.A01 = r5.A02(r6);
        r1.A07.A03(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A4I A01(X.A6S r5, X.C18000vb r6, int r7, boolean r8) {
        /*
            java.util.regex.Pattern r0 = X.A4I.A0B
            java.util.Locale r0 = r6.A0N()
            java.lang.String r1 = X.AnonymousClass1X0.A03(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 1632: goto L_0x0071;
                case 1776: goto L_0x0069;
                case 2406: goto L_0x0061;
                case 2534: goto L_0x0059;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = 5
        L_0x0012:
            java.lang.String r1 = r6.A08(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = X.A4I.A0A
        L_0x001e:
            X.9dD r4 = new X.9dD
            r4.<init>(r1, r8)
            java.util.Locale r3 = r6.A0N()
            X.9eb r0 = r4.A01
            java.lang.String r1 = r0.A00
            X.9eb r0 = r4.A00
            java.lang.String r2 = r0.A00
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x003f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = ";"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
        L_0x003f:
            X.A2Z r0 = new X.A2Z
            r0.<init>(r1, r3)
            X.A4I r1 = new X.A4I
            r1.<init>(r4, r0, r6)
            java.lang.String r0 = r5.A00
            r1.A00 = r0
            java.lang.String r0 = r5.A02(r6)
            r1.A01 = r0
            X.A2Z r0 = r1.A07
            r0.A03(r7)
            return r1
        L_0x0059:
            java.lang.String r0 = "০"
            boolean r0 = r1.equals(r0)
            r1 = 3
            goto L_0x0078
        L_0x0061:
            java.lang.String r0 = "०"
            boolean r0 = r1.equals(r0)
            r1 = 4
            goto L_0x0078
        L_0x0069:
            java.lang.String r0 = "۰"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto L_0x0078
        L_0x0071:
            java.lang.String r0 = "٠"
            boolean r0 = r1.equals(r0)
            r1 = 1
        L_0x0078:
            if (r0 != 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6S.A01(X.A6S, X.0vb, int, boolean):X.A4I");
    }

    public String A02(C18000vb r13) {
        HashMap hashMap = C62972sI.A02;
        String str = this.A00;
        Number A1D = C108945cZ.A1D(str, hashMap);
        if (A1D == null) {
            return str;
        }
        String A08 = r13.A08(A1D.intValue());
        if (A08.isEmpty()) {
            return str;
        }
        C25950CpI cpI = C25950CpI.A03;
        if (C25950CpI.A00(cpI, A08)) {
            return A08;
        }
        int length = A08.length();
        StringBuilder sb = new StringBuilder(length + 2);
        int i = 0;
        while (i < length) {
            int codePointAt = A08.codePointAt(i);
            String[] strArr = (String[]) C60772oa.A00.get(Integer.valueOf(codePointAt));
            if (strArr != null && strArr.length != 0) {
                if (strArr.length != 1) {
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr[i2];
                        if (!C25950CpI.A00(cpI, str2)) {
                            i2++;
                        } else if (str2 != null) {
                            sb.append(str2);
                        }
                    }
                } else {
                    sb.append(strArr[0]);
                }
                i += Character.charCount(codePointAt);
            }
            sb.appendCodePoint(codePointAt);
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((A6S) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public A6S(String str) {
        if (str.length() == 3) {
            this.A00 = C108955ca.A0y(str);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("invalid currency code; currencyCode=");
        throw AnonymousClass001.A12(str, A10);
    }

    public String A03(C18000vb r5, BigDecimal bigDecimal, boolean z) {
        C186689eb r0;
        A4I A012 = A01(this, r5, bigDecimal.scale(), z);
        String A022 = A012.A07.A02(bigDecimal);
        C185829dD r1 = A012.A02;
        if (!r1.A02) {
            return A022;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            r0 = r1.A00;
        } else {
            r0 = r1.A01;
        }
        return A4I.A00(r0, A012, A022);
    }
}
