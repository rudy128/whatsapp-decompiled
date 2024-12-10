package X;

import android.view.View;

/* renamed from: X.1zT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C43231zT implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42481yF A01;
    public final /* synthetic */ AnonymousClass1BI A02;

    public final void onClick(View view) {
        View view2;
        C42481yF r1 = this.A01;
        AnonymousClass1BI r6 = this.A02;
        int i = this.A00;
        C42071xZ r4 = r1.A06;
        if (r4.A0U.A01() != 0 || !(r4.A0U.A02() instanceof C1600086t)) {
            view2 = r4.A04;
        } else {
            view2 = ((C1600086t) r4.A0U.A02()).getTransitionView();
        }
        r1.A0J.Bow(view2, r4, r4, r6, i, r1.A08);
    }

    public /* synthetic */ C43231zT(C42481yF r1, AnonymousClass1BI r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }
}
