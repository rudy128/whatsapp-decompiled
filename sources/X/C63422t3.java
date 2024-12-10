package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.2t3  reason: invalid class name and case insensitive filesystem */
public abstract class C63422t3 {
    public static String A01(Context context, AnonymousClass11S r2, C24921Me r3, AnonymousClass1E7 r4, AnonymousClass1E7 r5) {
        AnonymousClass1BI r0 = r4.A0J;
        if (r0 == null || r2.A0O(r0)) {
            return context.getString(2131891155);
        }
        return r3.A0T(r4, r3.A0B(r5.A0J));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 != 6) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        r2 = 2131232259;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if ((r9.A0I + 86400000) < X.AnonymousClass11P.A01(r8)) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (X.C446824j.A02(r9.A0D(), 4) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A00(android.content.Context r7, X.AnonymousClass11P r8, X.AnonymousClass206 r9) {
        /*
            boolean r0 = X.AnonymousClass25A.A0p(r9)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r3 = 4
            r2 = 0
            if (r0 == 0) goto L_0x001c
            X.205 r0 = r9.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001c
            int r0 = r9.A0D()
            boolean r0 = X.C446824j.A02(r0, r3)
            if (r0 == 0) goto L_0x005d
        L_0x001b:
            return r2
        L_0x001c:
            X.205 r0 = r9.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001b
            int r1 = r9.A0D()
            if (r1 == 0) goto L_0x005d
            r0 = 8
            if (r1 == r0) goto L_0x004f
            r0 = 13
            if (r1 == r0) goto L_0x004f
            r0 = 20
            if (r1 == r0) goto L_0x0068
            if (r1 == r3) goto L_0x004b
            r0 = 5
            if (r1 == r0) goto L_0x0047
            r0 = 6
            if (r1 == r0) goto L_0x001b
        L_0x003c:
            r2 = 2131232259(0x7f080603, float:1.8080622E38)
        L_0x003f:
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
        L_0x0042:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r7, r2, r0)
            return r0
        L_0x0047:
            r2 = 2131232656(0x7f080790, float:1.8081427E38)
            goto L_0x003f
        L_0x004b:
            r2 = 2131232665(0x7f080799, float:1.8081446E38)
            goto L_0x003f
        L_0x004f:
            r2 = 2131232656(0x7f080790, float:1.8081427E38)
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131101887(0x7f0608bf, float:1.7816196E38)
            int r0 = X.AnonymousClass1YL.A00(r7, r1, r0)
            goto L_0x0042
        L_0x005d:
            long r3 = r9.A0I
            long r3 = r3 + r5
            long r1 = X.AnonymousClass11P.A01(r8)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
        L_0x0068:
            r0 = 2131231893(0x7f080495, float:1.807988E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63422t3.A00(android.content.Context, X.11P, X.206):android.graphics.drawable.Drawable");
    }

    public static String A02(Context context, C438421d r3) {
        String A02 = C20097A7a.A02(r3);
        if (!TextUtils.isEmpty(A02)) {
            return A02;
        }
        if (TextUtils.isEmpty(r3.A18()) || C20097A7a.A05(r3)) {
            return context.getString(2131889027);
        }
        if (TextUtils.isEmpty(r3.A0S())) {
            return r3.A18();
        }
        return r3.A0S();
    }

    public static String A03(Context context, AnonymousClass21Y r3) {
        String A02 = C20097A7a.A02(r3);
        if (!TextUtils.isEmpty(A02)) {
            return A02;
        }
        if (TextUtils.isEmpty(r3.A18()) || C20097A7a.A05(r3)) {
            return context.getString(2131889038);
        }
        if (TextUtils.isEmpty(r3.A0S())) {
            return r3.A18();
        }
        return r3.A0S();
    }
}
