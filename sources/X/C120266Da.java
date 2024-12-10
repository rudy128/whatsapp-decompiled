package X;

/* renamed from: X.6Da  reason: invalid class name and case insensitive filesystem */
public final class C120266Da extends AnonymousClass6SO {
    public final int code;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C120266Da) && this.code == ((C120266Da) obj).code);
    }

    public int hashCode() {
        return this.code;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C120266Da(int r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown error code ("
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r3)
            r2.<init>(r0)
            r2.code = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120266Da.<init>(int):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnknownErrorCode(code=");
        return AnonymousClass001.A1L(A10, this.code);
    }
}
