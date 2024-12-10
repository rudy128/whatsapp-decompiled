package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Be3  reason: case insensitive filesystem */
public final class C23253Be3 extends BFZ implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23253Be3(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23253Be3() {
        attachInterface(this, "com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }
}
