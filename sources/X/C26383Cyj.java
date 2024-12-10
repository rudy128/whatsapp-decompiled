package X;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* renamed from: X.Cyj  reason: case insensitive filesystem */
public final /* synthetic */ class C26383Cyj implements IBinder.DeathRecipient {
    public final /* synthetic */ C25994CqA A00;

    public /* synthetic */ C26383Cyj(C25994CqA cqA) {
        this.A00 = cqA;
    }

    public final void binderDied() {
        C25994CqA cqA = this.A00;
        C25712Cki cki = cqA.A06;
        cki.A01("reportBinderDeath", new Object[0]);
        cqA.A08.get();
        cki.A01("%s : Binder has died.", BE7.A1b("com.google.android.finsky.inappreviewservice.InAppReviewService"));
        List<DTW> list = cqA.A09;
        for (DTW dtw : list) {
            RemoteException A0N = BEA.A0N("com.google.android.finsky.inappreviewservice.InAppReviewService");
            TaskCompletionSource taskCompletionSource = dtw.A00;
            if (taskCompletionSource != null) {
                taskCompletionSource.trySetException(A0N);
            }
        }
        list.clear();
        synchronized (cqA.A07) {
            C25994CqA.A00(cqA);
        }
    }
}
