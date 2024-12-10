package X;

/* renamed from: X.3nP  reason: invalid class name and case insensitive filesystem */
public final class C76493nP extends C84714Ko {
    public final AnonymousClass1E7 A00;
    public final C24921Me A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76493nP(X.C24921Me r4, X.AnonymousClass1E7 r5) {
        /*
            r3 = this;
            r0 = 1
            r2 = 2131891836(0x7f12167c, float:1.9418403E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            X.AnonymousClass3MX.A1N(r4, r5, r1, r0)
            X.6IR r0 = X.C1402670q.A02(r1, r2)
            r3.<init>(r0)
            r3.A00 = r5
            r3.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76493nP.<init>(X.1Me, X.1E7):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76493nP) {
                C76493nP r5 = (C76493nP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecentlyJoinedUser(contact=");
        A10.append(this.A00);
        A10.append(", contactNames=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
