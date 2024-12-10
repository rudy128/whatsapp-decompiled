package X;

import java.nio.ByteBuffer;

/* renamed from: X.BWk  reason: case insensitive filesystem */
public final class C22942BWk extends C3Y {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22942BWk) && C18070vi.A18(this.A00, ((C22942BWk) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C22942BWk(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StreamTelemetry(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
