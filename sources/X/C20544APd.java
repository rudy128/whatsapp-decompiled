package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.APd  reason: case insensitive filesystem */
public final class C20544APd implements C22496BAd {
    public final C188419hO A00;
    public final A11 A01;
    public final Collection A02;
    public final AnonymousClass1OX A03;

    public C20544APd(C188419hO r2, A11 a11, Collection collection, AnonymousClass1OX r5) {
        C18070vi.A0d(a11, 1);
        this.A01 = a11;
        this.A03 = r5;
        this.A00 = r2;
        this.A02 = collection;
    }

    public C193679qU Bhg() {
        A11 a11 = this.A01;
        AnonymousClass1OX r3 = this.A03;
        C188419hO r2 = this.A00;
        Collection collection = this.A02;
        List list = a11.A00;
        if (list == null) {
            list = C181239Pr.A00(a11.A01(r2, collection, r3));
            a11.A00 = list;
            if (list == null) {
                throw C17890vO.A0K();
            }
        }
        return new C193679qU(this, list);
    }

    public C193679qU Bhh() {
        return new C193679qU(this, this.A01.A01(this.A00, this.A02, this.A03));
    }
}
