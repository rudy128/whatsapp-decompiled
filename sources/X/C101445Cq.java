package X;

import android.os.Bundle;
import com.whatsapp.calling.callrating.CallRatingActivity;
import com.whatsapp.calling.callrating.CallRatingBottomSheet;

/* renamed from: X.5Cq  reason: invalid class name and case insensitive filesystem */
public final class C101445Cq extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallRatingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101445Cq(CallRatingActivity callRatingActivity) {
        super(0);
        this.this$0 = callRatingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Bundle A09 = AnonymousClass3MY.A09(this.this$0);
        CallRatingBottomSheet callRatingBottomSheet = new CallRatingBottomSheet();
        if (A09 != null) {
            callRatingBottomSheet.A1R(A09);
        }
        return callRatingBottomSheet;
    }
}
