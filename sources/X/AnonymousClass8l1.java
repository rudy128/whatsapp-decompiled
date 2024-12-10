package X;

import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.8l1  reason: invalid class name */
public class AnonymousClass8l1 extends C174888xV {
    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        C169348kt r6 = (C169348kt) obj;
        View view = this.A0H;
        C825248h.A00(view, this, r6, 14);
        C825248h.A00(this.A00, this, r6, 15);
        this.A01.setImageDrawable(AnonymousClass3MX.A06(view.getContext(), 2131232133));
        this.A03.setText(2131887157);
        boolean z = r6.A00;
        WaTextView waTextView = this.A02;
        if (z) {
            waTextView.setText(2131887158);
            i = 0;
            waTextView.setVisibility(0);
            this.A00.setImageDrawable(AnonymousClass3MX.A06(view.getContext(), 2131232016));
        } else {
            i = 8;
            waTextView.setVisibility(8);
        }
        this.A00.setVisibility(i);
    }
}
