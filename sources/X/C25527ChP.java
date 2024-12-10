package X;

import java.nio.ByteBuffer;

/* renamed from: X.ChP  reason: case insensitive filesystem */
public final class C25527ChP {
    public ByteBuffer A00;
    public final int A01;

    public C25527ChP(int i, ByteBuffer byteBuffer) {
        this.A01 = i;
        if (byteBuffer.isDirect()) {
            this.A00 = byteBuffer;
            return;
        }
        throw AnonymousClass000.A0n("Bytes buffer must be direct");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25527ChP(int r2, byte... r3) {
        /*
            r1 = this;
            r0 = 2
            X.C18070vi.A0d(r3, r0)
            int r0 = r3.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r0.put(r3)
            r0.flip()
            r1.<init>((int) r2, (java.nio.ByteBuffer) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25527ChP.<init>(int, byte[]):void");
    }
}
