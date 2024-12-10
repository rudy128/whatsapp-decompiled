package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Bg2  reason: case insensitive filesystem */
public final class C23375Bg2 extends C23378Bg5 {
    public final /* synthetic */ TaskCompletionSource A00;

    public final void zzc() {
    }

    public C23375Bg2(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }

    public final void CTJ(C23208Bd3 bd3) {
        Status status = bd3.A00;
        if (status == null) {
            this.A00.trySetException(new ApiException(new Status(8, "Got null status from location service")));
            return;
        }
        int i = status.A00;
        TaskCompletionSource taskCompletionSource = this.A00;
        if (i == 0) {
            taskCompletionSource.setResult(AnonymousClass000.A0i());
        } else {
            taskCompletionSource.trySetException(C24602CAy.A00(status));
        }
    }
}
