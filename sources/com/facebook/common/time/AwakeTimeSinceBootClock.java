package com.facebook.common.time;

import X.C24548C8t;
import X.C28656ECq;

public class AwakeTimeSinceBootClock implements C28656ECq {
    public static final AwakeTimeSinceBootClock INSTANCE = new Object();

    public /* synthetic */ long now() {
        return C24548C8t.$default$now(this);
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
