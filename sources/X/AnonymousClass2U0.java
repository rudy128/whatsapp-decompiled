package X;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/* renamed from: X.2U0  reason: invalid class name */
public abstract class AnonymousClass2U0 {
    public static void A00(Socket socket, int i, int i2, int i3) {
        try {
            Os.setsockoptInt(((FileInputStream) socket.getInputStream()).getFD(), i, i2, i3);
        } catch (ErrnoException e) {
            throw new IOException(e.getMessage(), e);
        }
    }
}
