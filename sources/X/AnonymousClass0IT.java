package X;

/* renamed from: X.0IT  reason: invalid class name */
public class AnonymousClass0IT {
    public int A00 = 0;
    public CharSequence A01 = null;
    public CharSequence A02 = null;
    public CharSequence A03 = null;
    public boolean A04 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if ((r2 & 32768) == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C03320Hp A00() {
        /*
            r6 = this;
            java.lang.CharSequence r0 = r6.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008e
            int r2 = r6.A00
            boolean r0 = X.AnonymousClass0DJ.A00(r2)
            if (r0 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x0019
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            r1 = 1
            if (r2 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            java.lang.CharSequence r0 = r6.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002b
            if (r1 != 0) goto L_0x002b
            java.lang.String r0 = "Negative text must be set and non-empty."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x002b:
            java.lang.CharSequence r0 = r6.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "Negative text must not be set if device credential authentication is allowed."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x003c:
            java.lang.CharSequence r1 = r6.A03
            java.lang.CharSequence r2 = r6.A02
            java.lang.CharSequence r3 = r6.A01
            boolean r5 = r6.A04
            int r4 = r6.A00
            X.0Hp r0 = new X.0Hp
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Authenticator combination is unsupported on API "
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r0 = 15
            if (r2 == r0) goto L_0x008b
            r0 = 255(0xff, float:3.57E-43)
            if (r2 == r0) goto L_0x0088
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r2 == r0) goto L_0x0085
            r0 = 32783(0x800f, float:4.5939E-41)
            if (r2 == r0) goto L_0x0082
            r0 = 33023(0x80ff, float:4.6275E-41)
            if (r2 == r0) goto L_0x007f
            java.lang.String r0 = java.lang.String.valueOf(r2)
        L_0x007a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x007f:
            java.lang.String r0 = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL"
            goto L_0x007a
        L_0x0082:
            java.lang.String r0 = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL"
            goto L_0x007a
        L_0x0085:
            java.lang.String r0 = "DEVICE_CREDENTIAL"
            goto L_0x007a
        L_0x0088:
            java.lang.String r0 = "BIOMETRIC_WEAK"
            goto L_0x007a
        L_0x008b:
            java.lang.String r0 = "BIOMETRIC_STRONG"
            goto L_0x007a
        L_0x008e:
            java.lang.String r0 = "Title must be set and non-empty."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IT.A00():X.0Hp");
    }
}
