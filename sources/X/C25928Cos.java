package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cos  reason: case insensitive filesystem */
public abstract class C25928Cos {
    public static C26014CqV A00;
    public static final long A01 = TimeUnit.MINUTES.toMillis(1);
    public static final Object A02 = C17880vN.A0p();

    public static void A00(Context context) {
        if (A00 == null) {
            C26014CqV cqV = new C26014CqV(context);
            A00 = cqV;
            synchronized (cqV.A08) {
            }
        }
    }

    public static void A01(Intent intent) {
        synchronized (A02) {
            if (A00 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                C26014CqV cqV = A00;
                if (cqV.A02.decrementAndGet() < 0) {
                    BE7.A1K(String.valueOf(cqV.A09), " release without a matched acquire!", "WakeLock");
                }
                synchronized (cqV.A08) {
                    TextUtils.isEmpty((CharSequence) null);
                    Map map = cqV.A0A;
                    if (map.containsKey((Object) null)) {
                        CLN cln = (CLN) map.get((Object) null);
                        if (cln != null) {
                            int i = cln.A00 - 1;
                            cln.A00 = i;
                            if (i == 0) {
                                map.remove((Object) null);
                            }
                        }
                    } else {
                        Log.w("WakeLock", String.valueOf(cqV.A09).concat(" counter does not exist"));
                    }
                    C26014CqV.A00(cqV);
                }
            }
        }
    }
}
