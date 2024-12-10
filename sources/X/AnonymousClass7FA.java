package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.7FA  reason: invalid class name */
public class AnonymousClass7FA implements C72133Kt {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7FA(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final InputStream BK5(InputStream inputStream) {
        if (this.A00 != 0) {
            C136476ts r4 = (C136476ts) this.A01;
            byte[] bArr = (byte[]) this.A02;
            C18070vi.A0d(bArr, 1);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(1);
            byte[][] bArr2 = new byte[3][];
            bArr2[0] = allocate.array();
            byte[] bArr3 = r4.A01;
            if (bArr3 != null) {
                bArr2[1] = bArr3;
                bArr2[2] = bArr;
                byte[] A05 = A8G.A05(bArr2);
                byte[] bArr4 = r4.A07;
                byte[] bArr5 = r4.A06;
                byte[] bArr6 = r4.A01;
                if (bArr6 != null) {
                    byte[] bArr7 = r4.A00;
                    if (bArr7 != null) {
                        byte[] A022 = C26098CsI.A02(bArr4, bArr5, bArr6, bArr7, C137906wD.A01, 1);
                        C18070vi.A0X(A022);
                        return new AnonymousClass6QZ(new ByteArrayInputStream(A05), new C24218BxW(inputStream, A022, bArr));
                    }
                    throw AnonymousClass000.A0n("Required value was null.");
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        return new C179219Ha(new C20583AQt(((AnonymousClass7FC) this.A01).A00).BIV((byte[]) this.A02), inputStream);
    }
}
