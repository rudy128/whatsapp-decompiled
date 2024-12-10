package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.Cpw  reason: case insensitive filesystem */
public final class C25983Cpw {
    public static C25983Cpw A04;
    public int A00 = 1;
    public C26341Cxy A01 = new C26341Cxy(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public static final synchronized zzw A01(C25264Cc5 cc5, C25983Cpw cpw) {
        zzw zzw;
        synchronized (cpw) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(cc5.toString()));
            }
            if (!cpw.A01.A03(cc5)) {
                C26341Cxy cxy = new C26341Cxy(cpw);
                cpw.A01 = cxy;
                cxy.A03(cc5);
            }
            zzw = cc5.A03.zza;
        }
        return zzw;
    }

    public final zzw A02(Bundle bundle, int i) {
        int i2;
        synchronized (this) {
            i2 = this.A00;
            this.A00 = i2 + 1;
        }
        return A01(new C25264Cc5(bundle, i2, i), this);
    }

    public static synchronized C25983Cpw A00(Context context) {
        C25983Cpw cpw;
        synchronized (C25983Cpw.class) {
            cpw = A04;
            if (cpw == null) {
                cpw = new C25983Cpw(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C19550yO("MessengerIpcClient"))));
                A04 = cpw;
            }
        }
        return cpw;
    }

    public C25983Cpw(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
