package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

public abstract class A3U {
    public static final SpannableStringBuilder A00(Context context, C18000vb r6, AnonymousClass1KJ r7, AnonymousClass1KN r8) {
        C18070vi.A0d(context, 0);
        AnonymousClass8BX.A1J(r6, r8, r7, 1);
        return A01(context, r6, r7, r8, 0, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0.scale() <= 0) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(X.C18000vb r14, X.AnonymousClass1KJ r15, X.AnonymousClass1KN r16, int r17, boolean r18) {
        /*
            r2 = r15
            X.1KL r2 = (X.AnonymousClass1KL) r2
            r13 = 0
            r9 = 1
            r4 = r14
            r0 = r16
            r3 = r17
            if (r3 == r9) goto L_0x007c
            r1 = 2
            java.lang.String r5 = r2.A06
            if (r3 == r1) goto L_0x006c
            java.math.BigDecimal r7 = r0.A00
            int r8 = r7.scale()
            java.lang.String r6 = r2.A09
            java.lang.String r3 = X.C20067A5r.A01(r4, r5, r6, r7, r8, r9)
        L_0x001d:
            X.C18070vi.A0X(r3)
            java.lang.String r0 = r15.BLa(r14, r0)
            int r2 = r7.scale()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r1 = 0
            int r3 = X.AnonymousClass1YF.A0F(r3, r0, r13, r13)
            int r0 = r0.length()
            if (r2 <= 0) goto L_0x003a
            int r1 = r2 + 1
        L_0x003a:
            int r2 = r0 - r1
            int r2 = r2 + r3
            int r3 = r3 + r0
            int r0 = r7.signum()
            if (r0 == 0) goto L_0x005d
            int r0 = r7.scale()
            if (r0 <= 0) goto L_0x005d
            int r0 = r7.signum()
            if (r0 != 0) goto L_0x0067
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r13)
        L_0x0057:
            int r0 = r0.scale()
            if (r0 > 0) goto L_0x0062
        L_0x005d:
            if (r18 == 0) goto L_0x0062
            r4.delete(r2, r3)
        L_0x0062:
            java.lang.String r0 = X.C18070vi.A0H(r4)
            return r0
        L_0x0067:
            java.math.BigDecimal r0 = r7.stripTrailingZeros()
            goto L_0x0057
        L_0x006c:
            java.lang.String r10 = r2.A09
            java.math.BigDecimal r7 = r0.A00
            int r12 = r7.scale()
            r8 = r14
            r9 = r5
            r11 = r7
            java.lang.String r3 = X.C20067A5r.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x001d
        L_0x007c:
            java.lang.String r5 = r2.A06
            java.lang.String r6 = r2.A09
            java.math.BigDecimal r7 = r0.A00
            int r8 = r7.scale()
            java.lang.String r3 = X.C20067A5r.A00(r4, r5, r6, r7, r8, r9)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A3U.A02(X.0vb, X.1KJ, X.1KN, int, boolean):java.lang.String");
    }

    public static final SpannableStringBuilder A01(Context context, C18000vb r3, AnonymousClass1KJ r4, AnonymousClass1KN r5, int i, boolean z) {
        C18070vi.A0h(context, r3);
        C18070vi.A0d(r4, 3);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(A02(r3, r4, r5, i, z));
        if (C50802Vv.A00 == null) {
            C50802Vv.A00 = C50802Vv.A00(context);
        }
        return A09;
    }
}
