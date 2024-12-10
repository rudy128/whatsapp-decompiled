package X;

import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.Collection;

/* renamed from: X.1k1  reason: invalid class name and case insensitive filesystem */
public class C34151k1 implements AnonymousClass1M7 {
    public final /* synthetic */ ConversationsFragment A00;

    public void Bq6() {
    }

    public C34151k1(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    public void Bq5(Collection collection, boolean z) {
        ConversationsFragment conversationsFragment = this.A00;
        C37621pr r1 = conversationsFragment.A1d;
        if (r1 != null && (r1 instanceof C37641pt)) {
            C37641pt r12 = (C37641pt) r1;
            r12.A02 = false;
            r12.A03(false);
            r12.A01();
        }
        C36521o2 r13 = conversationsFragment.A1H;
        if (r13 != null) {
            r13.unregisterObserver(conversationsFragment.A4H);
        }
    }
}
