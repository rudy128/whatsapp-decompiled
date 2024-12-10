package X;

import java.util.regex.Pattern;

/* renamed from: X.70u  reason: invalid class name */
public abstract class AnonymousClass70u {
    public static final Pattern A00;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] A01(X.C18030ve r7, java.lang.String r8) {
        /*
            r6 = 0
            X.C18070vi.A0d(r7, r6)
            boolean r0 = X.AnonymousClass1EG.A0H(r8)
            r5 = 0
            if (r0 != 0) goto L_0x00be
            r1 = 8398(0x20ce, float:1.1768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x00be
            if (r8 == 0) goto L_0x00b9
            int r3 = r8.length()
            r0 = 1
            int r3 = r3 - r0
            r2 = 0
            r1 = 0
        L_0x001f:
            if (r2 > r3) goto L_0x0037
            r0 = r3
            if (r1 != 0) goto L_0x0025
            r0 = r2
        L_0x0025:
            boolean r0 = X.C109005cf.A0u(r8, r0)
            if (r1 != 0) goto L_0x0032
            if (r0 != 0) goto L_0x002f
            r1 = 1
            goto L_0x001f
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            int r3 = r3 + -1
            goto L_0x001f
        L_0x0037:
            java.lang.String r2 = X.C108985cd.A0g(r3, r2, r8)
            java.lang.String r1 = "\\s+"
            X.1wr r0 = new X.1wr
            r0.<init>((java.lang.String) r1)
            java.lang.String r7 = " "
            java.lang.String r3 = r0.A00(r2, r7)
            java.lang.String r0 = ""
            java.lang.String r1 = X.AnonymousClass1YE.A07(r3, r7, r0, r6)
            java.util.regex.Pattern r0 = A00
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00be
            java.util.List r2 = X.C108965cb.A0v(r3, r7, r6)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00b6
            java.util.ListIterator r1 = X.C108955ca.A18(r2)
        L_0x0068:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x00b6
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = X.C108985cd.A0t(r2, r1)
        L_0x0078:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r0 = r1.toArray(r0)
            int r0 = r0.length
            r4 = 2
            if (r0 != r4) goto L_0x00be
            java.util.List r3 = X.C108965cb.A0v(r3, r7, r6)
            boolean r0 = r3.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x00b3
            java.util.ListIterator r1 = X.C108955ca.A18(r3)
        L_0x0091:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x00b3
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0091
            java.util.List r0 = X.C108985cd.A0t(r3, r1)
        L_0x00a1:
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            int r0 = r1.length
            if (r0 != r4) goto L_0x00be
            java.lang.String[] r5 = new java.lang.String[r4]
            r0 = r1[r6]
            r5[r6] = r0
            r0 = r1[r2]
            r5[r2] = r0
            return r5
        L_0x00b3:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x00a1
        L_0x00b6:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x0078
        L_0x00b9:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00be:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70u.A01(X.0ve, java.lang.String):java.lang.String[]");
    }

    static {
        Pattern compile = Pattern.compile("[A-Za-z]+");
        C18070vi.A0X(compile);
        A00 = compile;
    }

    public static final Integer A00(String str, String str2) {
        int length;
        int length2;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return AnonymousClass3MY.A0f();
        }
        if (!(str == null || (length = str.length()) == 0)) {
            if (!(str2 == null || (length2 = str2.length()) == 0)) {
                char charAt = str.charAt(0);
                if ((charAt == '+' || charAt == '-') && length >= 2) {
                    int i = 1;
                    while (true) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 != '+' && charAt2 != '-') {
                            charAt = charAt2;
                            break;
                        }
                        i++;
                        if (i >= length) {
                            break;
                        }
                    }
                }
                char charAt3 = str2.charAt(0);
                if ((charAt3 == '+' || charAt3 == '-') && length2 >= 2) {
                    int i2 = 1;
                    while (true) {
                        char charAt4 = str2.charAt(i2);
                        if (charAt4 != '+' && charAt4 != '-') {
                            charAt3 = charAt4;
                            break;
                        }
                        i2++;
                        if (i2 >= length2) {
                            break;
                        }
                    }
                }
                if (!Character.isDigit(charAt) || Character.isDigit(charAt3)) {
                    if (Character.isDigit(charAt) || !Character.isDigit(charAt3)) {
                        return null;
                    }
                }
            }
            return -1;
        }
        return 1;
    }
}
