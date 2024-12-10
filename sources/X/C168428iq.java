package X;

import java.io.IOException;

/* renamed from: X.8iq  reason: invalid class name and case insensitive filesystem */
public final class C168428iq extends C168468iu {
    public final IOException A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C168428iq) && C18070vi.A18(this.A00, ((C168428iq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C168428iq(IOException iOException) {
        this.A00 = iOException;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeliveryFailure(e=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
