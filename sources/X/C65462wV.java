package X;

import android.os.BaseBundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.2wV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65462wV implements SuccessContinuation {
    public static final /* synthetic */ C65462wV A00 = new Object();

    public final Task then(Object obj) {
        BaseBundle baseBundle = (BaseBundle) obj;
        if (baseBundle != null && baseBundle.containsKey("google.messenger")) {
            baseBundle = null;
        }
        zzw zzw = new zzw();
        zzw.zzb(baseBundle);
        return zzw;
    }
}
