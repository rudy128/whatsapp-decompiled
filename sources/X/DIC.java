package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class DIC implements C28565E7v {
    public final TaskCompletionSource A00;

    public DIC(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.C54, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void CKS(Object obj) {
        Exception apiException;
        C23209Bd4 bd4 = (C23209Bd4) obj;
        Status status = bd4.A00;
        if (status.A00 <= 0) {
            TaskCompletionSource taskCompletionSource = this.A00;
            ? obj2 = new Object();
            obj2.A00 = bd4;
            taskCompletionSource.setResult(obj2);
            return;
        }
        boolean A1W = AnonymousClass000.A1W(status.A01);
        TaskCompletionSource taskCompletionSource2 = this.A00;
        if (A1W) {
            apiException = new BYr(status);
        } else {
            apiException = new ApiException(status);
        }
        taskCompletionSource2.setException(apiException);
    }

    public final void CIq(Status status) {
        throw AnonymousClass04E.createAndThrow();
    }
}
