package X;

import java.nio.ByteBuffer;

/* renamed from: X.BWh  reason: case insensitive filesystem */
public final class C22939BWh extends C3Y {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22939BWh) && C18070vi.A18(this.A00, ((C22939BWh) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C22939BWh(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EngagementStatusRequest(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
