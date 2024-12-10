package X;

import com.whatsapp.data.GroupFetchAllMembershipApprovalRequestsJob;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2xl  reason: invalid class name and case insensitive filesystem */
public final class C66182xl implements AnonymousClass191 {
    public final AnonymousClass1M9 A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final C25001Mm A03;
    public final AnonymousClass1MZ A04;

    public final void A00(AnonymousClass1EC r3) {
        C18070vi.A0d(r3, 0);
        this.A03.A01(new GroupFetchAllMembershipApprovalRequestsJob(r3.getRawString()));
    }

    public final void A01(Set set) {
        C18070vi.A0d(set, 0);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1EC r1 = (AnonymousClass1EC) it.next();
            AnonymousClass1E7 A0G = this.A00.A0G(r1);
            if (A0G != null && A0G.A12 && this.A04.A0K(r1)) {
                A00(r1);
            }
        }
    }

    public /* synthetic */ void Blf() {
    }

    public void Blg() {
        C19830z4 r5 = this.A01;
        int A0N = r5.A0N("group_join_request_startup_sync_count");
        int A002 = C18020vd.A00(C18040vf.A02, this.A02, 2868);
        if (A0N < A002) {
            Log.i("GroupMembershipApprovalRequestsManager/ starting jobs to reSync pending membership approval requests for all eligible groups.");
            C17900vP.A0M(r5, "group_join_request_startup_sync_count", A002);
            LinkedHashSet A14 = C17880vN.A14();
            Iterator it = C29431cG.A0q(this.A00.A04.A0M()).iterator();
            while (it.hasNext()) {
                Jid A06 = C17880vN.A0O(it).A06(AnonymousClass1EC.class);
                if (A06 != null) {
                    A14.add(A06);
                }
            }
            A01(A14);
        }
    }

    public C66182xl(C25001Mm r1, AnonymousClass1M9 r2, C19830z4 r3, AnonymousClass1MZ r4, C18030ve r5) {
        C18070vi.A0w(r5, r1, r3, r2, r4);
        this.A02 = r5;
        this.A03 = r1;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r4;
    }

    public void Ba9() {
        new AnonymousClass20F(getClass()).toString();
    }
}
