package X;

import java.util.regex.Pattern;

/* renamed from: X.2r6  reason: invalid class name and case insensitive filesystem */
public final class C62252r6 {
    public static final Pattern A03 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String A00;
    public final String A01;
    public final String A02;

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A00;
        return AnonymousClass000.A0P(this.A02, objArr, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C62252r6)) {
            return false;
        }
        C62252r6 r4 = (C62252r6) obj;
        if (!this.A02.equals(r4.A02) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r4 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62252r6(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.<init>()
            r4 = r7
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L_0x0044
            java.lang.String r0 = "/topics/"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r0 = "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s."
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.w(r0, r1)
            r0 = 8
            java.lang.String r4 = r7.substring(r0)
            if (r4 == 0) goto L_0x0044
        L_0x0027:
            java.util.regex.Pattern r0 = A03
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0044
            r5.A02 = r4
            r5.A00 = r6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)
            java.lang.String r0 = "!"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r7, r1)
            r5.A01 = r0
            return
        L_0x0044:
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r3] = r4
            java.lang.String r0 = "[a-zA-Z0-9-_.~%]{1,900}"
            r1[r2] = r0
            java.lang.String r0 = "Invalid topic name: %s does not match the allowed format %s."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62252r6.<init>(java.lang.String, java.lang.String):void");
    }
}
