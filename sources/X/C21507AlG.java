package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AlG  reason: case insensitive filesystem */
public class C21507AlG implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(1);

    public Thread newThread(Runnable runnable) {
        C21457AkO akO = new C21457AkO((Object) runnable, 30);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Google Drive Checksum Calculation Worker #");
        return new C201010v(akO, C17880vN.A0t(A10, this.A00.getAndIncrement()));
    }
}
