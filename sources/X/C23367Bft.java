package X;

/* renamed from: X.Bft  reason: case insensitive filesystem */
public final class C23367Bft extends DSA {
    public final String A00;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r4.A00;
        r0 = ((X.C23367Bft) r5).A00;
        r3 = r0.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r5) {
        /*
            r4 = this;
            X.DSA r5 = (X.DSA) r5
            int r3 = r5.A01()
            r2 = 3
            if (r2 != r3) goto L_0x001e
            X.Bft r5 = (X.C23367Bft) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            int r3 = r0.length()
            int r2 = r1.length()
            if (r2 != r3) goto L_0x001e
            int r2 = r1.compareTo(r0)
            return r2
        L_0x001e:
            int r2 = r2 - r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23367Bft.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C23367Bft) obj).A00);
    }

    public C23367Bft(String str) {
        this.A00 = str;
    }

    public final int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, 3);
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\"");
        return AnonymousClass001.A1H(this.A00, "\"", A10);
    }
}
