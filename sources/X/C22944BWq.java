package X;

import java.nio.ByteBuffer;

/* renamed from: X.BWq  reason: case insensitive filesystem */
public final class C22944BWq extends C3Y {
    public final long A00;
    public final ByteBuffer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22944BWq) {
                C22944BWq bWq = (C22944BWq) obj;
                if (!C18070vi.A18(this.A01, bWq.A01) || this.A00 != bWq.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C22944BWq(ByteBuffer byteBuffer, long j) {
        this.A01 = byteBuffer;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoFrame(data=");
        A10.append(this.A01);
        A10.append(", presentationTimeUs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
