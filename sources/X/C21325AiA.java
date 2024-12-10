package X;

import java.io.Closeable;
import java.net.HttpURLConnection;

/* renamed from: X.AiA  reason: case insensitive filesystem */
public class C21325AiA implements Closeable {
    public final HttpURLConnection A00;

    public void close() {
        this.A00.disconnect();
    }

    public C21325AiA(HttpURLConnection httpURLConnection) {
        this.A00 = httpURLConnection;
    }
}
