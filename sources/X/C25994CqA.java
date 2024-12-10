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

/* renamed from: X.CqA  reason: case insensitive filesystem */
public final class C25994CqA {
    public static final Map A0C = C17880vN.A11();
    public ServiceConnection A00;
    public IInterface A01;
    public boolean A02;
    public final Context A03;
    public final Intent A04;
    public final IBinder.DeathRecipient A05 = new C26383Cyj(this);
    public final C25712Cki A06;
    public final Object A07 = C17880vN.A0p();
    public final WeakReference A08;
    public final List A09 = AnonymousClass000.A13();
    public final Set A0A = C17880vN.A12();
    public final AtomicInteger A0B = BE7.A0v();

    public static final void A00(C25994CqA cqA) {
        Set<TaskCompletionSource> set = cqA.A0A;
        for (TaskCompletionSource trySetException : set) {
            trySetException.trySetException(BEA.A0N("com.google.android.finsky.inappreviewservice.InAppReviewService"));
        }
        set.clear();
    }

    public final Handler A01() {
        Handler handler;
        Map map = A0C;
        synchronized (map) {
            if (!map.containsKey("com.google.android.finsky.inappreviewservice.InAppReviewService")) {
                map.put("com.google.android.finsky.inappreviewservice.InAppReviewService", new Handler(BEA.A0L("com.google.android.finsky.inappreviewservice.InAppReviewService", 10)));
            }
            handler = (Handler) map.get("com.google.android.finsky.inappreviewservice.InAppReviewService");
        }
        return handler;
    }

    public C25994CqA(Context context, Intent intent, C25712Cki cki) {
        this.A03 = context;
        this.A06 = cki;
        this.A04 = intent;
        this.A08 = BE8.A0m();
    }
}
