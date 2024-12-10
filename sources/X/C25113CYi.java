package X;

/* renamed from: X.CYi  reason: case insensitive filesystem */
public final class C25113CYi {
    public DMp A00;
    public BJL A01 = new Object();
    public Object A02;
    public boolean A03;

    public void A00(Object obj) {
        this.A03 = true;
        DMp dMp = this.A00;
        if (dMp != null && dMp.A00.A04(obj)) {
            this.A02 = null;
            this.A00 = null;
            this.A01 = null;
        }
    }

    public void finalize() {
        BJL bjl;
        DMp dMp = this.A00;
        if (dMp != null && !dMp.isDone()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            dMp.A00.A03(new C27255Dah(C17890vO.A0V(this.A02, A10)));
        }
        if (!this.A03 && (bjl = this.A01) != null) {
            bjl.A04((Object) null);
        }
    }
}
