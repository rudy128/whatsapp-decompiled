package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4nk  reason: invalid class name and case insensitive filesystem */
public final class C96374nk implements C108065b4 {
    public final C25161Nd A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass4DU A02 = AnonymousClass4DU.RECENT_CHATS;
    public final AnonymousClass4QF A03;
    public final C84964Ln A04;

    public C86854Ti Bhf(Set set) {
        ArrayList A13;
        List A002;
        C18070vi.A0d(set, 1);
        if (C18020vd.A05(C18040vf.A02, this.A04.A00, 8974)) {
            A002 = C18460wS.A00;
        } else {
            C25161Nd r3 = this.A00;
            long A012 = AnonymousClass11P.A01(this.A01) - TimeUnit.HOURS.toMillis(12);
            AnonymousClass1CJ.A01(r3.A02);
            C25171Ne r6 = r3.A01;
            synchronized (r6) {
                A13 = AnonymousClass000.A13();
                Iterator it = r6.iterator();
                while (it.hasNext()) {
                    C36311ng r32 = (C36311ng) it.next();
                    if (r32.A00 < A012) {
                        break;
                    }
                    AnonymousClass1BI r1 = r32.A01;
                    if (C22971Dz.A0d(r1)) {
                        A13.add(r1);
                    }
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GroupMemberSuggestionsBucketRecentChats/loadBucket recentOneOnOneJids size: ");
            C17900vP.A0o(A10, A13.size());
            A002 = this.A03.A00(A13, set);
        }
        return new C86854Ti(A002);
    }

    public AnonymousClass4DU BNn() {
        return this.A02;
    }

    public C96374nk(C25161Nd r2, AnonymousClass11P r3, AnonymousClass4QF r4, C84964Ln r5) {
        C18070vi.A0j(r3, r2);
        C18070vi.A0d(r5, 4);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
