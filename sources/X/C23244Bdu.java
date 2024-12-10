package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.Bdu  reason: case insensitive filesystem */
public final class C23244Bdu extends BFY implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23244Bdu(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23244Bdu() {
        attachInterface(this, "com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }
}
