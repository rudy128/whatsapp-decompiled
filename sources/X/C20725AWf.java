package X;

/* renamed from: X.AWf  reason: case insensitive filesystem */
public class C20725AWf implements C23691Hg {
    public final int A00;
    public final int A01;
    public final int A02;

    public C20725AWf(int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                int i = this.A01;
                int i2 = this.A02;
                C218917u r5 = (C218917u) obj;
                C18070vi.A0d(r5, 2);
                r5.BzQ(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            case 1:
                ((C183209Xj) obj).A00.A01(0, this.A01, this.A02);
                return;
            default:
                ((B8H) obj).Bvl(this.A01, this.A02);
                return;
        }
    }
}
