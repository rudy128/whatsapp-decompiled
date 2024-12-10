package X;

import java.nio.ByteBuffer;

public final class BWm extends C3Y {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BWm) && C18070vi.A18(this.A00, ((BWm) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BWm(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SystemHealth(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
