package X;

/* renamed from: X.9mJ  reason: invalid class name and case insensitive filesystem */
public class C191279mJ {
    public final String A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C191279mJ(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.A03 = bArr;
        this.A00 = str;
        this.A04 = bArr2;
        this.A02 = bArr3;
        this.A01 = bArr4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupCipher [cipherVersion=");
        C17890vO.A1C(A10, this.A03);
        A10.append(" keyVersion=");
        A10.append(this.A00);
        A10.append(", serverSalt=");
        C17890vO.A1C(A10, this.A04);
        A10.append(", googleIdSalt=");
        C17890vO.A1C(A10, this.A02);
        A10.append(", encryptionIv=");
        C17890vO.A1C(A10, this.A01);
        return AnonymousClass000.A0z(A10);
    }
}
