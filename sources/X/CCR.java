package X;

import java.io.Closeable;

public abstract class CCR {
    public static final void A00(Closeable closeable) {
        C18070vi.A0d(closeable, 0);
        try {
            closeable.close();
        } catch (Throwable th) {
            new AnonymousClass1IU(th);
        }
    }
}
