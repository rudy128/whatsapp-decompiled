package X;

/* renamed from: X.DYo  reason: case insensitive filesystem */
public class C27190DYo implements E3O {
    public byte[] A00;

    public C27190DYo(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C27190DYo(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.A00 = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
