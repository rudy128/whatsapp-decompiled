package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Bdt  reason: case insensitive filesystem */
public final class C23243Bdt extends BFY implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23243Bdt(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23243Bdt() {
        attachInterface(this, "com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback");
    }
}
