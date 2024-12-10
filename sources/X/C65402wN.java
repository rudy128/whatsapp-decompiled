package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: X.2wN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65402wN implements Continuation {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ C19500yJ A01;

    public /* synthetic */ C65402wN(Bundle bundle, C19500yJ r2) {
        this.A01 = r2;
        this.A00 = bundle;
    }

    public final Object then(Task task) {
        BaseBundle baseBundle;
        C19500yJ r3 = this.A01;
        Bundle bundle = this.A00;
        if (!task.isSuccessful() || (baseBundle = (BaseBundle) task.getResult()) == null || !baseBundle.containsKey("google.messenger")) {
            return task;
        }
        return C19500yJ.A00(bundle, r3).onSuccessTask(C19500yJ.A09, C65462wV.A00);
    }
}
