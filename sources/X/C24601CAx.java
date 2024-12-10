package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.CAx  reason: case insensitive filesystem */
public abstract class C24601CAx {
    public static void A00(Status status, TaskCompletionSource taskCompletionSource, Object obj) {
        if (status.A00 <= 0) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(C24602CAy.A00(status));
        }
    }
}
