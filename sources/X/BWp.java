package X;

import java.nio.ByteBuffer;

public final class BWp extends C3Y {
    public final long A00;
    public final ByteBuffer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BWp) {
                BWp bWp = (BWp) obj;
                if (!C18070vi.A18(this.A01, bWp.A01) || this.A00 != bWp.A00) {
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

    public BWp(ByteBuffer byteBuffer, long j) {
        this.A01 = byteBuffer;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AudioFrame(data=");
        A10.append(this.A01);
        A10.append(", presentationTimeUs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
