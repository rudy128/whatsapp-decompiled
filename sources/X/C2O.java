package X;

public abstract class C2O extends Exception {
    public final CharSequence errorMessage;
    public final String type;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2O(java.lang.String r2, java.lang.CharSequence r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x000e
            java.lang.String r0 = r3.toString()
        L_0x0006:
            r1.<init>(r0)
            r1.type = r2
            r1.errorMessage = r3
            return
        L_0x000e:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2O.<init>(java.lang.String, java.lang.CharSequence):void");
    }

    public static AnonymousClass8EQ A00(C24742CIe cIe, CharSequence charSequence) {
        return new AnonymousClass8EQ(cIe, charSequence);
    }
}
