package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.APh  reason: case insensitive filesystem */
public final class C20548APh implements C22496BAd {
    public final C188419hO A00;
    public final C132226mR A01;
    public final AnonymousClass1M9 A02;
    public final Collection A03;
    public final AnonymousClass1OX A04;

    private final List A00() {
        C186609eT A002 = this.A01.A00(this.A00, this.A04);
        if (A002 == null) {
            return C18460wS.A00;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (C178119Bw A0C : A002.A01) {
            A13.addAll(C196609vL.A00(this.A02, this.A03, A0C.A0C()));
        }
        return A13;
    }

    public C20548APh(C188419hO r1, C132226mR r2, AnonymousClass1M9 r3, Collection collection, AnonymousClass1OX r5) {
        C18070vi.A0j(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
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
