package X;

import android.view.View;

/* renamed from: X.1zS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C43221zS implements View.OnClickListener {
    public final /* synthetic */ C42481yF A00;
    public final /* synthetic */ AnonymousClass1BI A01;

    public final void onClick(View view) {
        C42481yF r4 = this.A00;
        AnonymousClass1BI r3 = this.A01;
        C34021jm r2 = r4.A0J;
        C42071xZ r1 = r4.A06;
        r2.Bot(r1, r3, r4.A08);
        View view2 = r1.A03;
        Runnable runnable = r4.A0U;
        view2.removeCallbacks(runnable);
        if (r1.A03.getVisibility() == 0) {
            r1.A03.postDelayed(runnable, 20);
        }
    }

    public /* synthetic */ C43221zS(C42481yF r1, AnonymousClass1BI r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
