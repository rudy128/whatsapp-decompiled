package X;

import com.whatsapp.util.Log;

/* renamed from: X.6oc  reason: invalid class name and case insensitive filesystem */
public abstract class C133356oc {
    public final AnonymousClass1E7 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (android.text.TextUtils.equals(r2.A0a, r6.A0a) == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.AnonymousClass1E7 r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C116845yi
            if (r0 == 0) goto L_0x0029
            X.1E7 r2 = r5.A00
            java.lang.String r1 = r2.A0Z
            java.lang.String r0 = r6.A0Z
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r1 = r2.A0a
            java.lang.String r0 = r6.A0a
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r4 = 0
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r4 = 1
        L_0x001c:
            java.lang.String r0 = r2.A0Z
            r6.A0Z = r0
            long r0 = r2.A0F
            r6.A0F = r0
            java.lang.String r0 = r2.A0a
            r6.A0a = r0
            return r4
        L_0x0029:
            X.1E7 r3 = r5.A00
            boolean r0 = r3.A0g
            r6.A0g = r0
            int r2 = r3.A07
            if (r2 <= 0) goto L_0x0037
            int r0 = r6.A07
            if (r0 != r2) goto L_0x0057
        L_0x0037:
            int r1 = r3.A08
            if (r1 <= 0) goto L_0x003f
            int r0 = r6.A08
            if (r0 != r1) goto L_0x0057
        L_0x003f:
            if (r2 != 0) goto L_0x0045
            int r0 = r6.A07
            if (r0 != 0) goto L_0x0057
        L_0x0045:
            if (r1 != 0) goto L_0x004b
            int r0 = r6.A08
            if (r0 != 0) goto L_0x0057
        L_0x004b:
            if (r2 >= 0) goto L_0x0051
            int r0 = r6.A07
            if (r0 > 0) goto L_0x0057
        L_0x0051:
            if (r1 >= 0) goto L_0x0063
            int r0 = r6.A08
            if (r0 <= 0) goto L_0x0063
        L_0x0057:
            r4 = 1
        L_0x0058:
            r6.A07 = r2
            int r0 = r3.A08
            r6.A08 = r0
            long r0 = r3.A0E
            r6.A0E = r0
            return r4
        L_0x0063:
            r4 = 0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133356oc.A00(X.1E7):boolean");
    }

    public final boolean A01(AnonymousClass1E7 r5) {
        AnonymousClass1E7 r0 = this.A00;
        if (r5 == r0) {
            return true;
        }
        AnonymousClass1BI r2 = r0.A0J;
        if (r2 == null) {
            Log.e("wacontact/updatecontact/invalid");
            return false;
        } else if (!r2.equals(r5.A0J) || !A00(r5)) {
            return false;
        } else {
            return true;
        }
    }

    public C133356oc(AnonymousClass1E7 r1) {
        this.A00 = r1;
    }
}
