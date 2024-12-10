package X;

import java.io.OutputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

/* renamed from: X.A4f  reason: case insensitive filesystem */
public class C20036A4f {
    public Cipher A00;
    public Cipher A01;
    public Cipher A02;
    public Cipher A03;
    public Cipher A04;
    public Cipher A05;
    public boolean A06;

    public static synchronized void A01(C20036A4f a4f) {
        synchronized (a4f) {
            if (!a4f.A06) {
                a4f.A03 = Cipher.getInstance("AES/GCM/NoPadding");
                a4f.A00 = Cipher.getInstance("AES/GCM/NoPadding");
                a4f.A04 = Cipher.getInstance("AES/GCM/NoPadding");
                a4f.A01 = Cipher.getInstance("AES/GCM/NoPadding");
                a4f.A05 = Cipher.getInstance("AES/GCM/NoPadding");
                a4f.A02 = Cipher.getInstance("AES/GCM/NoPadding");
                a4f.A06 = true;
            }
        }
    }

    public synchronized ZipOutputStream A02(AnonymousClass9JN r3, OutputStream outputStream, byte[] bArr, byte[] bArr2) {
        ZipOutputStream zipOutputStream;
        int ordinal = r3.ordinal();
        if (ordinal == 1) {
            A01(this);
            Cipher cipher = this.A03;
            C17960vV.A07(cipher);
            zipOutputStream = new ZipOutputStream(A00(outputStream, cipher, bArr, bArr2));
        } else if (ordinal == 3) {
            A01(this);
            Cipher cipher2 = this.A04;
            C17960vV.A07(cipher2);
            zipOutputStream = new ZipOutputStream(A00(outputStream, cipher2, bArr, bArr2));
        } else if (ordinal == 4) {
            A01(this);
            Cipher cipher3 = this.A05;
            C17960vV.A07(cipher3);
            zipOutputStream = new ZipOutputStream(A00(outputStream, cipher3, bArr, bArr2));
        } else if (ordinal == 0) {
            zipOutputStream = new ZipOutputStream(outputStream);
        } else {
            throw AnonymousClass8BX.A0V(r3, "unsupported key selector ", AnonymousClass000.A10());
        }
        return zipOutputStream;
    }

    public static CipherOutputStream A00(OutputStream outputStream, Cipher cipher, byte[] bArr, byte[] bArr2) {
        cipher.init(1, AnonymousClass8BS.A0v(bArr), AnonymousClass8BR.A19(bArr2));
        return new CipherOutputStream(outputStream, cipher);
    }
}
