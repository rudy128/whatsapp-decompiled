package X;

public class AYA implements BCC {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AYA(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bpz(AnonymousClass8pF r4) {
        if (this.A00 != 0) {
            ((AnonymousClass8FV) this.A01).A00.A0F(AnonymousClass8BR.A0B(r4, this.A02));
        } else if (r4 == null || C20061A5k.A02(r4.A01)) {
            ((BCC) this.A02).Bss(A7B.A00());
        } else {
            ((C195859u1) this.A01).A04.A0O(r4.A01, r4.A02);
            ((BCC) this.A02).Bpz(r4);
        }
    }

    public void Bss(A7B a7b) {
        if (this.A00 != 0) {
            ((AnonymousClass8FV) this.A01).A01.A0E(AnonymousClass8BR.A0B(a7b, this.A02));
        } else {
            ((BCC) this.A02).Bss(a7b);
        }
    }

    public /* synthetic */ void BzI(AnonymousClass9O3 r3) {
        if (this.A00 != 0) {
            ((AnonymousClass8FV) this.A01).A02.A0F(AnonymousClass8BR.A0B(r3, this.A02));
        }
    }
}
