package X;

public class DYm implements E3O {
    public E3O A00;
    public byte[] A01;

    public DYm(E3O e3o, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.A01 = bArr2;
        this.A00 = e3o;
        System.arraycopy(bArr, 0, bArr2, 0, length);
    }
}
