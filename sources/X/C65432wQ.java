package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.2wQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65432wQ implements OnCompleteListener {
    public final /* synthetic */ C19500yJ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ ScheduledFuture A02;

    public /* synthetic */ C65432wQ(C19500yJ r1, String str, ScheduledFuture scheduledFuture) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = scheduledFuture;
    }

    public final void onComplete(Task task) {
        C19500yJ r1 = this.A00;
        String str = this.A01;
        ScheduledFuture scheduledFuture = this.A02;
        AnonymousClass00O r12 = r1.A03;
        synchronized (r12) {
            r12.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
