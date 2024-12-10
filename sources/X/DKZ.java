package X;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class DKZ implements OnCompleteListener {
    public final /* synthetic */ C25528ChQ A00;
    public final /* synthetic */ TaskCompletionSource A01;

    public DKZ(C25528ChQ chQ, TaskCompletionSource taskCompletionSource) {
        this.A00 = chQ;
        this.A01 = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        this.A00.A01.remove(this.A01);
    }
}
