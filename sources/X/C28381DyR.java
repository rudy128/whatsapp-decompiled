package X;

/* renamed from: X.DyR  reason: case insensitive filesystem */
public class C28381DyR extends C24485C6c {
    public C28599E9q A00;

    public static byte[] A00(C28381DyR dyR) {
        C28599E9q e9q = dyR.A00;
        int BQf = e9q.BQf();
        byte[] bArr = new byte[BQf];
        byte[] bArr2 = dyR.A01;
        e9q.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = dyR.A02;
        e9q.update(bArr3, 0, bArr3.length);
        e9q.BJ6(bArr, 0);
        for (int i = 1; i < dyR.A00; i++) {
            e9q.update(bArr, 0, BQf);
            e9q.BJ6(bArr, 0);
        }
        return bArr;
    }
}
