package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.calling.callrating.CallRatingBottomSheet;
import com.whatsapp.calling.callrating.CallRatingFragment;
import com.whatsapp.calling.callrating.UserProblemsFragment;

/* renamed from: X.5Qp  reason: invalid class name and case insensitive filesystem */
public final class C105075Qp extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CallRatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105075Qp(CallRatingBottomSheet callRatingBottomSheet) {
        super(1);
        this.this$0 = callRatingBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CallRatingBottomSheet callRatingBottomSheet;
        Fragment userProblemsFragment;
        if (C18070vi.A18(obj, C76053mS.A00)) {
            callRatingBottomSheet = this.this$0;
            userProblemsFragment = new CallRatingFragment();
        } else {
            if (C18070vi.A18(obj, C76063mT.A00)) {
                callRatingBottomSheet = this.this$0;
                userProblemsFragment = new UserProblemsFragment();
            }
            return C27621Wu.A00;
        }
        C34001jj A0Y = C72453Mb.A0Y(callRatingBottomSheet);
        A0Y.A09(userProblemsFragment, 2131429504);
        A0Y.A01();
        return C27621Wu.A00;
    }
}
