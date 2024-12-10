package X;

import java.lang.Thread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CdW  reason: case insensitive filesystem */
public class C25325CdW {
    public static final ThreadPoolExecutor A00(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, boolean z) {
        int i2 = i;
        int i3 = i;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, C20113A7w.A0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new DW4(str, uncaughtExceptionHandler, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
