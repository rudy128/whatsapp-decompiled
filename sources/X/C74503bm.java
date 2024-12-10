package X;

import android.content.Context;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.3bm  reason: invalid class name and case insensitive filesystem */
public final class C74503bm extends C110745gz {
    public final CallRatingViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74503bm(Context context, CallRatingViewModel callRatingViewModel, int i) {
        super(context, i);
        C18070vi.A0d(callRatingViewModel, 3);
        this.A00 = callRatingViewModel;
    }

    public void cancel() {
        this.A00.A04.A0F(C76043mR.A00);
    }
}
