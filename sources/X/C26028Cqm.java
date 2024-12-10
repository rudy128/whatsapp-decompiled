package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cqm  reason: case insensitive filesystem */
public final class C26028Cqm {
    public static final Map A0E = C17880vN.A11();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new C26384Cyk(this);
    public final C25764Cla A06;
    public final C28525E5w A07;
    public final Object A08 = C17880vN.A0p();
    public final String A09;
    public final WeakReference A0A;
    public final List A0B = AnonymousClass000.A13();
    public final Set A0C = C17880vN.A12();
    public final AtomicInteger A0D = BE7.A0v();

    public static final void A00(C26028Cqm cqm) {
        Set<TaskCompletionSource> set = cqm.A0C;
        for (TaskCompletionSource trySetException : set) {
            trySetException.trySetException(BEA.A0N(cqm.A09));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0E;
        synchronized (map) {
            String str = this.A09;
            if (!map.containsKey(str)) {
                map.put(str, new Handler(BEA.A0L(str, 10)));
            }
            handler = (Handler) map.get(str);
        }
        return handler;
    }

    public final void A02(TaskCompletionSource taskCompletionSource) {
        synchronized (this.A08) {
            this.A0C.remove(taskCompletionSource);
        }
        A01().post(new C23533BjP(this, 1));
    }

    public final void A03(TaskCompletionSource taskCompletionSource, C27079DTe dTe) {
        A01().post(new C23535BjR(dTe.a, taskCompletionSource, this, dTe));
    }

    public C26028Cqm(Context context, Intent intent, C25764Cla cla, C28525E5w e5w, String str) {
        this.A03 = context;
        this.A06 = cla;
        this.A09 = str;
        this.A04 = intent;
        this.A07 = e5w;
        this.A0A = BE8.A0m();
    }
}
