package com.facebook.common.time;

import X.E7V;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class RealtimeSinceBootClock implements E7V {
    public static final RealtimeSinceBootClock A00 = new Object();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
