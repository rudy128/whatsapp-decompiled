package X;

import java.security.MessageDigest;

/* renamed from: X.Dat  reason: case insensitive filesystem */
public abstract class C27267Dat extends MessageDigest {
    public int A00;
    public C28599E9q A01;

    public C27267Dat(C28599E9q e9q) {
        super(e9q.BMl());
        this.A01 = e9q;
        this.A00 = e9q.BQf();
    }

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.A00];
        this.A01.BJ6(bArr, 0);
        return bArr;
    }

    public int engineGetDigestLength() {
        return this.A00;
    }

    public void engineReset() {
        this.A01.reset();
    }

    public void engineUpdate(byte b) {
        this.A01.CQK(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.A01.update(bArr, i, i2);
    }
}
