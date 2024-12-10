package X;

/* renamed from: X.AYv  reason: case insensitive filesystem */
public class C20792AYv implements BBK {
    public final int A00;
    public final Object A01;

    public C20792AYv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bss(A7B a7b) {
        if (this.A00 != 0) {
            C20838AaG aaG = (C20838AaG) this.A01;
            aaG.A02.A28();
            if (a7b != null) {
                AnonymousClass92s r2 = aaG.A01;
                r2.A08.get();
                int i = a7b.A00;
                if (i == 10752 || i == 10756 || i == 10755) {
                    AnonymousClass92s.A0c(a7b, aaG.A00, r2, aaG.A03);
                    return;
                }
            }
            aaG.A01.BhQ(2131893867);
            return;
        }
        ((C20837AaF) this.A01).A01.A28();
    }

    public void Byv() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C20838AaG aaG = (C20838AaG) obj;
            B90 b90 = aaG.A00;
            if (b90 != null) {
                b90.BpS(aaG.A02);
                return;
            }
            return;
        }
        ((C20837AaF) obj).A01.A28();
    }
}
