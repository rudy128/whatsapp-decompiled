package com.google.android.gms.tasks;

import X.AnonymousClass26x;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class zzu implements Executor {
    public final Handler zza = new AnonymousClass26x(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
