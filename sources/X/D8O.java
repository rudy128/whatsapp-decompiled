package X;

import java.util.List;

public class D8O implements C28487E3r {
    public List A00;

    public boolean Bj6(C24424C2z c2z, C22761BNy bNy) {
        for (C25046CVa A03 : this.A00) {
            if (C26255Cvz.A03(c2z, A03, bNy)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("not(");
        A10.append(this.A00);
        return AnonymousClass8BU.A0q(A10);
    }
}
