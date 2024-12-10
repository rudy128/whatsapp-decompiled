package X;

public final class CSF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Ckw, java.lang.Object] */
    public CSF(byte[] bArr) {
        int length = bArr.length;
        ? obj = new Object();
        obj.A03 = bArr;
        obj.A01 = length;
        obj.A02 = 17;
        obj.A00 = 0;
        C25726Ckw.A00(obj);
        obj.A01(16);
        obj.A01(16);
        obj.A01(24);
        this.A02 = obj.A01(24);
        this.A03 = obj.A01(20);
        this.A01 = obj.A01(3) + 1;
        this.A00 = obj.A01(5) + 1;
        this.A04 = ((((long) obj.A01(4)) & 15) << 32) | BE7.A0C(obj.A01(32));
    }
}
