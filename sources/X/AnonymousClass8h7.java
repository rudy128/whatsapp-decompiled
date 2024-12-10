package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.8h7  reason: invalid class name */
public class AnonymousClass8h7 extends C20439ALc {
    public void CQJ() {
        String str;
        C63572tK A02;
        C195979uG r2 = this.A02;
        if (r2.A03() && this.A00 == null) {
            this.A01.addView(A00());
        }
        View A00 = A00();
        AnonymousClass3MX.A0V(A00, 2131428078).A0R(r2.A00(A00.getContext()));
        TextView A0J = AnonymousClass3MW.A0J(A00, 2131428069);
        if (!(r2 instanceof C175518yq) || (A02 = ((C175518yq) r2).A01.A02()) == null) {
            str = null;
        } else {
            str = ((AnonymousClass1KK) A02.A02).A02;
        }
        A0J.setText(str);
        C22654BId bId = this.A01;
        bId.setBackgroundResource(AnonymousClass1YL.A00(bId.getContext(), 2130969018, 2131100118));
        AFU.A00(bId, this, 28);
        AFU.A00(AnonymousClass1HF.A06(A00, 2131428811), this, 29);
        A00.setVisibility(0);
        bId.A0e(16, 1);
    }

    public void A01() {
        super.A01();
        this.A01.A0e(16, 3);
    }
}
