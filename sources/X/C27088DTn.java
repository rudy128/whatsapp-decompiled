package X;

import java.lang.Thread;

/* renamed from: X.DTn  reason: case insensitive filesystem */
public final class C27088DTn implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread thread, Throwable th) {
        C18070vi.A0h(thread, th);
        new IllegalStateException(th);
    }
}
