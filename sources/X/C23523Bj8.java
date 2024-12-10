package X;

import android.os.IBinder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Bj8  reason: case insensitive filesystem */
public class C23523Bj8 extends DTW {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23523Bj8(TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, C25542Chf chf) {
        super(taskCompletionSource);
        this.A01 = taskCompletionSource2;
        this.A02 = chf;
    }

    public C23523Bj8(IBinder iBinder, C26336Cxt cxt) {
        this.A01 = iBinder;
        this.A02 = cxt;
    }
}
