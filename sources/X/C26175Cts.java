package X;

import android.os.SystemClock;
import android.util.Log;
import java.util.List;

/* renamed from: X.Cts  reason: case insensitive filesystem */
public abstract class C26175Cts {
    public static int A00;
    public static final C25132CZh A01 = new C25132CZh();

    public static void A00(Exception exc) {
        A01(exc, 4, 0);
        if (C24670CEk.A00) {
            C26078Crs.A00(C27082DTh.A00(exc, 29));
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.CT6, java.lang.Object] */
    public static void A01(Object obj, int i, int i2) {
        long elapsedRealtime;
        CT6 ct6;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        List list = A01.A00;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            C28611EAf eAf = (C28611EAf) list.get(i3);
            BG1 BUB = eAf.BUB();
            CNK BOp = eAf.BOp();
            if (BOp != null) {
                elapsedRealtime = BOp.A00.now();
            } else {
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
            int i4 = A00;
            synchronized (CT6.A08) {
                CT6 ct62 = CT6.A07;
                if (ct62 != null) {
                    CT6.A07 = ct62.A00;
                    ct62.A00 = null;
                    CT6.A06--;
                    ct6 = ct62;
                } else {
                    ? obj2 = new Object();
                    obj2.A00 = null;
                    ct6 = obj2;
                }
                ct6.A04 = eAf;
                ct6.A05 = obj;
                ct6.A02 = elapsedRealtime2;
                ct6.A03 = elapsedRealtime;
                ct6.A01 = i4;
            }
            BUB.obtainMessage(i, i2, 0, ct6).sendToTarget();
        }
    }

    public static void A02(String str, String str2) {
        A01(AnonymousClass001.A1H(": ", str2, AnonymousClass000.A11(str)), 3, 0);
        if (C24670CEk.A00) {
            Log.e(str, str2);
        }
    }

    public static void A03(String str, String str2) {
        A01(AnonymousClass001.A1H(": ", str2, AnonymousClass000.A11(str)), 2, 0);
        if (C24670CEk.A00) {
            Log.w(str, str2);
        }
    }
}
