package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.1k7  reason: invalid class name and case insensitive filesystem */
public class C34211k7 extends C34201k6 {
    public final /* synthetic */ ConversationsFragment A00;

    public C34211k7(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void A03(GroupJid groupJid) {
        C38361rA r0 = this.A00.A1V;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }
}
