package X;

import android.util.Log;

/* renamed from: X.8Kl  reason: invalid class name and case insensitive filesystem */
public class C162368Kl extends C223019j {
    public final ThreadLocal A00 = new ThreadLocal();
    public final ThreadLocal A01 = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.19z, java.lang.Object] */
    public /* bridge */ /* synthetic */ C224519z A01() {
        return new Object();
    }

    public /* bridge */ /* synthetic */ boolean A02(C224519z r7) {
        C162328Kh r72 = (C162328Kh) r7;
        if (r72 != null) {
            try {
                ThreadLocal threadLocal = this.A01;
                AnonymousClass1A1 r2 = (AnonymousClass1A1) threadLocal.get();
                if (r2 == null) {
                    r2 = new AnonymousClass1A1("/proc/self/stat");
                    threadLocal.set(r2);
                }
                r2.A04();
                if (!r2.A02) {
                    return false;
                }
                int i = 0;
                do {
                    r2.A06();
                    i++;
                } while (i < 13);
                r72.userTimeS = A00(r2);
                r72.systemTimeS = A00(r2);
                r72.childUserTimeS = A00(r2);
                r72.childSystemTimeS = A00(r2);
                ThreadLocal threadLocal2 = this.A00;
                if (threadLocal2.get() == null) {
                    threadLocal2.set(new Object());
                }
                C162328Kh r4 = (C162328Kh) threadLocal2.get();
                if (Double.compare(r72.userTimeS, r4.userTimeS) < 0 || Double.compare(r72.systemTimeS, r4.systemTimeS) < 0 || Double.compare(r72.childUserTimeS, r4.childUserTimeS) < 0 || Double.compare(r72.childSystemTimeS, r4.childSystemTimeS) < 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Cpu Time Decreased from ");
                    A10.append(r4);
                    Log.e("CpuMetricsCollector", AnonymousClass001.A1E(r72, " to ", A10), (Throwable) null);
                    return false;
                }
                r4.A01(r72);
                return true;
            } catch (C223219l e) {
                Log.e("CpuMetricsCollector", "Unable to parse CPU time field", e);
                return false;
            }
        } else {
            throw AnonymousClass000.A0k("Null value passed to getSnapshot!");
        }
    }

    public static double A00(AnonymousClass1A1 r6) {
        double A02 = (((double) r6.A02()) * 1.0d) / ((double) AnonymousClass9T2.A00);
        r6.A06();
        return A02;
    }
}
