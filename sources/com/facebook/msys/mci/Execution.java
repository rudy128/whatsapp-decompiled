package com.facebook.msys.mci;

import X.AnonymousClass1CH;
import X.AnonymousClass1EV;
import X.AnonymousClass1EX;
import X.AnonymousClass1HP;
import X.AnonymousClass3C7;
import X.C70553Bn;
import android.os.Looper;
import android.os.Trace;
import com.facebook.simplejni.NativeHolder;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class Execution {
    public static final int INVALID_THREAD_PRIORITY = Integer.MIN_VALUE;
    public static volatile boolean sInitialized;
    public static final ConcurrentHashMap sThreadIds = new AnonymousClass1EV();
    public static final ThreadLocal sThreadLocalExecutionContext = new AnonymousClass1EX();
    public static final AtomicInteger sThreadPriority = new AtomicInteger(Integer.MIN_VALUE);
    public static final ConcurrentHashMap sThreadPriorityMap = new ConcurrentHashMap();
    public static Executor sUiThreadSchedulingExecutor;

    public static void executeAfter(C70553Bn r1, int i, long j) {
        executeAfterWithPriority(r1, i, 0, j);
    }

    public static void executeAfterWithPriority(C70553Bn r5, int i, int i2, long j) {
        C70553Bn r2 = r5;
        assertInitialized(r5.toString());
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        if (sUiThreadSchedulingExecutor == null || Looper.myLooper() != Looper.getMainLooper()) {
            executeAfterWithPriorityInternal(r5, i3, i4, j);
        } else {
            sUiThreadSchedulingExecutor.execute(new AnonymousClass3C7(r2, i3, i4, 0, j2));
        }
    }

    public static void executeAfterWithPriorityInternal(C70553Bn r6, int i, int i2, long j) {
        if (!nativeScheduleTask(r6, i, i2, ((double) j) / 1000.0d, r6.toString())) {
            StringBuilder sb = new StringBuilder();
            sb.append("UNKNOWN execution context ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    public static void executeAsync(C70553Bn r1, int i) {
        executeAsyncWithPriority(r1, i, 0);
    }

    public static boolean isMCPEnabledForExecution() {
        return false;
    }

    public static native int nativeGetExecutionContext();

    public static native void nativeInitialize();

    public static native void nativeResetExecutorsTestingOnly();

    public static native boolean nativeScheduleTask(Runnable runnable, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(int i);

    public static native void setLoggingThresholds(double d, double d2);

    public static void assertInitialized(String str) {
        if (!sInitialized) {
            StringBuilder sb = new StringBuilder();
            sb.append("Execution was called by ");
            sb.append(str);
            sb.append(" but was not initialized before being used");
            throw new RuntimeException(sb.toString());
        }
    }

    public static int getExecutionContext() {
        if (sInitialized) {
            return ((Number) sThreadLocalExecutionContext.get()).intValue();
        }
        return 0;
    }

    public static int getThreadPriority(int i) {
        AbstractCollection abstractCollection = (AbstractCollection) sThreadIds.get(Integer.valueOf(i));
        if (abstractCollection == null) {
            return Integer.MIN_VALUE;
        }
        abstractCollection.isEmpty();
        return Integer.MIN_VALUE;
    }

    public static synchronized boolean initialize(Executor executor) {
        synchronized (Execution.class) {
            Method method = AnonymousClass1CH.A03;
            Trace.beginSection("Execution.initialize");
            try {
                if (sInitialized) {
                    Trace.endSection();
                    return false;
                }
                sUiThreadSchedulingExecutor = executor;
                nativeInitialize();
                synchronized (TaskTracker.class) {
                    int i = 0;
                    if (!TaskTracker.sInitialized) {
                        TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DATABASE, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_UTILITY, TaskTracker.TRACKER_CRYPTO, TaskTracker.TRACKER_DATABASE_READ_ONLY};
                        int[] iArr = new int[6];
                        String[] strArr = new String[6];
                        int i2 = 0;
                        do {
                            TaskTracker taskTracker = taskTrackerArr[i2];
                            iArr[i2] = taskTracker.mExecutionContext;
                            strArr[i2] = taskTracker.mQueueName;
                            i2++;
                        } while (i2 < 6);
                        NativeHolder[] initNativeHolders = TaskTracker.initNativeHolders(iArr, strArr);
                        do {
                            taskTrackerArr[i].mNativeHolder = initNativeHolders[i];
                            i++;
                        } while (i < 6);
                        TaskTracker.sInitialized = true;
                    }
                }
                sInitialized = true;
                Trace.endSection();
                return true;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public static void resetExecutorsForTestingOnly() {
        for (AbstractCollection clear : sThreadIds.values()) {
            clear.clear();
        }
        sThreadPriorityMap.clear();
        nativeResetExecutorsTestingOnly();
    }

    public static boolean setInitializedForTestingOnly(boolean z) {
        boolean z2 = sInitialized;
        sInitialized = z;
        return z2;
    }

    public static void setThreadPriorities(Map map) {
        sThreadPriorityMap.clear();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                setThreadPriority(((Number) entry.getKey()).intValue(), (Integer) entry.getValue());
            }
        }
    }

    public static void setThreadPriority(int i, Integer num) {
        ConcurrentHashMap concurrentHashMap = sThreadPriorityMap;
        Integer valueOf = Integer.valueOf(i);
        concurrentHashMap.put(valueOf, num);
        AbstractCollection abstractCollection = (AbstractCollection) sThreadIds.get(valueOf);
        if (abstractCollection != null) {
            abstractCollection.isEmpty();
        }
    }

    public static Executor setUiThreadSchedulingExecutorForTestingOnly(Executor executor) {
        Executor executor2 = sUiThreadSchedulingExecutor;
        sUiThreadSchedulingExecutor = executor;
        return executor2;
    }

    public static void startExecutorThread(int i, String str) {
        AnonymousClass1HP r2 = new AnonymousClass1HP(i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Context");
        new Thread(r2, sb.toString()).start();
    }

    public static boolean callingThreadMatchesExecutionContext(int i) {
        if (getExecutionContext() == i) {
            return true;
        }
        return false;
    }

    public static void ensureNotOnDatabaseThread() {
        if (getExecutionContext() == 2) {
            throw new IllegalStateException("The task can not run on Database thread");
        }
    }

    public static void ensureNotOnMsysThread() {
        if (isOnMsysThread()) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
    }

    public static void executeAsyncWithPriority(C70553Bn r2, int i, int i2) {
        assertInitialized(r2.toString());
        executeAfterWithPriority(r2, i, i2, 0);
    }

    public static void executePossiblySync(C70553Bn r1, int i) {
        assertInitialized(r1.toString());
        if (callingThreadMatchesExecutionContext(i)) {
            r1.run();
        } else {
            executeAsyncWithPriority(r1, i, 0);
        }
    }

    public static boolean isOnMsysMainContext() {
        if (getExecutionContext() != 1) {
            return false;
        }
        return true;
    }

    public static boolean isOnMsysThread() {
        if (getExecutionContext() != 0) {
            return true;
        }
        return false;
    }

    public static synchronized boolean initialize() {
        boolean initialize;
        synchronized (Execution.class) {
            initialize = initialize((Executor) null);
        }
        return initialize;
    }

    public static void setThreadPriorities(Integer num) {
        sThreadPriority.set(num.intValue());
    }
}
