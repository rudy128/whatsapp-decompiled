package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.1ui  reason: invalid class name and case insensitive filesystem */
public class C40441ui implements Executor {
    public final Handler A00 = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
