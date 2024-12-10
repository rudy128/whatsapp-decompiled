package X;

import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.net.URL;
import java.util.concurrent.Future;

/* renamed from: X.AiD  reason: case insensitive filesystem */
public class C21328AiD implements Closeable {
    public Task A00;
    public final URL A01;
    public volatile Future A02;

    public void close() {
        this.A02.cancel(true);
    }

    public C21328AiD(URL url) {
        this.A01 = url;
    }
}
