package X;

import android.widget.FrameLayout;
import com.whatsapp.payments.ui.BrazilPaymentSettingsFragment;

/* renamed from: X.ATa  reason: case insensitive filesystem */
public class C20642ATa implements C22506BAn {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ BrazilPaymentSettingsFragment A01;

    public C20642ATa(FrameLayout frameLayout, BrazilPaymentSettingsFragment brazilPaymentSettingsFragment) {
        this.A01 = brazilPaymentSettingsFragment;
        this.A00 = frameLayout;
    }

    public void Boo(C70513Bj r2) {
        A5V a5v = this.A01.A0g;
        if (a5v != null) {
            a5v.A05(r2);
        }
    }

    public void Brr(C70513Bj r7) {
        BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = this.A01;
        if (C18020vd.A05(C18040vf.A02, brazilPaymentSettingsFragment.A02, 1724)) {
            brazilPaymentSettingsFragment.A0D.Bi2(r7, 1, "payment_home", brazilPaymentSettingsFragment.A0v, 1);
        }
        this.A00.setVisibility(8);
    }
}
