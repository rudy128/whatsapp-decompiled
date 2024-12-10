package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.6lj  reason: invalid class name and case insensitive filesystem */
public final class C131826lj {
    public final C136456tq A00;

    public final AnonymousClass6QZ A00(InputStream inputStream, byte[] bArr) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(1);
        byte[][] bArr2 = new byte[3][];
        bArr2[0] = allocate.array();
        C136456tq r3 = this.A00;
        byte[] bArr3 = r3.A01;
        if (bArr3 != null) {
            bArr2[1] = bArr3;
            bArr2[2] = bArr;
            byte[] A05 = A8G.A05(bArr2);
            byte[] bArr4 = r3.A07;
            byte[] bArr5 = r3.A06;
            byte[] bArr6 = r3.A01;
            if (bArr6 != null) {
                byte[] bArr7 = r3.A00;
                if (bArr7 != null) {
                    byte[] A02 = C26098CsI.A02(bArr4, bArr5, bArr6, bArr7, C137886wB.A01, 1);
                    C18070vi.A0X(A02);
                    return new AnonymousClass6QZ(new ByteArrayInputStream(A05), new C24218BxW(inputStream, A02, bArr));
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        throw AnonymousClass000.A0n("Required value was null.");
    }

    public C131826lj(C136456tq r1) {
        this.A00 = r1;
    }
}
