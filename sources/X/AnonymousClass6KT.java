package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6KT  reason: invalid class name */
public final class AnonymousClass6KT extends C113585nK implements AnonymousClass88I {
    public C140066zt A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6KT(View view, C140066zt r3, boolean z) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = r3;
        this.A01 = z;
        A01();
    }

    private final void A01() {
        C140066zt r5;
        if (this.A01 && (r5 = this.A00) != null) {
            View view = this.A0H;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = layoutParams.width;
            int i2 = r5.A02;
            if (i != i2 || layoutParams.height != r5.A01) {
                layoutParams.width = i2;
                layoutParams.height = r5.A01;
                view.requestLayout();
            }
        }
    }

    public void BDF(C140066zt r2, AnonymousClass6JD r3) {
        if (!C18070vi.A18(r2, this.A00)) {
            this.A00 = r2;
            A01();
        }
    }
}
