package X;

import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsSyncJob;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2jd  reason: invalid class name and case insensitive filesystem */
public final class C57782jd {
    public final C25001Mm A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1CJ A04;

    public final void A00(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : iterable) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) next;
            if ((r1 instanceof GroupJid) && this.A04.A06((GroupJid) r1) == 1) {
                A13.add(next);
            }
        }
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            this.A00.A01(new MemberSuggestedGroupsSyncJob(C17880vN.A0S(it).getRawString()));
        }
    }

    public C57782jd(C25001Mm r1, C19830z4 r2, AnonymousClass1CJ r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0w(r4, r3, r2, r5, r1);
        this.A02 = r4;
        this.A04 = r3;
        this.A01 = r2;
        this.A03 = r5;
        this.A00 = r1;
    }
}
