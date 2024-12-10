package X;

import android.view.View;

/* renamed from: X.3Zb  reason: invalid class name and case insensitive filesystem */
public final class C74243Zb extends C42011xT {
    public boolean A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass11E A02;
    public final C18030ve A03;
    public final AnonymousClass1DC A04;

    public final void A0B() {
        if (!this.A00) {
            View view = this.A0H;
            C43421zm.A04(AnonymousClass3MW.A0J(view, 2131428700));
            AnonymousClass1HF.A06(view, 2131435885).setSelected(true);
            C89874dA.A00(view, this, 29);
            C42491yG.A02(view);
            this.A00 = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74243Zb(View view, AnonymousClass1KB r4, AnonymousClass11E r5, C18030ve r6, AnonymousClass1DC r7) {
        super(view);
        C18070vi.A0s(r6, r4, r7, r5);
        this.A03 = r6;
        this.A01 = r4;
        this.A04 = r7;
        this.A02 = r5;
        if (!C18020vd.A05(C18040vf.A01, r6, 7104)) {
            A0B();
        }
    }
}
