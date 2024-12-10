package X;

/* renamed from: X.7GW  reason: invalid class name */
public final class AnonymousClass7GW implements C1606689l {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass705 A01;
    public final /* synthetic */ AnonymousClass8A2 A02;
    public final /* synthetic */ C132946nu A03;

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A02.Bsx(exc, Integer.valueOf(this.A00));
    }

    public AnonymousClass7GW(AnonymousClass705 r1, AnonymousClass8A2 r2, C132946nu r3, int i) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public void BrA() {
        this.A02.BrA();
    }

    public void C7I(AnonymousClass732 r3) {
        C132946nu r1 = this.A03;
        AnonymousClass705 r0 = this.A01;
        if (r3 != null) {
            r1.A00(r3, r0);
            return;
        }
        throw C17880vN.A0g();
    }
}
