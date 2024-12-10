package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.APl  reason: case insensitive filesystem */
public final class C20552APl implements C22496BAd {
    public final C188419hO A00;
    public final C132226mR A01;
    public final A11 A02;
    public final AnonymousClass1M9 A03;
    public final Collection A04;
    public final AnonymousClass1OX A05;

    private final List A00() {
        C132226mR r0 = this.A01;
        AnonymousClass1OX r12 = this.A05;
        C188419hO r9 = this.A00;
        C186609eT A002 = r0.A00(r9, r12);
        if (A002 == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (C178119Bw r5 : A002.A02) {
            A11 a11 = this.A02;
            C18070vi.A0d(r5, 0);
            LinkedHashSet A14 = C17880vN.A14();
            Iterator it = r5.A0B().iterator();
            while (it.hasNext()) {
                UserJid userJid = ((C178109Bv) it.next()).A00;
                if (r5.A0a(userJid)) {
                    C18070vi.A0W(userJid);
                    A14.add(userJid);
                }
            }
            AnonymousClass1M9 r02 = this.A03;
            Collection collection = this.A04;
            ArrayList A003 = C196609vL.A00(r02, collection, A14);
            a11.A02(AnonymousClass9IL.LGC_MEMBERS, r9, collection, A003, r12);
            A13.addAll(A003);
        }
        return A13;
    }

    public C20552APl(C188419hO r1, C132226mR r2, A11 a11, AnonymousClass1M9 r4, Collection collection, AnonymousClass1OX r6) {
        C18070vi.A0o(r4, r2, a11);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = a11;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = collection;
    }

    public C193679qU Bhg() {
        return new C193679qU(this, C181239Pr.A00(A00()));
    }

    public C193679qU Bhh() {
        return new C193679qU(this, A00());
    }
}
