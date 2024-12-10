package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class DKV implements Continuation {
    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (AnonymousClass000.A1Y(task.getResult())) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
