package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: X.DKj  reason: case insensitive filesystem */
public final class C26950DKj implements OnFailureListener {
    public final /* synthetic */ BZ9 A00;
    public final /* synthetic */ String A01;

    public C26950DKj(BZ9 bz9, String str) {
        this.A00 = bz9;
        this.A01 = str;
    }

    public final void onFailure(Exception exc) {
        if (!(exc instanceof ApiException) || ((ApiException) exc).mStatus.A00 != 8003) {
            BZ9.A01(this.A00, this.A01);
        }
    }
}
