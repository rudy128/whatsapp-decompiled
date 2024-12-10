package X;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class DKX implements Continuation {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ boolean A02;

    public final Object then(Task task) {
        Context context = this.A00;
        Intent intent = this.A01;
        boolean z = this.A02;
        if (!C25333Cde.A00() || AnonymousClass000.A0M(task.getResult()) != 402) {
            return task;
        }
        return C25924Con.A01(context, intent, z).continueWith(new C27134DVv(0), new DKW(0));
    }

    public /* synthetic */ DKX(Context context, Intent intent, boolean z) {
        this.A00 = context;
        this.A01 = intent;
        this.A02 = z;
    }
}
