package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4QF  reason: invalid class name */
public final class AnonymousClass4QF {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass00H A01;

    public final ArrayList A00(List list, Set set) {
        AnonymousClass1E7 A0E;
        C18070vi.A0d(list, 0);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (A13.size() >= 20) {
                break;
            } else if (C22971Dz.A0d(A0Q) && !C29431cG.A18(set, A0Q)) {
                C37551pj A0V = AnonymousClass3MW.A0V(this.A01);
                C18070vi.A0z(A0Q, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                if (!A0V.A0P((UserJid) A0Q) && (A0E = this.A00.A0E(A0Q)) != null && A0E.A0B() && A0E.A10) {
                    A13.add(A0E);
                }
            }
        }
        C17900vP.A0o(AnonymousClass000.A11("GroupMemberSuggestionsContactsFilter/getSuggestedContactsFromJids suggestedContacts size: "), A13.size());
        return A13;
    }

    public AnonymousClass4QF(AnonymousClass1M9 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
