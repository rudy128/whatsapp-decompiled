package X;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import java.math.BigDecimal;

/* renamed from: X.8J7  reason: invalid class name */
public final class AnonymousClass8J7 extends C42011xT implements View.OnClickListener {
    public final ImageView A00;
    public final TextEmojiLabel A01;
    public final C184909bi A02;

    public void onClick(View view) {
        Intent intent;
        AnonymousClass1KN r0;
        AnonymousClass1KN r02;
        String str;
        String str2;
        C18070vi.A0d(view, 0);
        C184909bi r2 = this.A02;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        C21346Aia aia = (C21346Aia) r2.A01.get(i);
        PaymentSettingsFragment paymentSettingsFragment = r2.A00;
        AnonymousClass1FL A1B = paymentSettingsFragment.A1B();
        if (A1B != null) {
            intent = A1B.getIntent();
        } else {
            intent = null;
        }
        boolean z = paymentSettingsFragment instanceof IndiaUpiPaymentSettingsFragment;
        if (z) {
            AZ6 az6 = ((IndiaUpiPaymentSettingsFragment) paymentSettingsFragment).A0Q;
            if (intent != null) {
                str2 = intent.getStringExtra("referral_screen");
            } else {
                str2 = null;
            }
            az6.BiL(149, "payment_home", str2, 1);
        }
        if (!aia.A06) {
            UserJid userJid = aia.A04;
            if (AnonymousClass1R2.A00(paymentSettingsFragment.A0O, userJid, paymentSettingsFragment.A0Z) == 2) {
                C17960vV.A07(userJid);
                synchronized (aia) {
                    r02 = aia.A02;
                }
                BigDecimal bigDecimal = r02.A00;
                AnonymousClass1KJ A012 = paymentSettingsFragment.A0Y.A01();
                C17960vV.A07(A012);
                String BLb = A012.BLb(paymentSettingsFragment.A01, bigDecimal);
                if (z) {
                    IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) paymentSettingsFragment;
                    AnonymousClass1KB r10 = indiaUpiPaymentSettingsFragment.A0B;
                    AnonymousClass1QS r12 = indiaUpiPaymentSettingsFragment.A0a;
                    A1K a1k = new A1K(indiaUpiPaymentSettingsFragment.A1B(), (AnonymousClass1FR) indiaUpiPaymentSettingsFragment.A1D(), r10, indiaUpiPaymentSettingsFragment.A0D, r12, indiaUpiPaymentSettingsFragment.A0V, new C146887Qz(indiaUpiPaymentSettingsFragment, userJid, BLb, 2), new C21432Ajz(indiaUpiPaymentSettingsFragment, userJid, 21), true, false);
                    if (a1k.A02()) {
                        if (intent != null) {
                            str = intent.getStringExtra("referral_screen");
                        } else {
                            str = null;
                        }
                        a1k.A01(userJid, new C20846AaO(indiaUpiPaymentSettingsFragment, 0), str);
                        return;
                    }
                }
                paymentSettingsFragment.A2L(userJid, BLb);
                return;
            }
            return;
        }
        AnonymousClass8pG r7 = aia.A03;
        synchronized (aia) {
            r0 = aia.A02;
        }
        BigDecimal bigDecimal2 = r0.A00;
        if (z) {
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment2 = (IndiaUpiPaymentSettingsFragment) paymentSettingsFragment;
            C170318pf r72 = (C170318pf) r7;
            C1418477e A0Y = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, r72.A0R, "paymentHandle");
            Intent A002 = indiaUpiPaymentSettingsFragment2.A0J.A00(indiaUpiPaymentSettingsFragment2.A1n(), false, true);
            A002.putExtra("extra_payment_handle", A0Y);
            A002.putExtra("extra_payee_name", r72.A0B);
            A002.putExtra("extra_payment_upi_number", (Parcelable) null);
            indiaUpiPaymentSettingsFragment2.A0k.A01(A002);
            A002.putExtra("extra_payment_preset_amount", bigDecimal2);
            A002.putExtra("referral_screen", "send_again_contact");
            indiaUpiPaymentSettingsFragment2.A1k(A002);
        }
    }

    public AnonymousClass8J7(View view, C184909bi r3) {
        super(view);
        this.A02 = r3;
        this.A00 = C108975cc.A0B(view, 2131429404);
        this.A01 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131429411);
        this.A0H.setOnClickListener(this);
    }
}
