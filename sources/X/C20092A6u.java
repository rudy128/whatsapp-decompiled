package X;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A6u  reason: case insensitive filesystem */
public abstract class C20092A6u {
    public static final BigDecimal A00 = new BigDecimal("100");

    public static final String A00(C18000vb r2, long j) {
        C18070vi.A0d(r2, 1);
        String format = DateFormat.getDateInstance(2, r2.A0N()).format(Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
        C18070vi.A0X(format);
        return format;
    }

    public static final BigDecimal A01(AEP aep, BigDecimal bigDecimal) {
        C18070vi.A0d(aep, 0);
        BigDecimal bigDecimal2 = new BigDecimal(aep.A03);
        BigDecimal add = bigDecimal.multiply(bigDecimal2).add(bigDecimal.multiply(bigDecimal2).multiply(new BigDecimal(aep.A05).divide(A00)));
        C18070vi.A0X(add);
        return add;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        return X.C18020vd.A05(r2, r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(X.C18030ve r4, java.lang.String r5) {
        /*
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r3 = 0
            if (r5 == 0) goto L_0x0022
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0022
            r0 = 2617(0xa39, float:3.667E-42)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r4, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = X.C108975cc.A0d(r5)
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0023;
                case 3008417: goto L_0x002e;
                case 3197625: goto L_0x0039;
                case 100023093: goto L_0x0044;
                default: goto L_0x0022;
            }
        L_0x0022:
            return r3
        L_0x0023:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2740(0xab4, float:3.84E-42)
            goto L_0x004e
        L_0x002e:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2741(0xab5, float:3.841E-42)
            goto L_0x004e
        L_0x0039:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2742(0xab6, float:3.842E-42)
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 2739(0xab3, float:3.838E-42)
        L_0x004e:
            boolean r3 = X.C18020vd.A05(r2, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20092A6u.A02(X.0ve, java.lang.String):boolean");
    }

    public static final boolean A03(C18030ve r6, String str) {
        boolean A17 = C18070vi.A17(str, r6);
        String A0v = C108955ca.A0v(r6, 2944);
        if (A0v.length() != 0) {
            for (String A0A : C108955ca.A1b(C108985cd.A0s(A0v, A17 ? 1 : 0))) {
                if (AnonymousClass1YE.A0A(str, A0A, false)) {
                    return A17;
                }
            }
        }
        return false;
    }
}
