package X;

import java.util.List;

public class D7c implements E7G, E3k {
    public final C26049CrJ A00;
    public final C26049CrJ A01;
    public final C26049CrJ A02;
    public final Integer A03;
    public final List A04 = AnonymousClass000.A13();
    public final boolean A05;

    public void C9s() {
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                ((E3k) list.get(i)).C9s();
                i++;
            } else {
                return;
            }
        }
    }

    public void CIY(List list, List list2) {
    }

    public D7c(C42861yr r4, C26642D7p d7p) {
        this.A05 = r4.A04;
        this.A03 = r4.A03;
        C26049CrJ BHA = r4.A02.BHA();
        this.A02 = BHA;
        C26049CrJ BHA2 = r4.A00.BHA();
        this.A00 = BHA2;
        C26049CrJ BHA3 = r4.A01.BHA();
        this.A01 = BHA3;
        d7p.A0C(BHA);
        d7p.A0C(BHA2);
        d7p.A0C(BHA3);
        BHA.A0A(this);
        BHA2.A0A(this);
        BHA3.A0A(this);
    }

    public String getName() {
        throw AnonymousClass04E.createAndThrow();
    }
}
