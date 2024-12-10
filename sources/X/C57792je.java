package X;

import com.whatsapp.community.sync.CommunityGetParentGroupInfoSyncJob;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2je  reason: invalid class name and case insensitive filesystem */
public final class C57792je {
    public final C25001Mm A00;
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;
    public final AnonymousClass2EF A03;
    public final AnonymousClass00H A04;

    public final void A00() {
        C19830z4 r2 = this.A03.A01;
        if (!r2.A2Y("community_get_parent_group_info_sync_key")) {
            Log.i("CommunityGetParentGroupInfoSyncManager/not syncing");
            return;
        }
        Log.i("CommunityGetParentGroupInfoSyncManager/starting jobs to resync community subgroups for all eligible communities.");
        r2.A1w("community_get_parent_group_info_sync_key", false);
        ArrayList A002 = ((C34511kb) this.A04.get()).A03.A00();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof AnonymousClass1EC) {
                A13.add(next);
            }
        }
        if (C18020vd.A05(C18040vf.A02, this.A02, 8069)) {
            ArrayList A132 = AnonymousClass000.A13();
            for (Object next2 : A13) {
                if (this.A01.A06((GroupJid) next2) == 1) {
                    A132.add(next2);
                }
            }
            Iterator it2 = A132.iterator();
            while (it2.hasNext()) {
                this.A00.A01(new CommunityGetParentGroupInfoSyncJob(C17880vN.A0S(it2).getRawString()));
            }
        }
    }

    public C57792je(C25001Mm r2, AnonymousClass2EF r3, AnonymousClass1CJ r4, C18030ve r5, AnonymousClass00H r6) {
        C18070vi.A0j(r5, r4);
        C18070vi.A0g(r6, 4, r2);
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r3;
        this.A04 = r6;
        this.A00 = r2;
    }
}
