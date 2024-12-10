package X;

/* renamed from: X.9lA  reason: invalid class name and case insensitive filesystem */
public class C190569lA {
    public final int A00;
    public final byte[] A01;
    public final byte[] A02;

    public C190569lA(byte[] bArr, byte[] bArr2, int i) {
        this.A00 = i;
        this.A02 = bArr;
        this.A01 = bArr2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GetCipherKeyResult [code=");
        A10.append(this.A00);
        A10.append(", key=");
        C17890vO.A1C(A10, this.A02);
        A10.append(", accountHash=");
        C17890vO.A1C(A10, this.A01);
        return AnonymousClass000.A0z(A10);
    }
}
