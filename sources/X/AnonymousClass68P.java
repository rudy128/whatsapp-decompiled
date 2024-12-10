package X;

/* renamed from: X.68P  reason: invalid class name */
public class AnonymousClass68P extends C122836Sc {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass68P(java.lang.String r3, java.lang.Exception r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x0009
            r1 = 2
        L_0x0005:
            r2.<init>(r4, r3, r1)
            return
        L_0x0009:
            boolean r0 = r4 instanceof java.net.SocketTimeoutException
            r1 = 19
            if (r0 == 0) goto L_0x0005
            r1 = 3
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68P.<init>(java.lang.String, java.lang.Exception):void");
    }

    public String toString() {
        return C17900vP.A0C("ConnectionFailureException: ", AnonymousClass000.A10(), this);
    }

    public AnonymousClass68P() {
        super((Exception) null, "no internet connection", 25);
    }
}
