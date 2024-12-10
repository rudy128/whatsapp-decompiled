package X;

/* renamed from: X.DyT  reason: case insensitive filesystem */
public class C28383DyT extends C24485C6c {
    public C28599E9q A00 = new C28394Dye();

    public static byte[] A00(C28383DyT dyT, int i) {
        C28599E9q e9q = dyT.A00;
        int BQf = e9q.BQf();
        byte[] bArr = new byte[BQf];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            byte[] bArr3 = dyT.A01;
            e9q.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = dyT.A02;
            e9q.update(bArr4, 0, bArr4.length);
            e9q.BJ6(bArr, 0);
            int i3 = i;
            if (i > BQf) {
                i3 = BQf;
            }
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            e9q.reset();
            e9q.update(bArr, 0, BQf);
        }
    }
}
