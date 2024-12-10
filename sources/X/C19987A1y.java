package X;

import java.security.NoSuchAlgorithmException;

/* renamed from: X.A1y  reason: case insensitive filesystem */
public class C19987A1y {
    public static final byte[] A04 = {78, 111, 105, 115, 101, 95, 88, 88, 102, 97, 108, 108, 98, 97, 99, 107, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54};
    public static final byte[] A05 = {78, 111, 105, 115, 101, 95, 88, 88, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public static final byte[] A06 = {78, 111, 105, 115, 101, 95, 73, 75, 95, 50, 53, 53, 49, 57, 95, 65, 69, 83, 71, 67, 77, 95, 83, 72, 65, 50, 53, 54, 0, 0, 0, 0};
    public long A00;
    public C25714Ckk A01;
    public byte[] A02;
    public final C180649Nj A03;

    public byte[] A02(byte[] bArr) {
        byte[] bArr2 = bArr;
        C25714Ckk ckk = this.A01;
        if (ckk != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = ckk.A01(this.A03.A00, bArr2, bArr.length, j);
        }
        this.A03.A00(bArr2);
        return bArr2;
    }

    public void A00(byte[] bArr) {
        byte[][] A032 = C20058A5h.A03(bArr, this.A02);
        this.A02 = A032[0];
        this.A01 = new C25714Ckk(A032[1]);
        this.A00 = 0;
    }

    public byte[] A01(byte[] bArr) {
        byte[] bArr2;
        C25714Ckk ckk = this.A01;
        if (ckk != null) {
            long j = this.A00;
            this.A00 = 1 + j;
            bArr2 = ckk.A02(this.A03.A00, bArr, j);
        } else {
            bArr2 = bArr;
        }
        this.A03.A00(bArr);
        return bArr2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9Nj, java.lang.Object] */
    public C19987A1y(byte[] bArr, byte[] bArr2) {
        C18070vi.A0d(bArr, 1);
        ? obj = new Object();
        try {
            if (bArr.length > 32) {
                bArr = C108945cZ.A1I().digest(bArr);
                C18070vi.A0X(bArr);
            }
            obj.A00 = bArr;
            this.A03 = obj;
            this.A02 = bArr;
            obj.A00(bArr2);
        } catch (NoSuchAlgorithmException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
