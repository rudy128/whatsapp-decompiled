package X;

/* renamed from: X.ANk  reason: case insensitive filesystem */
public class C20499ANk implements BAM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20499ANk(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void Btn(C188519hY r8, int i) {
        if (this.A00 != 0) {
            C198579yZ r3 = (C198579yZ) this.A02;
            r3.A01.A0J(new C21365Aiu(this.A01, r3, r8, i, 10));
            return;
        }
        ((BAH) this.A01).Btw();
    }

    public void C7c(AN5 an5, C188519hY r9) {
        AN5 an52 = an5;
        if (this.A00 != 0) {
            C198579yZ r2 = (C198579yZ) this.A02;
            r2.A01.A0J(new C21368Aix(r2, this.A01, r9, an52, 47));
            return;
        }
        ((BAH) this.A01).C7i(an5);
    }
}
