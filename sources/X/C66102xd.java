package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2xd  reason: invalid class name and case insensitive filesystem */
public final class C66102xd implements AnonymousClass191 {
    public final C57782jd A00;
    public final C57792je A01;
    public final C58672l4 A02;

    public /* synthetic */ void Blf() {
    }

    public void Blg() {
        C57782jd r4 = this.A00;
        C19830z4 r6 = r4.A01;
        int A0N = r6.A0N("member_suggested_groups_sync_version");
        int A002 = C18020vd.A00(C18040vf.A02, r4.A02, 6600);
        if (A0N >= A002) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MemberSuggestedGroupsSyncManager/at required version: ");
            A10.append(A0N);
            C17900vP.A0j(" vs ", A10, A002);
        } else {
            Log.i("MemberSuggestedGroupsSyncManager/starting jobs to resync member suggested groups for all eligible communities.");
            C17900vP.A0M(r6, "member_suggested_groups_sync_version", A002);
            ArrayList A003 = ((C34511kb) r4.A03.get()).A03.A00();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A003.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof GroupJid) {
                    A13.add(next);
                }
            }
            r4.A00(A13);
        }
        this.A02.A00();
        this.A01.A00();
    }

    public C66102xd(C57782jd r1, C57792je r2, C58672l4 r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
