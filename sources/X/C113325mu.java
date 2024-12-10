package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.5mu  reason: invalid class name and case insensitive filesystem */
public final class C113325mu extends C42011xT {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final C22821Di A03;
    public final View.OnClickListener A04;

    public C113325mu(View view, C22821Di r7) {
        super(view);
        this.A03 = r7;
        this.A02 = C17880vN.A0E(view, 2131436073);
        this.A01 = C17880vN.A0E(view, 2131436071);
        this.A00 = view.findViewById(2131436072);
        AFB afb = new AFB(this, 3);
        this.A04 = afb;
        View view2 = this.A0H;
        AnonymousClass1HF.A0m(view2, C26137Ct0.A08, (E3b) null, view.getResources().getString(2131895593));
        view2.setOnClickListener(afb);
    }
}
