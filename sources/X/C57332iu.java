package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2iu  reason: invalid class name and case insensitive filesystem */
public final class C57332iu {
    public final C18030ve A00;
    public final C218217n A01;

    public final C192209nz A00() {
        C218217n r5 = this.A01;
        int A002 = C18020vd.A00(C18040vf.A02, this.A00, 1657);
        AnonymousClass1Cd r0 = r5.A02;
        r0.A06();
        if (!r0.A08 || !r5.A03.A04()) {
            return new C192209nz((List) null, false, false, false, false, false);
        }
        AnonymousClass1Nb r6 = r5.A04;
        ArrayList A0d = r6.A0d(true);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0d.iterator();
        while (it.hasNext()) {
            C194379rd r3 = (C194379rd) it.next();
            AnonymousClass1BI r2 = r3.A01;
            if (r2 instanceof GroupJid) {
                AnonymousClass1MZ r1 = r5.A01;
                if (r1.A0J((GroupJid) r2)) {
                    if (r1.A08.A09((AnonymousClass1E9) r2) >= A002) {
                        A13.add(r3);
                    }
                }
            }
        }
        C42551yM A0W = r6.A0W();
        C42551yM A0V = r6.A0V();
        if (A13.isEmpty()) {
            A13 = null;
        }
        return new C192209nz(A13, !new C27311Vp(r5.A00.A00).A01(), !A0V.A0B(), A0V.A02().A0R, !A0W.A0B(), A0W.A02().A0R);
    }

    public C57332iu(C18030ve r1, C218217n r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
