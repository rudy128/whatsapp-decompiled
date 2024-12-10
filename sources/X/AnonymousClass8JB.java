package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;

/* renamed from: X.8JB  reason: invalid class name */
public final class AnonymousClass8JB extends C42011xT implements View.OnClickListener {
    public final ImageView A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass9YV A03;

    public void onClick(View view) {
        Intent intent;
        String str;
        C18070vi.A0d(view, 0);
        AnonymousClass9YV r2 = this.A03;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = r2.A00;
        AnonymousClass1E7 r3 = (AnonymousClass1E7) indiaUpiPaymentSettingsFragment.A0X.A00.get(i);
        AnonymousClass1FL A1B = indiaUpiPaymentSettingsFragment.A1B();
        if (A1B != null) {
            intent = A1B.getIntent();
        } else {
            intent = null;
        }
        C20112A7u A022 = C20112A7u.A02();
        A022.A07("merchant_name", r3.A0L());
        AZ6 az6 = indiaUpiPaymentSettingsFragment.A0Q;
        if (intent != null) {
            str = intent.getStringExtra("referral_screen");
        } else {
            str = null;
        }
        az6.BiM(A022, 187, "payment_home", str, 1);
        Intent A06 = AnonymousClass3MY.A06(indiaUpiPaymentSettingsFragment.A1B(), indiaUpiPaymentSettingsFragment.A0R, r3.A0J);
        AnonymousClass1FL A1B2 = indiaUpiPaymentSettingsFragment.A1B();
        A06.putExtra("share_msg", "Hi");
        A06.putExtra("confirm", true);
        A06.putExtra("has_share", true);
        C60392nx.A00(A1B2, A06);
        indiaUpiPaymentSettingsFragment.A1k(A06);
    }

    public AnonymousClass8JB(View view, AnonymousClass9YV r3) {
        super(view);
        this.A03 = r3;
        this.A00 = C108975cc.A0B(view, 2131429404);
        this.A02 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131429411);
        this.A01 = C108975cc.A0B(view, 2131429471);
        this.A0H.setOnClickListener(this);
    }
}
