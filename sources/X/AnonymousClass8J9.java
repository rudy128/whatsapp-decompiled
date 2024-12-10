package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.8J9  reason: invalid class name */
public final class AnonymousClass8J9 extends C42011xT implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass9YV A02;

    public void onClick(View view) {
        String str;
        C18070vi.A0d(view, 0);
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = this.A02.A00;
        Intent intent = indiaUpiPaymentSettingsFragment.A1B().getIntent();
        AZ6 az6 = indiaUpiPaymentSettingsFragment.A0Q;
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        az6.BiL(188, "payment_home", str, 1);
        indiaUpiPaymentSettingsFragment.A2R();
    }

    public AnonymousClass8J9(View view, AnonymousClass9YV r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C108975cc.A0B(view, 2131429404);
        this.A01 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131429411);
        this.A0H.setOnClickListener(this);
    }
}
