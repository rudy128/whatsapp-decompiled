package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.33c  reason: invalid class name and case insensitive filesystem */
public class C683733c implements C25221Nj {
    public final int A00;
    public final Object A01;

    public C683733c(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C683733c r1) {
        C41031vh r0;
        if (r1.A00 == 0 && (r0 = ((C40971vb) r1.A01).A07) != null) {
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
            if (!callsHistoryFragmentViewModel.A0J) {
                Log.i("CallsHistoryViewModel/onHavingLeftGroup skip due to no active observer");
            } else if (callsHistoryFragmentViewModel.A01 > 0) {
                callsHistoryFragmentViewModel.A0R.A02();
            }
        }
    }

    public /* synthetic */ void BvO(Set set) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                ((C40631v1) this.A01).A00.A0V(C17880vN.A10(set));
                return;
            case 2:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
                if (C18020vd.A05(C18040vf.A02, conversationsFragment.A25, 10567)) {
                    ConversationsFragment.A12(conversationsFragment);
                    ConversationsFragment.A0m(conversationsFragment, C17880vN.A10(set));
                } else {
                    conversationsFragment.A2A();
                }
                ConversationsFragment.A0J(conversationsFragment);
                return;
            default:
                C25201Nh.A07((C25201Nh) this.A01);
                return;
        }
    }

    public /* synthetic */ void BvN(AnonymousClass1E9 r1) {
    }

    public /* synthetic */ void Bxd(AnonymousClass1EC r1) {
    }

    public /* synthetic */ void Bxe(AnonymousClass1EC r1) {
    }

    public void Bxf(AnonymousClass1EC r1) {
        A00(this);
    }

    public /* synthetic */ void Bxg(AnonymousClass1EC r1) {
    }

    public void Bxh(AnonymousClass1EC r1) {
        A00(this);
    }
}
