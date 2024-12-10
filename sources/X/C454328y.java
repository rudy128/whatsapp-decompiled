package X;

/* renamed from: X.28y  reason: invalid class name and case insensitive filesystem */
public abstract class C454328y extends AnonymousClass2S6 {
    public int A00;
    public int A01 = 0;
    public String A02;
    public C63012sM[] A03 = null;

    public C454328y(C454328y r7) {
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        C63012sM[] r5 = r7.A03;
        int length = r5.length;
        C63012sM[] r3 = new C63012sM[length];
        for (int i = 0; i < length; i++) {
            r3[i] = new C63012sM(r5[i]);
        }
        this.A03 = r3;
    }

    public void setPathData(C63012sM[] r6) {
        C63012sM[] r4 = this.A03;
        if (!C63382sy.A02(r4, r6)) {
            int length = r6.length;
            C63012sM[] r3 = new C63012sM[length];
            for (int i = 0; i < length; i++) {
                r3[i] = new C63012sM(r6[i]);
            }
            this.A03 = r3;
            return;
        }
        for (int i2 = 0; i2 < r6.length; i2++) {
            r4[i2].A00 = r6[i2].A00;
            for (int i3 = 0; i3 < r6[i2].A01.length; i3++) {
                r4[i2].A01[i3] = r6[i2].A01[i3];
            }
        }
    }

    public C63012sM[] getPathData() {
        return this.A03;
    }

    public String getPathName() {
        return this.A02;
    }

    public C454328y() {
    }
}
