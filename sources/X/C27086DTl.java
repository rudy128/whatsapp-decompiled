package X;

import android.os.PowerManager;
import android.util.Pair;
import java.io.File;

/* renamed from: X.DTl  reason: case insensitive filesystem */
public abstract class C27086DTl implements Runnable, C107095Yj {
    public final CXH A00;

    public static void A06(AnonymousClass70S r2, AnonymousClass64V r3, File file, int i) {
        r3.A0G = Long.valueOf((long) i);
        r2.A05(file.length());
    }

    public abstract C55362fe A07();

    public synchronized void cancel() {
        C28532E6g e6g;
        CXH cxh = this.A00;
        synchronized (cxh) {
            e6g = cxh.A00;
        }
        if (e6g != null) {
            e6g.cancel();
        }
    }

    public static void A04(PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
    }

    public static void A05(Pair pair, AnonymousClass70S r3) {
        Object obj = pair.second;
        C18070vi.A0W(obj);
        int intValue = ((Number) obj).intValue();
        Object obj2 = pair.first;
        C18070vi.A0W(obj2);
        r3.A04(intValue, ((Number) obj2).intValue());
    }

    public void run() {
        E8E e8e = this.A00.A04;
        e8e.C6O();
        C55362fe A07 = A07();
        C18070vi.A0d(A07, 0);
        e8e.Bud(A07);
    }

    public C27086DTl(CXH cxh) {
        this.A00 = cxh;
    }
}
