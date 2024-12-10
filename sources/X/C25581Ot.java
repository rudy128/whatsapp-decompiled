package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ot  reason: invalid class name and case insensitive filesystem */
public class C25581Ot {
    public final ThreadPoolExecutor A00 = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new AnonymousClass3DQ(this));
    public volatile WeakReference A01;

    @Deprecated
    public Future A01(Callable callable) {
        return this.A00.submit(callable);
    }

    public boolean A03() {
        WeakReference weakReference = this.A01;
        if (weakReference == null || Thread.currentThread() != weakReference.get()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public Future A00(Runnable runnable) {
        String A002 = C200810t.A00(runnable);
        ThreadPoolExecutor threadPoolExecutor = this.A00;
        C18070vi.A0d(A002, 0);
        return threadPoolExecutor.submit(runnable);
    }

    @Deprecated
    public void A02(Runnable runnable) {
        String A002 = C200810t.A00(runnable);
        ThreadPoolExecutor threadPoolExecutor = this.A00;
        C18070vi.A0d(A002, 0);
        threadPoolExecutor.execute(runnable);
    }
}
