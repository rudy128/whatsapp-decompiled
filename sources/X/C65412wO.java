package X;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: X.2wO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65412wO implements Continuation {
    public final /* synthetic */ C19580yR A00;
    public final /* synthetic */ String A01;

    public final Object then(Task task) {
        C19580yR r2 = this.A00;
        String str = this.A01;
        synchronized (r2) {
            r2.A00.remove(str);
        }
        return task;
    }

    public /* synthetic */ C65412wO(C19580yR r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
