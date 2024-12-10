package X;

import android.view.View;

/* renamed from: X.02M  reason: invalid class name */
public class AnonymousClass02M extends AnonymousClass1HN {
    public final /* synthetic */ AnonymousClass01V A00;

    public AnonymousClass02M(AnonymousClass01V r1) {
        this.A00 = r1;
    }

    public void BlP(View view) {
        AnonymousClass01V r2 = this.A00;
        r2.A0E.setAlpha(1.0f);
        r2.A0G.A0B((AnonymousClass1HM) null);
        r2.A0G = null;
    }

    public void BlQ() {
        AnonymousClass01V r2 = this.A00;
        r2.A0E.setVisibility(0);
        if (r2.A0E.getParent() instanceof View) {
            AnonymousClass1HF.A0T((View) r2.A0E.getParent());
        }
    }
}
