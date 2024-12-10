package X;

import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.19h  reason: invalid class name and case insensitive filesystem */
public class C222819h implements C222419d {
    public final AnonymousClass11P A00;
    public final C222719g A01;

    public boolean BgH() {
        return false;
    }

    public C222819h(AnonymousClass11P r1, C222719g r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BU9() {
        return "cpu_stats";
    }

    public void Bsc(C223419n r9) {
        r9.A03(Integer.valueOf(Process.getThreadPriority(Process.myTid())), "cpu_stats", "stop_pri");
        ConcurrentHashMap concurrentHashMap = r9.A08;
        Serializable serializable = (Serializable) concurrentHashMap.get(new Pair("cpu_stats", "start_ps_cpu_ms"));
        if (serializable != null) {
            try {
                r9.A03(Long.valueOf(Process.getElapsedCpuTime() - ((Number) serializable).longValue()), "cpu_stats", "ps_cpu_ms");
            } catch (RuntimeException unused) {
                Log.e("QPL: CpuMetadataProvider/onEnd processCpuTimeMsStart is not a number");
            }
            concurrentHashMap.remove(new Pair("cpu_stats", "start_ps_cpu_ms"));
        }
        Serializable serializable2 = (Serializable) concurrentHashMap.get(new Pair("cpu_stats", "start_th_cpu_ms"));
        if (serializable2 != null) {
            try {
                r9.A03(Long.valueOf(SystemClock.currentThreadTimeMillis() - ((Number) serializable2).longValue()), "cpu_stats", "th_cpu_ms");
            } catch (RuntimeException unused2) {
                Log.e("QPL: CpuMetadataProvider/onEnd threadCpuTimeMsStart is not a number");
            }
            concurrentHashMap.remove(new Pair("cpu_stats", "start_th_cpu_ms"));
        }
    }

    public void C6D(C223419n r4) {
        r4.A03(Integer.valueOf(Process.getThreadPriority(Process.myTid())), "cpu_stats", "start_pri");
        r4.A03(Long.valueOf(Process.getElapsedCpuTime()), "cpu_stats", "start_ps_cpu_ms");
        r4.A03(Long.valueOf(SystemClock.currentThreadTimeMillis()), "cpu_stats", "start_th_cpu_ms");
    }
}
