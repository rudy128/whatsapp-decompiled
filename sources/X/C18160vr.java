package X;

import android.os.Looper;
import android.os.Process;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vr  reason: invalid class name and case insensitive filesystem */
public class C18160vr extends Thread {
    public static final Runnable A06 = new C449325i(1);
    public static final String A07;
    public AnonymousClass190 A00;
    public final BlockingQueue A01 = new ArrayBlockingQueue(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, true);
    public final C18180vt A02 = new C18180vt(20, 20);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicInteger A05 = new AtomicInteger(0);

    public static void A00(C18160vr r7) {
        AnonymousClass190 r2;
        Object obj = null;
        do {
            try {
                obj = r7.A01.take();
                continue;
            } catch (InterruptedException unused) {
            }
        } while (obj == null);
        if (obj instanceof String) {
            Log.doLogToFile((String) obj);
        } else if (obj instanceof FutureTask) {
            ((FutureTask) obj).run();
        } else {
            throw new IllegalStateException("Invalid log item type");
        }
        AtomicBoolean atomicBoolean = r7.A03;
        if (atomicBoolean.get()) {
            if (r7.A04.compareAndSet(true, false)) {
                Log.blockingLog(2, "==========log/emptyingqueue/start==========");
            }
            if (r7.A01.isEmpty()) {
                Log.blockingLog(2, "==========log/emptyingqueue/end==========");
                StringBuilder sb = new StringBuilder();
                sb.append("==========log/emptyingqueue/skipped ");
                AtomicInteger atomicInteger = r7.A05;
                sb.append(atomicInteger);
                sb.append(" entries==========");
                Log.blockingLog(2, sb.toString());
                atomicInteger.set(0);
                atomicBoolean.set(false);
                if (r7.A02.A00()) {
                    synchronized (r7) {
                        r2 = r7.A00;
                        if (r2 == null) {
                            throw new NullPointerException();
                        }
                    }
                    r2.A0G("Log/doLogLoop", "Logging queue became full", true);
                }
            }
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("Logger (");
        sb.append(C18170vs.A01());
        sb.append(')');
        A07 = sb.toString();
    }

    public C18160vr() {
        super(A07);
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00(this);
        }
    }

    public static void A01(C18160vr r4, Object obj) {
        Thread currentThread = Thread.currentThread();
        if (currentThread != r4) {
            AtomicBoolean atomicBoolean = r4.A03;
            if (!atomicBoolean.get()) {
                if (r4.A01.offer(obj)) {
                    return;
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    if (currentThread == Looper.getMainLooper().getThread()) {
                        r4.A04.set(true);
                    } else {
                        Log.blockingLog(2, "==========log/emptyingqueue/start==========");
                    }
                }
            }
            r4.A05.incrementAndGet();
            return;
        }
        Log.blockingLog(1, "Cannot add a log item from the logging thread. Attempting to crash.");
        throw new AssertionError("Cannot add a log item from the logging thread.");
    }
}
