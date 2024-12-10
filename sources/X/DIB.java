package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class DIB implements C28565E7v {
    public final TaskCompletionSource A00;

    public DIB(TaskCompletionSource taskCompletionSource) {
        this.A00 = taskCompletionSource;
    }

    public final void CIq(Status status) {
        this.A00.setException(new ApiException(status));
    }

    public final void CKS(Object obj) {
        this.A00.setResult((Object) null);
    }
}
