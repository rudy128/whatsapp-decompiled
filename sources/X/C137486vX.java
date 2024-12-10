package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;

/* renamed from: X.6vX  reason: invalid class name and case insensitive filesystem */
public abstract class C137486vX {
    public static Drawable A00(Context context, C438921i r5) {
        String str = r5.A06;
        String A19 = r5.A19();
        String A0y = C108955ca.A0y(C25291Nq.A03(str));
        if (TextUtils.isEmpty(A0y) && !TextUtils.isEmpty(A19)) {
            A0y = C108955ca.A0y(C64062u9.A09(A19));
        }
        return A01(context, str, A0y, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r2 = X.C108955ca.A0y(X.C25291Nq.A03(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        r0 = 2131232456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r0 = 2131232457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        r0 = 2131231906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        r0 = 2131232453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r5.equals(r0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        r0 = 2131232460;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (r7 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0090, code lost:
        r0 = 2131232461;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0097, code lost:
        return X.C24261Jm.A00(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable A01(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            if (r5 != 0) goto L_0x0023
            r3 = 2131232458(0x7f0806ca, float:1.8081026E38)
            if (r7 == 0) goto L_0x000a
            r3 = 2131232459(0x7f0806cb, float:1.8081028E38)
        L_0x000a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0098
            java.lang.String r2 = ""
        L_0x0012:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131169036(0x7f070f0c, float:1.795239E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.5da r0 = new X.5da
            r0.<init>(r4, r2, r3, r1)
            return r0
        L_0x0023:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1248334925: goto L_0x0041;
                case -1248332507: goto L_0x0052;
                case -1073633483: goto L_0x0055;
                case -1071817359: goto L_0x0058;
                case -1050893613: goto L_0x0069;
                case -1004732798: goto L_0x006c;
                case -366307023: goto L_0x006f;
                case 904647503: goto L_0x0072;
                case 1993842850: goto L_0x0083;
                default: goto L_0x002a;
            }
        L_0x002a:
            r3 = 2131232458(0x7f0806ca, float:1.8081026E38)
            if (r7 == 0) goto L_0x0032
            r3 = 2131232459(0x7f0806cb, float:1.8081028E38)
        L_0x0032:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x0098
        L_0x0038:
            java.lang.String r0 = X.C25291Nq.A03(r5)
            java.lang.String r2 = X.C108955ca.A0y(r0)
            goto L_0x0012
        L_0x0041:
            java.lang.String r0 = "application/pdf"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r3 = 2131232454(0x7f0806c6, float:1.8081018E38)
            if (r7 == 0) goto L_0x0038
            r3 = 2131232455(0x7f0806c7, float:1.808102E38)
            goto L_0x0038
        L_0x0052:
            java.lang.String r0 = "application/rtf"
            goto L_0x0074
        L_0x0055:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            goto L_0x005a
        L_0x0058:
            java.lang.String r0 = "application/vnd.ms-powerpoint"
        L_0x005a:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232456(0x7f0806c8, float:1.8081022E38)
            if (r7 == 0) goto L_0x0093
            r0 = 2131232457(0x7f0806c9, float:1.8081024E38)
            goto L_0x0093
        L_0x0069:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            goto L_0x0074
        L_0x006c:
            java.lang.String r0 = "text/rtf"
            goto L_0x0074
        L_0x006f:
            java.lang.String r0 = "application/vnd.ms-excel"
            goto L_0x0085
        L_0x0072:
            java.lang.String r0 = "application/msword"
        L_0x0074:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131231906(0x7f0804a2, float:1.8079906E38)
            if (r7 == 0) goto L_0x0093
            r0 = 2131232453(0x7f0806c5, float:1.8081016E38)
            goto L_0x0093
        L_0x0083:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
        L_0x0085:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 2131232460(0x7f0806cc, float:1.808103E38)
            if (r7 == 0) goto L_0x0093
            r0 = 2131232461(0x7f0806cd, float:1.8081032E38)
        L_0x0093:
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r4, r0)
            return r0
        L_0x0098:
            java.lang.String r2 = X.C108955ca.A0y(r6)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137486vX.A01(android.content.Context, java.lang.String, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }
}
