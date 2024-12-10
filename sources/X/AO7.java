package X;

public final class AO7 implements BAQ {
    public final BAH A00;
    public final C20114A7x A01;
    public final C193479qA A02;

    public AO7(C20114A7x a7x, BAH bah, C193479qA r4) {
        C18070vi.A0d(a7x, 1);
        this.A01 = a7x;
        this.A02 = r4;
        this.A00 = bah;
    }

    public void BuA(C195469tO r3, String str) {
        C18070vi.A0d(str, 1);
        C20287AEv A0A = this.A01.A0A(r3.A01, str);
        BAH bah = this.A00;
        if (A0A != null) {
            bah.C7i(A0A);
        } else {
            bah.Btw();
        }
    }

    public void Bu8(C195469tO r2, int i) {
        this.A00.Btw();
    }
}
