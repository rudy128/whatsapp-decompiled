package X;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DGr  reason: case insensitive filesystem */
public class C26860DGr implements C28594E9k {
    public int A00;
    public long A01;
    public C26872DHd A02;

    public void release() {
    }

    public C26861DGs BY2() {
        throw AnonymousClass000.A0k("Not applicable for this consumer");
    }

    public void CCf(ByteBuffer byteBuffer) {
        C26872DHd dHd = this.A02;
        DH2 A002 = dHd.A0B.A00.A00(5000);
        if (A002 != null) {
            ByteBuffer BNu = A002.BNu();
            C26159CtX.A01(BNu);
            BNu.put(byteBuffer);
            A002.CI8(byteBuffer.position(), TimeUnit.NANOSECONDS.toMicros((this.A01 * TimeUnit.SECONDS.toNanos(1)) / 44100), 1);
            dHd.A0B.A00.A03(A002);
            this.A01 += (long) (byteBuffer.position() / this.A00);
        }
    }

    public boolean CNN() {
        return this.A02.CNM();
    }

    public void CRz() {
        this.A02.CRz();
    }

    public void flush() {
        this.A02.flush();
    }
}
