package X;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0aI  reason: invalid class name and case insensitive filesystem */
public final class C07060aI implements ThreadFactory {
    public final AtomicInteger A00 = new AtomicInteger(0);
    public final /* synthetic */ boolean A01;

    public Thread newThread(Runnable runnable) {
        String str;
        C18070vi.A0d(runnable, 0);
        if (this.A01) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(this.A00.incrementAndGet());
        return new Thread(runnable, A11.toString());
    }

    public C07060aI(boolean z) {
        this.A01 = z;
    }
}
