package X;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0x7  reason: invalid class name and case insensitive filesystem */
public class C18760x7 implements ThreadFactory {
    public static final ThreadFactory A04 = Executors.defaultThreadFactory();
    public final int A00;
    public final StrictMode.ThreadPolicy A01;
    public final String A02;
    public final AtomicLong A03 = new AtomicLong();

    public Thread newThread(Runnable runnable) {
        Thread newThread = A04.newThread(new C448825d(this, runnable, 3));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.A02, Long.valueOf(this.A03.getAndIncrement())}));
        return newThread;
    }

    public C18760x7(StrictMode.ThreadPolicy threadPolicy, String str, int i) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = threadPolicy;
    }
}
