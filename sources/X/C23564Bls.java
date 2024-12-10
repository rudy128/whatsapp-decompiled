package X;

/* renamed from: X.Bls  reason: case insensitive filesystem */
public final class C23564Bls extends C23565Blt {
    public final char[] A00 = new char[512];

    public C23564Bls(C25805CmI cmI) {
        super(cmI, (Character) null);
        char[] cArr = cmI.A07;
        int i = 0;
        C199610h.A07(AnonymousClass000.A1T(cArr.length, 16));
        do {
            char[] cArr2 = this.A00;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
            i++;
        } while (i < 256);
    }
}
