package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentSettingsActivity;
import com.whatsapp.payments.ui.BrazilPaymentSettingsFragment;
import com.whatsapp.payments.ui.Hilt_P2mLitePaymentSettingsFragment;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.whatsapp.payments.ui.P2mLitePaymentSettingsActivity;
import com.whatsapp.payments.ui.PaymentSettingsFragment;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

/* renamed from: X.921  reason: invalid class name */
public abstract class AnonymousClass921 extends C166878eF {
    public AnonymousClass1LU A00;
    public AnonymousClass1QO A01;
    public AnonymousClass00H A02;
    public PaymentSettingsFragment A03;
    public final AnonymousClass1QE A04 = AnonymousClass1QE.A00("PaymentSettingsActivity", "payment-settings", "COMMON");

    public void A3K() {
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A0E, 7019);
        C30361do A0u = AnonymousClass3MX.A0u(this.A02);
        if (A05) {
            A0u.A02((AnonymousClass1BI) null, 75);
        } else {
            A0u.A01();
        }
    }

    public void onBackPressed() {
        AnonymousClass8GH r2;
        PaymentSettingsFragment paymentSettingsFragment = this.A03;
        if (!(paymentSettingsFragment == null || (r2 = paymentSettingsFragment.A0h) == null)) {
            C19962A0v a0v = paymentSettingsFragment.A0d;
            if (r2 instanceof IndiaPaymentSettingsViewModel) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) r2;
                BD4 bd4 = indiaPaymentSettingsViewModel.A09;
                if (bd4 instanceof AZ6) {
                    AZ6 az6 = (AZ6) bd4;
                    Integer A0h = C17880vN.A0h();
                    boolean A0d = indiaPaymentSettingsViewModel.A0d();
                    AZ6.A01(az6.A07(A0h, A0h, "payment_home", (String) null), C20087A6p.A00(indiaPaymentSettingsViewModel.A05, (AnonymousClass1KN) null, a0v, (String) null, false), az6, A0d);
                }
            } else {
                C20087A6p.A02(C20087A6p.A00(r2.A05, (AnonymousClass1KN) null, a0v, (String) null, false), r2.A09, 1, "payment_home", (String) null, 1);
            }
        }
        if (isTaskRoot()) {
            Intent A022 = AnonymousClass1LU.A02(this);
            finishAndRemoveTask();
            startActivity(A022);
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        PaymentSettingsFragment brazilPaymentSettingsFragment;
        super.onCreate(bundle);
        setContentView(2131626396);
        if (this.A01.A03() || this.A01.A02()) {
            C003401n supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                if (this instanceof BrazilPaymentSettingsActivity) {
                    C18070vi.A0W(this.A0E);
                }
                AnonymousClass8BU.A17(supportActionBar, 2131893788);
            }
            Intent intent = getIntent();
            if (this instanceof P2mLitePaymentSettingsActivity) {
                brazilPaymentSettingsFragment = new Hilt_P2mLitePaymentSettingsFragment();
            } else if (this instanceof IndiaUpiPaymentSettingsActivity) {
                brazilPaymentSettingsFragment = new IndiaUpiPaymentSettingsFragment();
            } else {
                brazilPaymentSettingsFragment = new BrazilPaymentSettingsFragment();
            }
            this.A03 = brazilPaymentSettingsFragment;
            if (bundle == null) {
                if (!(intent == null || intent.getExtras() == null)) {
                    Bundle bundle2 = new Bundle(intent.getExtras());
                    Bundle bundle3 = this.A03.A06;
                    if (bundle3 != null) {
                        bundle2.putAll(bundle3);
                    }
                    this.A03.A1R(bundle2);
                }
                C34001jj A0H = AnonymousClass3Ma.A0H(this);
                A0H.A0C(this.A03, (String) null, 2131433659);
                A0H.A00(false);
                return;
            }
            return;
        }
        this.A04.A06("onCreate payment is not enabled; finish");
        finish();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PaymentSettingsFragment paymentSettingsFragment = this.A03;
        if (paymentSettingsFragment != null) {
            paymentSettingsFragment.A2K(intent);
        }
    }
}
