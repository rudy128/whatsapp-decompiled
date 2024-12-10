package X;

import com.whatsapp.favorite.FavoriteManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.APm  reason: case insensitive filesystem */
public final class C20553APm implements C22496BAd {
    public final FavoriteManager A00;
    public final C188419hO A01;
    public final A11 A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1R3 A04;
    public final Collection A05;
    public final AnonymousClass1OX A06;

    private final ArrayList A00() {
        List<C62482rT> A022 = this.A00.A04.A02();
        ArrayList A13 = AnonymousClass000.A13();
        for (C62482rT r2 : A022) {
            if (r2.A02 == C49512Qt.GROUP) {
                AnonymousClass1BI r1 = r2.A03;
                C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.GroupJid");
                A13.add(r1);
            }
        }
        A11 a11 = this.A02;
        ArrayList<C63872tp> A132 = AnonymousClass000.A13();
        for (Object next : (List) a11.A02.getValue()) {
            if (C29431cG.A18(A13, ((C63872tp) next).A06)) {
                A132.add(next);
            }
        }
        LinkedHashSet A14 = C17880vN.A14();
        for (C63872tp r22 : A132) {
            C188419hO r12 = this.A01;
            C18070vi.A0b(r22);
            if (C196609vL.A01(r22, r12, this.A04)) {
                C199410f A07 = r22.A07();
                C18070vi.A0X(A07);
                A14.addAll(C196609vL.A00(this.A03, this.A05, A07));
            }
        }
        AnonymousClass1OX r10 = this.A06;
        C188419hO r7 = this.A01;
        ArrayList A0m = C29431cG.A0m(A14);
        a11.A02(AnonymousClass9IL.FAVORITE_GROUP_CHAT_MEMBERS, r7, this.A05, A0m, r10);
        return A0m;
    }

    public C20553APm(C188419hO r1, A11 a11, AnonymousClass1M9 r3, AnonymousClass1R3 r4, FavoriteManager favoriteManager, Collection collection, AnonymousClass1OX r7) {
        C18070vi.A0s(favoriteManager, r3, r4, a11);
        this.A00 = favoriteManager;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = a11;
        this.A06 = r7;
        this.A01 = r1;
        this.A05 = collection;
    }

    public C193679qU Bhg() {
        return new C193679qU(this, C181239Pr.A00(A00()));
    }

    public C193679qU Bhh() {
        return new C193679qU(this, A00());
    }
}
