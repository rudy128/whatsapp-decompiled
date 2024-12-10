package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.APk  reason: case insensitive filesystem */
public final class C20551APk implements C22496BAd {
    public final C188419hO A00;
    public final A11 A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1R3 A03;
    public final Collection A04;
    public final AnonymousClass1OX A05;

    private final ArrayList A00() {
        C188419hO r5 = this.A00;
        if (r5.A09) {
            LinkedHashSet A14 = C17880vN.A14();
            A11 a11 = this.A01;
            Iterator A0s = AnonymousClass8BW.A0s(a11.A02);
            while (A0s.hasNext()) {
                C63872tp r1 = (C63872tp) A0s.next();
                C18070vi.A0b(r1);
                if (C196609vL.A01(r1, r5, this.A03)) {
                    C199410f A07 = r1.A07();
                    C18070vi.A0X(A07);
                    A14.addAll(C196609vL.A00(this.A02, this.A04, A07));
                }
            }
            AnonymousClass1OX r11 = this.A05;
            ArrayList A0m = C29431cG.A0m(A14);
            a11.A02(AnonymousClass9IL.GROUP_CHAT_MEMBERS, r5, this.A04, A0m, r11);
            return A0m;
        }
        ArrayList A13 = AnonymousClass000.A13();
        A11 a112 = this.A01;
        Iterator A0s2 = AnonymousClass8BW.A0s(a112.A02);
        while (A0s2.hasNext()) {
            C63872tp r12 = (C63872tp) A0s2.next();
            C18070vi.A0b(r12);
            if (C196609vL.A01(r12, r5, this.A03)) {
                AnonymousClass1OX r8 = this.A05;
                C199410f A072 = r12.A07();
                C18070vi.A0X(A072);
                AnonymousClass1M9 r0 = this.A02;
                Collection collection = this.A04;
                ArrayList A002 = C196609vL.A00(r0, collection, A072);
                a112.A02(AnonymousClass9IL.GROUP_CHAT_MEMBERS, r5, collection, A002, r8);
                A13.addAll(A002);
            }
        }
        return A13;
    }

    public C20551APk(C188419hO r1, A11 a11, AnonymousClass1M9 r3, AnonymousClass1R3 r4, Collection collection, AnonymousClass1OX r6) {
        C18070vi.A0o(r3, r4, a11);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = a11;
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
