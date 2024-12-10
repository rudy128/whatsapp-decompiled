package X;

import com.whatsapp.community.sync.CommunitySubGroupsSyncJob;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2l4  reason: invalid class name and case insensitive filesystem */
public final class C58672l4 {
    public final C25001Mm A00;
    public final C19830z4 A01;
    public final AnonymousClass1CJ A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;

    public final void A01(Iterable iterable) {
        C18070vi.A0d(iterable, 0);
        if (C18020vd.A05(C18040vf.A02, this.A03, 8070)) {
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : iterable) {
                if (this.A02.A06((GroupJid) next) == 1) {
                    A13.add(next);
                }
            }
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                this.A00.A01(new CommunitySubGroupsSyncJob(C17880vN.A0S(it).getRawString()));
            }
        }
    }

    public final void A00() {
        C19830z4 r2 = this.A01;
        if (!r2.A2Y("community_get_subgroups_sync_key")) {
            Log.i("CommunitySubGroupsSyncManager/not syncing");
            return;
        }
        Log.i("CommunitySubGroupsSyncManager/starting jobs to resync community subgroups for all eligible communities.");
        r2.A1w("community_get_subgroups_sync_key", false);
        ArrayList A002 = ((C34511kb) this.A04.get()).A03.A00();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AnonymousClass1EC) {
                A13.add(next);
            }
        }
        A01(A13);
    }

    public C58672l4(C25001Mm r1, C19830z4 r2, AnonymousClass1CJ r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0w(r4, r3, r2, r5, r1);
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
    }
}
