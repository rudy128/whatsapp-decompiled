package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.APj  reason: case insensitive filesystem */
public final class C20550APj implements C22496BAd {
    public final C188419hO A00;
    public final A11 A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass1R3 A04;
    public final Collection A05;

    public C20550APj(C188419hO r1, A11 a11, AnonymousClass1CJ r3, AnonymousClass1MZ r4, AnonymousClass1R3 r5, Collection collection) {
        C18070vi.A0s(r4, r5, a11, r3);
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = a11;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = collection;
    }

    private final ArrayList A00() {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A0s = AnonymousClass8BW.A0s(this.A01.A02);
        while (A0s.hasNext()) {
            C63872tp r3 = (C63872tp) A0s.next();
            Collection collection = this.A05;
            AnonymousClass1E9 r2 = r3.A06;
            if (!collection.contains(r2)) {
                AnonymousClass1MZ r1 = this.A03;
                C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.jid.GroupJid");
                if (r1.A0J((GroupJid) r2) && C196609vL.A01(r3, this.A00, this.A04) && !this.A02.A0R(r2)) {
                    C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
                    A13.add(r2);
                }
            }
        }
        return A13;
    }

    public C193679qU Bhg() {
        return new C193679qU(this, C181239Pr.A00(A00()));
    }

    public C193679qU Bhh() {
        return new C193679qU(this, A00());
    }
}
