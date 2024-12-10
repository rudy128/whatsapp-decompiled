package X;

import java.util.ArrayList;

/* renamed from: X.36W  reason: invalid class name */
public final class AnonymousClass36W implements B9E {
    public final C18030ve A00;
    public final C52352am A01;

    public C63592tN[] CEA() {
        C18030ve r5 = this.A01.A00;
        ArrayList A06 = AnonymousClass1ZU.A06(A00(r5, 3834), A00(r5, 3835), A00(r5, 3810), A00(r5, 6498));
        if (C18020vd.A05(C18040vf.A02, this.A00, 8027)) {
            A06.add(A00(r5, 8029));
        }
        return (C63592tN[]) A06.toArray(new C63592tN[0]);
    }

    public static C63592tN A00(C18020vd r1, int i) {
        String A012 = C18020vd.A01(C18040vf.A02, r1, i);
        C18070vi.A0X(A012);
        return new C63592tN(Integer.parseInt(A012));
    }

    public AnonymousClass36W(C18030ve r1, C52352am r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
