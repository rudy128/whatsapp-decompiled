package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.DKb  reason: case insensitive filesystem */
public final /* synthetic */ class C26946DKb implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource A00;
    public final /* synthetic */ C26028Cqm A01;

    public /* synthetic */ C26946DKb(TaskCompletionSource taskCompletionSource, C26028Cqm cqm) {
        this.A01 = cqm;
        this.A00 = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        C26028Cqm cqm = this.A01;
        TaskCompletionSource taskCompletionSource = this.A00;
        synchronized (cqm.A08) {
            cqm.A0C.remove(taskCompletionSource);
        }
    }
}
