package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.payments.ui.widget.PaymentView;

public class AFW implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AFW(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        int i;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                C175218yL r0 = (C175218yL) this.A02;
                if (z) {
                    i = 2132083881;
                } else if (r0.A4h().length() == 0) {
                    i = 2132083880;
                } else {
                    return;
                }
                textInputLayout.setPrefixTextAppearance(i);
                return;
            case 1:
                PaymentView paymentView = (PaymentView) obj;
                C74783cd r2 = (C74783cd) this.A02;
                if (z) {
                    r2.setHint("");
                    if (PaymentView.A06(paymentView)) {
                        AnonymousClass96c.A07(paymentView).A0F();
                        return;
                    }
                    return;
                }
                r2.setHint(paymentView.getContext().getString(2131899382));
                return;
            default:
                C1769196g r1 = (C1769196g) obj;
                View view2 = (View) this.A02;
                AnonymousClass3MX.A1O(r1);
                WaTextView waTextView = r1.A01;
                Resources A0Y = AnonymousClass000.A0Y(view2);
                Context context = view2.getContext();
                int i3 = 2130971978;
                int i4 = 2131103152;
                if (z) {
                    i3 = 2130971952;
                    i4 = 2131103088;
                }
                AnonymousClass8BW.A0z(context, A0Y, waTextView, i3, i4);
                return;
        }
    }
}
