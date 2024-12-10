package X;

/* renamed from: X.Ckk  reason: case insensitive filesystem */
public class C25714Ckk {
    public final byte[] A00;

    public byte[] A01(byte[] bArr, byte[] bArr2, int i, long j) {
        try {
            DZ3 A002 = A00(this, j, true);
            A002.CCd(bArr, 0, bArr.length);
            int BVw = A002.BVw(i);
            byte[] bArr3 = new byte[BVw];
            int CCg = A002.CCg(bArr2, 0, i, bArr3, 0);
            int BJ4 = CCg + A002.BJ4(bArr3, CCg);
            if (BJ4 >= BVw) {
                return bArr3;
            }
            byte[] bArr4 = new byte[BJ4];
            System.arraycopy(bArr3, 0, bArr4, 0, BJ4);
            return bArr4;
        } catch (C28379DyP e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public byte[] A02(byte[] bArr, byte[] bArr2, long j) {
        try {
            DZ3 A002 = A00(this, j, false);
            A002.CCd(bArr, 0, bArr.length);
            int length = bArr2.length;
            int BVw = A002.BVw(length);
            byte[] bArr3 = new byte[BVw];
            int CCg = A002.CCg(bArr2, 0, length, bArr3, 0);
            int BJ4 = CCg + A002.BJ4(bArr3, CCg);
            if (BJ4 >= BVw) {
                return bArr3;
            }
            byte[] bArr4 = new byte[BJ4];
            System.arraycopy(bArr3, 0, bArr4, 0, BJ4);
            return bArr4;
        } catch (C28379DyP e) {
            throw new C30981ep(e, this);
        }
    }

    public static DZ3 A00(C25714Ckk ckk, long j, boolean z) {
        DZ3 dz3 = new DZ3(new DYd());
        byte[] bArr = new byte[12];
        A8G.A02(bArr, 4, j);
        dz3.BdC(new DYm(new C27190DYo(ckk.A00), bArr), z);
        return dz3;
    }

    public C25714Ckk(byte[] bArr) {
        this.A00 = bArr;
    }
}
