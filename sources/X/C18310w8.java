package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0w8  reason: invalid class name and case insensitive filesystem */
public enum C18310w8 implements Executor {
    ;
    
    public static final Handler A00 = null;

    /* access modifiers changed from: public */
    static {
        A00 = new Handler(Looper.getMainLooper());
    }

    /* access modifiers changed from: public */
    C18310w8() {
    }

    public void execute(Runnable runnable) {
        A00.post(runnable);
    }
}
