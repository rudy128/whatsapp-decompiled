package X;

public class CWK {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public CWK(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (bArr != null) {
            bArr2 = (byte[]) bArr.clone();
        } else {
            bArr2 = null;
        }
        this.A02 = bArr2;
        this.A01 = i;
        this.A00 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WtWriteParams{offset=");
        A10.append(this.A01);
        A10.append(", len=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
