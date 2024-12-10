package X;

/* renamed from: X.DQv  reason: case insensitive filesystem */
public final class C27050DQv implements C28676EDt {
    public final C24887COf A00;
    public final C15950rT A01;
    public final C22801Dg A02;

    public C24887COf BOH() {
        return this.A00;
    }

    public void run() {
        C24887COf cOf = this.A00;
        C42621yT r2 = cOf.A00;
        if (!r2.A03()) {
            Object apply = this.A01.apply(cOf);
            if (!r2.A03()) {
                this.A02.A0E(apply);
            }
        }
    }

    public C27050DQv(C15950rT r2, C22801Dg r3, Object obj) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = new C24887COf(obj);
    }
}
