package X;

/* renamed from: X.D6y  reason: case insensitive filesystem */
public class C26628D6y implements C40451uj {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Object A03 = null;
    public final C40451uj A04;

    public void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                this.A04.Bw0(this.A01, this.A00);
            } else if (i != 2) {
                this.A04.BoA(this.A03, this.A01, this.A00);
            } else {
                this.A04.C34(this.A01, this.A00);
            }
            this.A03 = null;
            this.A02 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BoA(java.lang.Object r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.A02
            r4 = 3
            if (r0 != r4) goto L_0x0023
            int r1 = r5.A01
            int r0 = r5.A00
            int r3 = r1 + r0
            if (r7 > r3) goto L_0x0023
            int r2 = r7 + r8
            if (r2 < r1) goto L_0x0023
            java.lang.Object r0 = r5.A03
            if (r0 != r6) goto L_0x0023
            int r1 = java.lang.Math.min(r7, r1)
            r5.A01 = r1
            int r0 = java.lang.Math.max(r3, r2)
            int r0 = r0 - r1
            r5.A00 = r0
            return
        L_0x0023:
            r5.A00()
            r5.A01 = r7
            r5.A00 = r8
            r5.A03 = r6
            r5.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26628D6y.BoA(java.lang.Object, int, int):void");
    }

    public void Bw0(int i, int i2) {
        int i3;
        if (this.A02 == 1 && i >= (i3 = this.A01)) {
            int i4 = this.A00;
            if (i <= i3 + i4) {
                this.A00 = i4 + i2;
                this.A01 = Math.min(i, i3);
                return;
            }
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 1;
    }

    public void C34(int i, int i2) {
        int i3;
        if (this.A02 != 2 || (i3 = this.A01) < i || i3 > i + i2) {
            A00();
            this.A01 = i;
            this.A00 = i2;
            this.A02 = 2;
            return;
        }
        this.A00 += i2;
        this.A01 = i;
    }

    public C26628D6y(C40451uj r2) {
        this.A04 = r2;
    }

    public void Byk(int i, int i2) {
        A00();
        this.A04.Byk(i, i2);
    }
}
