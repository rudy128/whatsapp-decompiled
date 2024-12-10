package X;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: X.BfM  reason: case insensitive filesystem */
public final class C23334BfM extends C22598BFe implements IInterface {
    public final /* synthetic */ TaskCompletionSource A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C23334BfM(TaskCompletionSource taskCompletionSource) {
        this();
        this.A00 = taskCompletionSource;
    }

    public C23334BfM() {
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }
}
