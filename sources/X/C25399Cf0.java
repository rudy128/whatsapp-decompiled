package X;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.Cf0  reason: case insensitive filesystem */
public abstract class C25399Cf0 {
    public static final C28447E1n A00 = new Object();

    public static zzw A00(C24475C5q c5q, E5G e5g) {
        C28447E1n e1n = A00;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        c5q.A02(new DI8(c5q, e5g, e1n, taskCompletionSource));
        return taskCompletionSource.zza;
    }
}
