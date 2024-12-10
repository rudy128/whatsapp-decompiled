package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.2xt  reason: invalid class name and case insensitive filesystem */
public class C66262xt implements AnonymousClass1M6 {
    public final int A00;
    public final Object A01;

    public C66262xt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bmw(UserJid userJid) {
        if (this.A00 != 0) {
            ConversationsFragment conversationsFragment = (ConversationsFragment) this.A01;
            conversationsFragment.A11.A00 = null;
            ConversationsFragment.A0m(conversationsFragment, Collections.singletonList(userJid));
            return;
        }
        ((C40631v1) this.A01).A00.A0U(userJid);
    }

    public /* synthetic */ void Bmt(UserJid userJid) {
    }
}
