package X;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.Crp  reason: case insensitive filesystem */
public final class C26075Crp {
    public static final Logger A00 = BE7.A0w(C26075Crp.class);

    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                A00.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
            }
        }
    }

    public static void A01(InputStream inputStream) {
        try {
            A00(inputStream);
        } catch (IOException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }
}
