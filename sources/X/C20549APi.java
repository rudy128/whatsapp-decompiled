package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.APi  reason: case insensitive filesystem */
public final class C20549APi implements C22496BAd {
    public final C188419hO A00;
    public final C132226mR A01;
    public final AnonymousClass1MZ A02;
    public final Collection A03;
    public final AnonymousClass1OX A04;

    private final List A00() {
        GroupJid groupJid;
        C186609eT A002 = this.A01.A00(this.A00, this.A04);
        if (A002 == null) {
            return C18460wS.A00;
        }
        List list = A002.A02;
        ArrayList<C178119Bw> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            C178119Bw r2 = (C178119Bw) next;
            Collection collection = this.A03;
            GroupJid groupJid2 = r2.A0C;
            if (groupJid2 == null) {
                groupJid2 = null;
            }
            if (!C29431cG.A18(collection, groupJid2) && (groupJid = r2.A0C) != null && this.A02.A0J(groupJid)) {
                A13.add(next);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (C178119Bw r0 : A13) {
            GroupJid groupJid3 = r0.A0C;
            C18070vi.A0z(groupJid3, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
            A132.add(groupJid3);
        }
        return A132;
    }

    public C20549APi(C188419hO r1, C132226mR r2, AnonymousClass1MZ r3, Collection collection, AnonymousClass1OX r5) {
        C18070vi.A0j(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = collection;
    }

    public C193679qU Bhg() {
        return new C193679qU(this, C181239Pr.A00(A00()));
    }

    public C193679qU Bhh() {
        return new C193679qU(this, A00());
    }
}
