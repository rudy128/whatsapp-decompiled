package X;

public class ALW implements E6P {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ALW(C23736Boh boh, E8A e8a, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = e8a;
            this.A02 = boh;
            return;
        }
        this.A01 = e8a;
        this.A02 = boh;
    }

    public final void Bm7() {
        int i = this.A00;
        E8A e8a = (E8A) this.A01;
        if (i != 0) {
            C23736Boh boh = (C23736Boh) this.A02;
            C25974Cph.A00(boh, C20046A4p.A00(new C20046A4p(), boh.A00, 0), e8a);
            return;
        }
        C20046A4p a4p = new C20046A4p();
        C23736Boh boh2 = (C23736Boh) this.A02;
        C25974Cph.A00(boh2, C20046A4p.A00(a4p, boh2.A00, 0), e8a);
    }
}
