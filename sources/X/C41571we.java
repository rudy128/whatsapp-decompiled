package X;

import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: X.1we  reason: invalid class name and case insensitive filesystem */
public final class C41571we implements Closeable, AnonymousClass1OX {
    public final C18560wh A00;

    public void close() {
        C30551e8.A03((CancellationException) null, this.A00);
    }

    public C41571we(C18560wh r1) {
        this.A00 = r1;
    }

    public C18560wh getCoroutineContext() {
        return this.A00;
    }
}
