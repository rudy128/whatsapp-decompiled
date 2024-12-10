package X;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: X.Dao  reason: case insensitive filesystem */
public class C27262Dao extends URLConnection {
    public byte[] A00;

    public void connect() {
    }

    public InputStream getInputStream() {
        return BE6.A0h(this.A00);
    }

    public C27262Dao(URL url, byte[] bArr) {
        super(url);
        this.A00 = bArr;
    }
}
