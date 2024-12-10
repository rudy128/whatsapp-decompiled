package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;

/* renamed from: X.8J8  reason: invalid class name */
public final class AnonymousClass8J8 extends C42011xT implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final C184909bi A02;

    public void onClick(View view) {
        C18070vi.A0d(view, 0);
        PaymentSettingsFragment paymentSettingsFragment = this.A02.A00;
        if (paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment) {
            paymentSettingsFragment.A1k(AnonymousClass1LU.A08(paymentSettingsFragment.A14()));
        }
    }

    public AnonymousClass8J8(View view, C184909bi r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C108975cc.A0B(view, 2131429404);
        this.A01 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131429411);
        this.A0H.setOnClickListener(this);
    }
}
