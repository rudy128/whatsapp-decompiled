package X;

import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper;
import com.whatsapp.group.CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1;
import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.4Xg  reason: invalid class name and case insensitive filesystem */
public final class C87834Xg {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C87834Xg(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        GroupJid A03 = GroupJid.Companion.A03((String) it.next());
        if (A03 != null) {
            abstractCollection.add(A03);
        }
    }

    public final Object A01(AnonymousClass1EC r7, List list, List list2, C30391dr r10) {
        if (list.isEmpty()) {
            return new AnonymousClass41B(2131892964);
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A00(A13, it);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            A00(A132, it2);
        }
        Set A12 = C29431cG.A12(A132);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r3 = new C31781g7(1, C30581eB.A02(r10));
        r3.A0F();
        ((AnonymousClass4QG) this.A01.get()).A00(new C96444nr(r3, 0), r7, A13, A12);
        return r3.A0C();
    }

    public final Object A02(AnonymousClass1EC r10, List list, List list2, C30391dr r13) {
        if (list.isEmpty()) {
            return new AnonymousClass41B(2131892964);
        }
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A00(A13, it);
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            A00(A132, it2);
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
        C31781g7 r1 = new C31781g7(1, C30581eB.A02(r13));
        r1.A0F();
        C96164nP r3 = new C96164nP(r10, A13, r1);
        C18070vi.A0d(r10, 0);
        AnonymousClass3MX.A1Q(new CreateSubGroupSuggestionProtocolHelper$sendExistingGroupSuggestionWithCallback$1(r3, (CreateSubGroupSuggestionProtocolHelper) this.A00.get(), r10, A13, A132, (C30391dr) null), AnonymousClass1OA.A00);
        return r1.A0C();
    }
}
