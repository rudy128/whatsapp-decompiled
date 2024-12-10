package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.2QP  reason: invalid class name */
public class AnonymousClass2QP extends ByteArrayOutputStream {
    public byte[] toByteArray() {
        int i = this.count;
        byte[] bArr = this.buf;
        if (i == bArr.length) {
            return bArr;
        }
        return super.toByteArray();
    }

    public AnonymousClass2QP(int i) {
        super(i);
    }
}
