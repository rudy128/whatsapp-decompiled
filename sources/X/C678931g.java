package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.List;

/* renamed from: X.31g  reason: invalid class name and case insensitive filesystem */
public class C678931g implements C34261kC {
    public final int A00;
    public final Object A01;

    public C678931g(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bu3() {
        if (this.A00 != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
            C38361rA r0 = conversationsFragment.A1V;
            if (r0 != null) {
                List list = r0.BRg().A04;
                if (list == null) {
                    list = C18460wS.A00;
                }
                if (list.contains("FAVORITES_FILTER")) {
                    conversationsFragment.BCQ(conversationsFragment.A27());
                    return;
                }
                return;
            }
            return;
        }
        C40971vb r2 = ((CallsHistoryFragmentViewModel) this.A01).A0R;
        C17890vO.A0t(r2.A04);
        AnonymousClass2PJ r1 = new AnonymousClass2PJ(r2);
        r2.A04 = r1;
        C17890vO.A0u(r1, r2.A0R);
    }
}
