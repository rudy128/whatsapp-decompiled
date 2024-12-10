package X;

/* renamed from: X.0SC  reason: invalid class name */
public final class AnonymousClass0SC implements C004301w {
    public boolean A00;
    public final /* synthetic */ AnonymousClass022 A01;

    public AnonymousClass0SC(AnonymousClass022 r1) {
        this.A01 = r1;
    }

    public void Bp9(C003301m r3, boolean z) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass022 r1 = this.A01;
            r1.A06.BIt();
            r1.A04.onPanelClosed(AnonymousClass74N.A03, r3);
            this.A00 = false;
        }
    }

    public boolean Bzb(C003301m r3) {
        this.A01.A04.onMenuOpened(AnonymousClass74N.A03, r3);
        return true;
    }
}
