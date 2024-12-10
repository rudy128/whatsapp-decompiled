package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.BeT  reason: case insensitive filesystem */
public final class C23279BeT extends C22594BFa implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23279BeT(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23279BeT() {
        attachInterface(this, "com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }
}
