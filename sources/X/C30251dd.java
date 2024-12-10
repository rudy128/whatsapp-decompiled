package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1dd  reason: invalid class name and case insensitive filesystem */
public final class C30251dd implements C24411Kf {
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public static final long A07;
    public final AnonymousClass1MW A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final AnonymousClass11P A02;
    public final C18030ve A03;

    public C30251dd(AnonymousClass11P r2, AnonymousClass1MW r3, C18030ve r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r3, 3);
        this.A02 = r2;
        this.A03 = r4;
        this.A00 = r3;
    }

    public /* synthetic */ void onAppBackgrounded() {
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        A07 = timeUnit.toMillis(30);
        A06 = timeUnit.toMillis(120);
        A05 = timeUnit.toMillis(300);
        A04 = timeUnit.toMillis(5);
    }

    public void BlT() {
        if (C18020vd.A05(C18040vf.A02, this.A03, 10320)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ConcurrentHashMap concurrentHashMap = this.A01;
            synchronized (concurrentHashMap) {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    AnonymousClass1EC r3 = (AnonymousClass1EC) entry.getKey();
                    if (((Number) entry.getValue()).longValue() > elapsedRealtime) {
                        int A0A = this.A00.A0A(r3);
                        if (A0A == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("NoisyGroupNotificationSilencer/cancelAutoSilent non-deterministic cancel silent ");
                            sb.append(r3);
                            Log.w(sb.toString());
                        } else if (A0A < 35) {
                        }
                    }
                    it.remove();
                }
            }
        }
    }
}
