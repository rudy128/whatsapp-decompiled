package X;

/* renamed from: X.2rQ  reason: invalid class name and case insensitive filesystem */
public final class C62452rQ {
    public static final C62452rQ A03 = new C62452rQ(0, 0, 0);
    public final long A00;
    public final long A01;
    public final long A02;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r6 != 13) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A01(int r6) {
        /*
            r5 = this;
            r0 = 5
            r3 = 0
            if (r6 == r0) goto L_0x000e
            r0 = 8
            if (r6 == r0) goto L_0x001c
            r0 = 13
            if (r6 == r0) goto L_0x0015
        L_0x000d:
            return r3
        L_0x000e:
            long r1 = r5.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            return r1
        L_0x0015:
            long r1 = r5.A02
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            return r1
        L_0x001c:
            long r1 = r5.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x000d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62452rQ.A01(int):long");
    }

    public final int A00() {
        if (this.A01 > 0) {
            return 8;
        }
        if (this.A02 > 0) {
            return 13;
        }
        if (this.A00 > 0) {
            return 5;
        }
        return 4;
    }

    public C62452rQ(long j, long j2, long j3) {
        this.A00 = j;
        this.A02 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append('(');
        A10.append(this.A00);
        A10.append('/');
        A10.append(this.A02);
        A10.append('/');
        return C17900vP.A0E(A10, this.A01);
    }
}
