package com.facebook.common.jniexecutors;

import X.AnonymousClass000;
import X.C24547C8s;
import X.C25608Cio;
import X.C26294Cx6;
import android.util.Log;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;

public class PooledNativeRunnable extends NativeRunnable {
    public static final C25608Cio sPool;

    public PooledNativeRunnable() {
        super((HybridData) null);
    }

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C24547C8s c8s = new C24547C8s();
        if (awakeTimeSinceBootClock != null) {
            sPool = new C25608Cio(c8s, awakeTimeSinceBootClock);
            return;
        }
        throw AnonymousClass000.A0k("Must add a clock to the object pool builder");
    }

    public static PooledNativeRunnable allocate(HybridData hybridData) {
        String str;
        Object nativeRunnable;
        PooledNativeRunnable pooledNativeRunnable;
        C25608Cio cio = sPool;
        synchronized (cio) {
            int i = cio.A00;
            if (i > 0) {
                int i2 = i - 1;
                cio.A00 = i2;
                Object[] objArr = cio.A02;
                nativeRunnable = objArr[i2];
                str = null;
                objArr[i2] = null;
            } else {
                str = null;
                nativeRunnable = new NativeRunnable((HybridData) null);
            }
            pooledNativeRunnable = (PooledNativeRunnable) nativeRunnable;
            pooledNativeRunnable.mNativeExecutor = str;
        }
        pooledNativeRunnable.mHybridData = hybridData;
        return pooledNativeRunnable;
    }

    public void run() {
        try {
            super.run();
        } catch (Exception e) {
            Log.e("PooledNativeRunnable", "run crashed", e);
        }
        C25608Cio cio = sPool;
        synchronized (cio) {
            long now = cio.A06.now();
            int i = cio.A00;
            int i2 = cio.A03;
            if (i < i2 * 2) {
                cio.A01 = now;
            }
            if (now - cio.A01 > 60000) {
                C26294Cx6.A00(C25608Cio.class, "ObjectPool.checkUsage is compacting the pool.");
                int length = cio.A02.length;
                int max = Math.max(length - i2, cio.A05);
                if (max != length) {
                    C25608Cio.A00(cio, max);
                }
            }
            this.mHybridData = null;
            int i3 = cio.A00;
            int i4 = cio.A04;
            if (i3 < i4) {
                int i5 = i3 + 1;
                int length2 = cio.A02.length;
                if (i5 > length2) {
                    C25608Cio.A00(cio, Math.min(i4, length2 + i2));
                }
                Object[] objArr = cio.A02;
                int i6 = cio.A00;
                cio.A00 = i6 + 1;
                objArr[i6] = this;
            }
        }
    }
}
