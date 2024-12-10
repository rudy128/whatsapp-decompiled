package X;

import java.security.cert.CRLException;

/* renamed from: X.Dyo  reason: case insensitive filesystem */
public class C28404Dyo extends C27279Db8 {
    public final byte[] A00;

    public C28404Dyo(String str, C28305DxD dxD, E3R e3r, byte[] bArr, byte[] bArr2, boolean z) {
        super(str, dxD, e3r, bArr, z);
        this.A00 = bArr2;
    }

    public byte[] getEncoded() {
        byte[] bArr = this.A00;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
