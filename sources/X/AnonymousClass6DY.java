package X;

/* renamed from: X.6DY  reason: invalid class name */
public final class AnonymousClass6DY extends AnonymousClass6SO {
    public final Throwable throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DY) && C18070vi.A18(this.throwable, ((AnonymousClass6DY) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6DY(java.lang.Throwable r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Exception caught ("
            java.lang.String r0 = X.C108955ca.A10(r0, r1, r3)
            java.lang.String r0 = X.C17900vP.A0B(r0, r1)
            r2.<init>(r0)
            r2.throwable = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6DY.<init>(java.lang.Throwable):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
