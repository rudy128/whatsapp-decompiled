package X;

/* renamed from: X.Bfl  reason: case insensitive filesystem */
public final class C23359Bfl extends C23360Bfm {
    public final char[] A00;

    public C23359Bfl(C25804CmH cmH) {
        super(cmH, (Character) null);
        char[] cArr = new char[512];
        this.A00 = cArr;
        char[] cArr2 = cmH.A07;
        int i = 0;
        if (cArr2.length != 16) {
            throw BE6.A0j();
        }
        do {
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
            i++;
        } while (i < 256);
    }
}
