package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.3BS  reason: invalid class name */
public class AnonymousClass3BS implements Closeable {
    public final C183739Zk A00;
    public final InputStream A01;

    public void close() {
        this.A01.close();
    }

    public AnonymousClass3BS(C183739Zk r1, InputStream inputStream) {
        this.A00 = r1;
        this.A01 = inputStream;
    }
}
