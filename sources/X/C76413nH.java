package X;

/* renamed from: X.3nH  reason: invalid class name and case insensitive filesystem */
public final class C76413nH extends AnonymousClass4OQ {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76413nH) {
                C76413nH r5 = (C76413nH) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76413nH(int r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0015
            java.lang.String r0 = ""
        L_0x0004:
            X.482 r2 = new X.482
            r2.<init>(r0)
            r1 = 2131103383(0x7f060e97, float:1.781923E38)
            r0 = 0
            r3.<init>(r2, r1, r4, r0)
            r3.A00 = r4
            r3.A01 = r5
            return
        L_0x0015:
            r0 = r5
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76413nH.<init>(int, java.lang.String):void");
    }

    public int hashCode() {
        return (this.A00 * 31) + C17900vP.A00(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupName(numConnected=");
        A10.append(this.A00);
        A10.append(", groupName=");
        return C17900vP.A0B(this.A01, A10);
    }
}
