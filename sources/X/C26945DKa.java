package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.DKa  reason: case insensitive filesystem */
public final /* synthetic */ class C26945DKa implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource A00;
    public final /* synthetic */ C25994CqA A01;

    public /* synthetic */ C26945DKa(TaskCompletionSource taskCompletionSource, C25994CqA cqA) {
        this.A01 = cqA;
        this.A00 = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        C25994CqA cqA = this.A01;
        TaskCompletionSource taskCompletionSource = this.A00;
        synchronized (cqA.A07) {
            cqA.A0A.remove(taskCompletionSource);
        }
    }
}
