package X;

import java.io.Closeable;

public abstract class CDX {
    public static final void A00(Closeable closeable, Throwable th) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                C25359CeJ.A01(th, th2);
            }
        }
    }
}
