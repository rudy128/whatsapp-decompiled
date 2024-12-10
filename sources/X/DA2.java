package X;

public final class DA2 implements C28572E8d {
    public ECg A00;
    public C28572E8d A01;
    public final DA0 A02;
    public final D9J A03;

    public static void A00(DA2 da2) {
        long BXM = da2.A01.BXM();
        DA0 da0 = da2.A02;
        da0.A01(BXM);
        C25732Cl2 BXC = da2.A01.BXC();
        if (!BXC.equals(da0.A01)) {
            da0.CK1(BXC);
            da2.A03.A0Q(BXC);
        }
    }

    public C25732Cl2 BXC() {
        C28572E8d e8d = this.A01;
        if (e8d != null) {
            return e8d.BXC();
        }
        return this.A02.A01;
    }

    public long BXM() {
        ECg eCg = this.A00;
        if (eCg == null || eCg.Bed() || (!this.A00.Bg8() && this.A00.Bco())) {
            return this.A02.BXM();
        }
        return this.A01.BXM();
    }

    public C25732Cl2 CK1(C25732Cl2 cl2) {
        C28572E8d e8d = this.A01;
        if (e8d != null) {
            cl2 = e8d.CK1(cl2);
        }
        this.A02.CK1(cl2);
        this.A03.A0Q(cl2);
        return cl2;
    }

    public DA2(D9J d9j, C28617EAp eAp) {
        this.A03 = d9j;
        this.A02 = new DA0(eAp);
    }
}
