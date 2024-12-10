package X;

import java.nio.ByteBuffer;

public final class BWo extends C3Y {
    public final ByteBuffer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BWo) && C18070vi.A18(this.A00, ((BWo) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BWo(ByteBuffer byteBuffer) {
        this.A00 = byteBuffer;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoCodec(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
