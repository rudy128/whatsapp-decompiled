package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.BeU  reason: case insensitive filesystem */
public final class C23280BeU extends C22594BFa implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23280BeU(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23280BeU() {
        attachInterface(this, "com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }
}
