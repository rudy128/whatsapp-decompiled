package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.2zJ  reason: invalid class name and case insensitive filesystem */
public final class C67142zJ implements C1605388w {
    public final C24921Me A00;
    public final C25181Nf A01;
    public final List A02;
    public final boolean A03;

    public boolean BLC(AnonymousClass1BI r5) {
        AnonymousClass1E7 r2;
        C18070vi.A0d(r5, 0);
        if ((!C22971Dz.A0T(r5) || this.A03) && (r2 = (AnonymousClass1E7) this.A01.A04().get(r5)) != null && !C22971Dz.A0c(r2.A0J) && this.A00.A0l(r2, this.A02)) {
            return true;
        }
        return false;
    }

    public C67142zJ(C24921Me r4, C25181Nf r5, C52682bJ r6, List list) {
        C18070vi.A0s(r6, r5, r4, list);
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = list;
        this.A03 = C18020vd.A05(C18040vf.A02, r6.A00, 3751);
    }

    public /* synthetic */ Set BYj() {
        return C25511Om.A00;
    }
}
