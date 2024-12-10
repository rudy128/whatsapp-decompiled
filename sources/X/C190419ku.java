package X;

import java.util.Arrays;

/* renamed from: X.9ku  reason: invalid class name and case insensitive filesystem */
public final class C190419ku {
    public final C191279mJ A00;
    public final byte[] A01;
    public final byte[] A02;

    public C190419ku(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.A02 = bArr4;
        this.A01 = bArr6;
        this.A00 = new C191279mJ(str, bArr, bArr2, bArr3, bArr5);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupKey [");
        A10.append(this.A00);
        A10.append(", hashedGoogleId=");
        String arrays = Arrays.toString(this.A02);
        C18070vi.A0X(arrays);
        A10.append(arrays);
        A10.append(", cipherKey=");
        String arrays2 = Arrays.toString(this.A01);
        C18070vi.A0X(arrays2);
        A10.append(arrays2);
        return C17890vO.A0c(A10, ']');
    }
}
