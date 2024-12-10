package X;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.10J  reason: invalid class name */
public class AnonymousClass10J implements AnonymousClass10I {
    public static AnonymousClass190 A04;
    public static AnonymousClass10P A05;
    public static final AnonymousClass10M A06;
    public static final Executor A07 = new AnonymousClass10L();
    public static final ThreadPoolExecutor A08;
    public static final BlockingQueue A09;
    public Handler A00;
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();
    public final Set A03 = new HashSet();

    public C71353Ey BHn(String str, int i, boolean z) {
        C71353Ey r3 = new C71353Ey(this, new DW3(str, 2), i);
        if (Build.VERSION.SDK_INT < 23) {
            r3.setKeepAliveTime(10, TimeUnit.MILLISECONDS);
        }
        r3.allowCoreThreadTimeOut(z);
        return r3;
    }

    public C49302Py BHv(String str, BlockingQueue blockingQueue, int i, int i2, int i3, long j) {
        BlockingQueue blockingQueue2 = blockingQueue;
        C49302Py r1 = new C49302Py(this, blockingQueue2, new AnonymousClass10O(i3, str), TimeUnit.SECONDS, i, i2, j, true);
        A06.A00(r1);
        return r1;
    }

    public synchronized void CEz(Runnable runnable) {
        Boolean bool = C17960vV.A01;
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    public synchronized C448825d CGv(Runnable runnable, long j) {
        C448825d r0;
        Boolean bool = C17960vV.A01;
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("WhatsApp Worker Scheduler", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        r0 = new C448825d(this, runnable, 16);
        handler.postDelayed(r0, j);
        return r0;
    }

    static {
        AnonymousClass10K r3 = new AnonymousClass10K();
        A09 = r3;
        AnonymousClass10M r5 = new AnonymousClass10M();
        A06 = r5;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A05 = new C49292Px(r3, new AnonymousClass10O(10, "WhatsApp Worker"), timeUnit, 0);
        C49292Px r2 = new C49292Px(new SynchronousQueue(), new AnonymousClass10O(0, "High Pri Worker"), timeUnit, 1);
        A08 = r2;
        A05.setRejectedExecutionHandler(new AnonymousClass10Q());
        r5.A00(A05);
        r5.A00(r2);
    }

    public /* bridge */ /* synthetic */ C49302Py BkJ(String str, int i) {
        return new C49302Py(this, new LinkedBlockingQueue(), new AnonymousClass10O(i, str), TimeUnit.SECONDS, 1, 1, 0, false);
    }

    public final void CGD(A34 a34, Object... objArr) {
        Boolean bool = C17960vV.A01;
        a34.A02.executeOnExecutor(A05, objArr);
    }

    public void CGF(Runnable runnable) {
        Boolean bool = C17960vV.A01;
        A05.execute(runnable);
    }

    public void CGL(Runnable runnable, String str) {
        Boolean bool = C17960vV.A01;
        Set set = this.A03;
        synchronized (set) {
            String str2 = str;
            if (set.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("WaWorkers/runIfNotRunning/");
                sb.append(str);
                CGF(new C223619p(this, runnable, sb.toString(), str2, set));
            }
        }
    }

    public final void CGM(A34 a34, Object... objArr) {
        Boolean bool = C17960vV.A01;
        a34.A02.executeOnExecutor(A08, objArr);
    }

    public void CGN(Runnable runnable) {
        Boolean bool = C17960vV.A01;
        A08.execute(runnable);
    }

    public boolean CGO(Runnable runnable, String str) {
        Boolean bool = C17960vV.A01;
        Set set = this.A02;
        synchronized (set) {
            String str2 = str;
            if (!set.add(str)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("WaWorkers/runLatencySensitiveIfNotRunning/");
            sb.append(str);
            CGN(new C223619p(this, runnable, sb.toString(), str2, set));
            return true;
        }
    }

    public void CGS(Runnable runnable, String str) {
        C200710s r1;
        Boolean bool = C17960vV.A01;
        Map map = this.A01;
        synchronized (map) {
            r1 = (C200710s) map.get(str);
            if (r1 == null) {
                r1 = new C200710s(this, false);
                map.put(str, r1);
            }
        }
        r1.execute(runnable);
    }
}
