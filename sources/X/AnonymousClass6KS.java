package X;

import android.view.View;

/* renamed from: X.6KS  reason: invalid class name */
public final class AnonymousClass6KS extends C113585nK implements AnonymousClass88I {
    public C140066zt A00;
    public final C34551kg A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KS(View view, C140066zt r6, C34551kg r7, boolean z) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A01 = r7;
        this.A00 = r6;
        AnonymousClass3Ma.A1E(view, this, 45);
        if (z) {
            C43531zx.A03(view, new C39351sv(0, 0, 0, 0));
        }
        C140066zt r3 = this.A00;
        if (r3 != null) {
            View view2 = this.A0H;
            view2.getLayoutParams().width = r3.A02;
            view2.getLayoutParams().height = r3.A01;
        }
    }

    public void BDF(C140066zt r4, AnonymousClass6JD r5) {
        if (!C18070vi.A18(r4, this.A00)) {
            this.A00 = r4;
            if (r4 != null) {
                View view = this.A0H;
                view.getLayoutParams().width = r4.A02;
                view.getLayoutParams().height = r4.A01;
            }
        }
    }
}
