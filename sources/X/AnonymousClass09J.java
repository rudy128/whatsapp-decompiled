package X;

/* renamed from: X.09J  reason: invalid class name */
public final class AnonymousClass09J extends AnonymousClass0XW implements C17610uw, C17560ur {
    public C16430sF A00;
    public boolean A01;

    public static final C16440sG A00(AnonymousClass09J r2) {
        C98494rF r1 = new C98494rF();
        AnonymousClass0F7.A00(r2, new C08600fM(r2, r1));
        return (C16440sG) r1.element;
    }

    public void A0J() {
        C16430sF r0 = this.A00;
        if (r0 != null) {
            r0.release();
        }
        this.A00 = null;
    }

    public void BzO() {
        AnonymousClass0XM r0;
        C16440sG A002 = A00(this);
        if (this.A01) {
            C16430sF r02 = this.A00;
            if (r02 != null) {
                r02.release();
            }
            if (A002 != null) {
                r0 = A002.CBi();
            } else {
                r0 = null;
            }
            this.A00 = r0;
        }
    }
}
