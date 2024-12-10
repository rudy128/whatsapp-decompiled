package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.perf.MeasuringRelativeLayout;

/* renamed from: X.96c  reason: invalid class name */
public abstract class AnonymousClass96c extends MeasuringRelativeLayout {
    public boolean A00;

    public static void A08(KeyboardPopupLayout keyboardPopupLayout) {
        keyboardPopupLayout.A02 = 0;
        keyboardPopupLayout.A08 = false;
        keyboardPopupLayout.A07 = C18020vd.A05(C18040vf.A02, keyboardPopupLayout.A05, 8110);
    }

    public static AnonymousClass74J A07(PaymentView paymentView) {
        return (AnonymousClass74J) paymentView.A13.get();
    }

    public AnonymousClass96c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
    }

    public static void A09(PaymentView paymentView) {
        if (PaymentView.A06(paymentView)) {
            ((AnonymousClass74J) paymentView.A13.get()).A0D();
        }
    }
}
