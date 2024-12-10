package X;

/* renamed from: X.6pZ  reason: invalid class name */
public class AnonymousClass6pZ {
    public float A00;
    public int A01;
    public int A02 = 2;
    public int A03 = -16777216;
    public int A04;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r2 == 3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r4, int r5) {
        /*
            r3 = this;
            r0 = 3
            if (r5 != r0) goto L_0x0022
            r1 = 1
            r0 = r4
        L_0x0005:
            r3.A01 = r0
            if (r1 == 0) goto L_0x000d
            int r4 = r3.A00()
        L_0x000d:
            r3.A04 = r4
            int r2 = r3.A02
            r1 = 1058642330(0x3f19999a, float:0.6)
            if (r2 == 0) goto L_0x001f
            r0 = 2
            if (r2 == r0) goto L_0x001d
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x001f
        L_0x001d:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x001f:
            r3.A00 = r1
            return
        L_0x0022:
            r1 = 0
            int r0 = r3.A00()
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6pZ.A01(int, int):void");
    }

    public AnonymousClass6pZ() {
        A01(-16777216, 2);
    }

    public int A00() {
        int i = this.A02;
        if (i != 0) {
            if (i != 2 && i != 3) {
                return 0;
            }
            double A012 = AnonymousClass1Z2.A01(this.A03, -1);
            if (A012 >= 3.0d) {
                return -1;
            }
            int i2 = this.A03;
            float f = 0.6f;
            if (A012 == 1.0d) {
                f = 1.0f;
            }
            return AnonymousClass1Z2.A03(f, i2, -16777216);
        } else if (AnonymousClass1Z2.A01(this.A03, -16777216) < 3.0d) {
            return -1;
        } else {
            return -16777216;
        }
    }
}
