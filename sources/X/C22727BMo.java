package X;

import java.util.Set;

/* renamed from: X.BMo  reason: case insensitive filesystem */
public final class C22727BMo extends BMq {
    public final C25644CjX A00;
    public final C25644CjX A01;
    public final Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22727BMo(C25780Clr clr, C25780Clr clr2, C25773Clk clk, C25644CjX cjX, C25644CjX cjX2, Set set) {
        super(clr, clr2, clk);
        C18070vi.A0g(cjX, 4, cjX2);
        C18070vi.A0d(clr2, 11);
        this.A02 = set;
        this.A00 = cjX;
        this.A01 = cjX2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C22727BMo) && super.equals(obj)) {
                C22727BMo bMo = (C22727BMo) obj;
                if (!C18070vi.A18(this.A02, bMo.A02) || !C18070vi.A18(this.A00, bMo.A00) || !C18070vi.A18(this.A01, bMo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, super.hashCode() * 31))) + 1231;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SplitPairRule");
        C108975cc.A17(A10, "{tag=");
        BMq.A00(this, A10);
        C108975cc.A16(A10, ", clearTop=");
        A10.append(", finishPrimaryWithSecondary=");
        A10.append(this.A00);
        A10.append(", finishSecondaryWithPrimary=");
        A10.append(this.A01);
        A10.append(", filters=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
