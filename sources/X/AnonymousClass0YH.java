package X;

/* renamed from: X.0YH  reason: invalid class name */
public class AnonymousClass0YH implements C16930tS {
    public final C16930tS A00;
    public final boolean A01;
    public final float[] A02;

    public C16930tS BOa(int i) {
        return this.A00.BOa(i);
    }

    public int BOk() {
        return this.A00.BOk();
    }

    public Object BTv() {
        return this.A00.BTv();
    }

    public int BW0() {
        return this.A00.BW0();
    }

    public int BW2() {
        return this.A00.BW2();
    }

    public int BW3() {
        return this.A00.BW3();
    }

    public int BW5() {
        return this.A00.BW5();
    }

    public C05050Qf BY6() {
        return this.A00.BY6();
    }

    public int Bbx(int i) {
        return this.A00.Bbx(i);
    }

    public int Bby(int i) {
        return this.A00.Bby(i);
    }

    public int getHeight() {
        int height = this.A00.getHeight();
        float[] fArr = this.A02;
        float f = fArr[0];
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        int round = height + Math.round(f);
        float f2 = fArr[3];
        if (Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return round + Math.round(f2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (java.lang.Float.isNaN(r1) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getWidth() {
        /*
            r5 = this;
            X.0tS r0 = r5.A00
            int r4 = r0.getWidth()
            float[] r3 = r5.A02
            boolean r2 = r5.A01
            if (r2 != 0) goto L_0x0036
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x0036
        L_0x0015:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            if (r2 == 0) goto L_0x002b
            r0 = 5
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0025:
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            return r4
        L_0x002b:
            r0 = 2
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0025
            r1 = 0
            goto L_0x0025
        L_0x0036:
            r0 = 1
            r1 = r3[r0]
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x0015
            r1 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YH.getWidth():int");
    }

    public AnonymousClass0YH(C16930tS r1, float[] fArr, boolean z) {
        this.A00 = r1;
        this.A02 = fArr;
        this.A01 = z;
    }
}
