package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Bds  reason: case insensitive filesystem */
public final class C23242Bds extends BFY implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23242Bds(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23242Bds() {
        attachInterface(this, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }
}
