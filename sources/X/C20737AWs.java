package X;

/* renamed from: X.AWs  reason: case insensitive filesystem */
public class C20737AWs implements C23691Hg {
    public final int A00;
    public final boolean A01;

    public C20737AWs(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public static void A00(AnonymousClass10T r1, int i, boolean z) {
        r1.notifyAllObservers(new C20737AWs(z, i));
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                ((C36851oZ) obj).Bkn(this.A01);
                return;
            case 1:
                ((C36851oZ) obj).BmE(this.A01);
                return;
            case 2:
                ((C36851oZ) obj).ByU(this.A01);
                return;
            case 3:
                ((BDF) obj).Bvf(this.A01);
                return;
            case 4:
                ((BDR) obj).BpM(this.A01);
                return;
            default:
                boolean z = this.A01;
                C33691jE r3 = (C33691jE) obj;
                C18070vi.A0d(r3, 1);
                r3.BxO(z);
                return;
        }
    }
}
