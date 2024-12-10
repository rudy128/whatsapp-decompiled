package X;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: X.Bxd  reason: case insensitive filesystem */
public class C24225Bxd extends OutputStream {
    public Signature A00;

    public void write(byte[] bArr, int i, int i2) {
        try {
            this.A00.update(bArr, i, i2);
        } catch (SignatureException e) {
            throw C17880vN.A0f(e.getMessage());
        }
    }

    public void write(int i) {
        try {
            this.A00.update((byte) i);
        } catch (SignatureException e) {
            throw C17880vN.A0f(e.getMessage());
        }
    }

    public void write(byte[] bArr) {
        try {
            this.A00.update(bArr);
        } catch (SignatureException e) {
            throw C17880vN.A0f(e.getMessage());
        }
    }
}
