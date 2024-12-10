package X;

import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.92C  reason: invalid class name */
public final class AnonymousClass92C extends AnonymousClass92F {
    public final C22465B8x A00;
    public final PaymentMethodRow A01;

    public AnonymousClass92C(View view, C22465B8x b8x) {
        super(view);
        this.A00 = b8x;
        PaymentMethodRow paymentMethodRow = new PaymentMethodRow(view.getContext());
        this.A01 = paymentMethodRow;
        this.A00.addView(paymentMethodRow);
    }
}
