package X;

/* renamed from: X.28I  reason: invalid class name */
public abstract class AnonymousClass28I extends C38391rD {
    public final C55242fS A00;

    public int A0Q() {
        AnonymousClass1IX r0 = this.A00.A01;
        if (r0 == null) {
            r0 = AnonymousClass1IX.of();
        }
        return r0.size();
    }

    public void A0U(AnonymousClass1IX r9) {
        C55242fS r3 = this.A00;
        int i = r3.A00 + 1;
        r3.A00 = i;
        AnonymousClass1IX r5 = r3.A01;
        AnonymousClass1IX r4 = r9;
        if (r9 != r5) {
            if (r9 == null) {
                if (r5 != null) {
                    int size = r5.size();
                    r3.A01 = null;
                    r3.A03.C34(0, size);
                    return;
                }
            } else if (r5 == null) {
                r3.A01 = r9;
                r3.A03.Bw0(0, r9.size());
                return;
            }
            r3.A02.A01.execute(new C21365Aiu(r3, r4, r5, i, 17));
        }
    }

    public AnonymousClass28I(C40411uf r4) {
        this.A00 = new C55242fS(new C40471ul(r4).A00(), new C40461uk(this));
    }

    public AnonymousClass28I(C40481um r3) {
        this.A00 = new C55242fS(r3, new C40461uk(this));
    }
}
