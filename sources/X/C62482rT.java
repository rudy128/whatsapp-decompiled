package X;

/* renamed from: X.2rT  reason: invalid class name and case insensitive filesystem */
public final class C62482rT {
    public final int A00;
    public final long A01;
    public final C49512Qt A02;
    public final AnonymousClass1BI A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62482rT(X.AnonymousClass1BI r7) {
        /*
            r6 = this;
            r0 = 1
            r2 = r7
            X.C18070vi.A0d(r7, r0)
            boolean r0 = X.C22971Dz.A0d(r7)
            if (r0 == 0) goto L_0x0015
            X.2Qt r1 = X.C49512Qt.ONE_TO_ONE
        L_0x000d:
            r4 = -1
            r3 = -1
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return
        L_0x0015:
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 == 0) goto L_0x001e
            X.2Qt r1 = X.C49512Qt.GROUP
            goto L_0x000d
        L_0x001e:
            X.2Qt r1 = X.C49512Qt.NONE
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62482rT.<init>(X.1BI):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62482rT) {
                C62482rT r8 = (C62482rT) obj;
                if (!(this.A01 == r8.A01 && C18070vi.A18(this.A03, r8.A03) && this.A02 == r8.A02 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0I(this.A01) * 31)) + this.A00;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Favorite(id=");
        A10.append(this.A01);
        A10.append(", chatJid=");
        A10.append(this.A03);
        A10.append(", type=");
        A10.append(this.A02);
        A10.append(", order=");
        return AnonymousClass001.A1L(A10, this.A00);
    }

    public C62482rT(C49512Qt r1, AnonymousClass1BI r2, int i, long j) {
        this.A01 = j;
        this.A03 = r2;
        this.A02 = r1;
        this.A00 = i;
    }
}
