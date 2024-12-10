package X;

/* renamed from: X.7Go  reason: invalid class name and case insensitive filesystem */
public class C144247Go implements C160998Ax {
    public final int A00;
    public final C160998Ax A01;
    public final C160998Ax A02;

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1L(objArr, this.A00);
        objArr[1] = this.A01;
        return AnonymousClass000.A0P(this.A02, objArr, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        if (r0 == false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BeY(X.C132366mf r5) {
        /*
            r4 = this;
            int r3 = r4.A00
            r2 = 0
            X.8Ax r1 = r4.A02
            X.C17960vV.A07(r1)
            X.8Ax r0 = r4.A01
            boolean r0 = r0.BeY(r5)
            if (r3 == 0) goto L_0x001a
            if (r0 != 0) goto L_0x0018
        L_0x0012:
            boolean r0 = r1.BeY(r5)
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            return r2
        L_0x001a:
            if (r0 == 0) goto L_0x0019
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144247Go.BeY(X.6mf):boolean");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C144247Go)) {
            return false;
        }
        C144247Go r4 = (C144247Go) obj;
        if (this.A00 != r4.A00 || !this.A01.equals(r4.A01) || !this.A02.equals(r4.A02)) {
            return false;
        }
        return true;
    }

    public C144247Go(C160998Ax r1, C160998Ax r2, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }
}
