package X;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: X.Dap  reason: case insensitive filesystem */
public class C27263Dap extends URLStreamHandler {
    public byte[] A00;

    public URLConnection openConnection(URL url) {
        return new C27262Dao(url, this.A00);
    }
}
