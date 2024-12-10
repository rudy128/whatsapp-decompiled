package X;

import java.security.cert.CertificateEncodingException;

/* renamed from: X.Dyq  reason: case insensitive filesystem */
public class C28406Dyq extends C27283DbC {
    public final byte[] encoding;

    public C28406Dyq(String str, C28301Dx9 dx9, C28298Dx6 dx6, E3R e3r, byte[] bArr, byte[] bArr2, boolean[] zArr) {
        super(str, dx9, dx6, e3r, bArr, zArr);
        this.encoding = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.encoding;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
