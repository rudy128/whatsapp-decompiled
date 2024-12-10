package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity;
import com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity;

/* renamed from: X.91M  reason: invalid class name */
public abstract class AnonymousClass91M extends AnonymousClass92v implements BBD, C22451B8j {
    public AnonymousClass8pN A00;
    public C175808zJ A01;
    public String A02;
    public final AnonymousClass1QE A03 = AnonymousClass1QE.A00("IndiaUpiBaseResetPinActivity", "payment-settings", "IN");
    public final BroadcastReceiver A04 = new C161128Bv(this, 13);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1KB r2 = this.A05;
        AnonymousClass1OZ A0M = AnonymousClass8BT.A0M(this);
        C30931ek r11 = this.A0A;
        A0B a0b = this.A09;
        A7U a7u = this.A0M;
        C31061ex r7 = this.A0N;
        C195859u1 r8 = this.A05;
        AZ6 az6 = this.A0S;
        this.A01 = new C175808zJ(this, r2, A0M, a7u, this.A0N, AnonymousClass8BT.A0S(this), r7, r8, az6, a0b, r11);
        A57.A00(getApplicationContext()).A02(this.A04, new IntentFilter("TRIGGER_OTP"));
    }

    public void A5F() {
        if (this instanceof IndiaUpiDebitCardVerificationActivity) {
            IndiaUpiDebitCardVerificationActivity indiaUpiDebitCardVerificationActivity = (IndiaUpiDebitCardVerificationActivity) this;
            C175808zJ r3 = indiaUpiDebitCardVerificationActivity.A01;
            C170278pb r2 = indiaUpiDebitCardVerificationActivity.A05.A08;
            C17960vV.A07(r2);
            r3.A01((C1418477e) null, (AnonymousClass8pS) r2, indiaUpiDebitCardVerificationActivity, "BANK");
            return;
        }
        IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity = (IndiaUpiAadhaarCardVerificationActivity) this;
        C175808zJ r32 = indiaUpiAadhaarCardVerificationActivity.A01;
        AnonymousClass8pN r0 = indiaUpiAadhaarCardVerificationActivity.A02;
        if (r0 == null) {
            C18070vi.A11("bankAccount");
            throw null;
        }
        C170278pb r22 = r0.A08;
        C17960vV.A07(r22);
        r32.A01(indiaUpiAadhaarCardVerificationActivity.A03, (AnonymousClass8pS) r22, indiaUpiAadhaarCardVerificationActivity, "AADHAAR");
    }

    public void A5G(AnonymousClass8pN r4) {
        this.A00 = r4;
        CNA(2131894215);
        AnonymousClass1QE r2 = this.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onResume with states: ");
        AnonymousClass8BV.A1D(r2, this.A04, A10);
        if (!this.A04.A07.contains("upi-get-challenge") && this.A0N.A0E().A00 == null) {
            this.A04.A01("upi-get-challenge");
            A53();
        } else if (!this.A04.A07.contains("upi-get-challenge")) {
            A57();
        }
    }

    public void Bwk(A7B a7b, String str) {
        Integer num;
        AnonymousClass8pN r0;
        this.A0S.A09(this.A00, a7b, 1);
        if (!TextUtils.isEmpty(str) && (r0 = this.A00) != null && r0.A08 != null) {
            A5F();
        } else if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b.A00, true)) {
            if (this.A04.A05("upi-list-keys")) {
                this.A0N.A0K();
                A5A(this.A00.A08);
                return;
            }
            AnonymousClass1QE r3 = this.A03;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("onListKeys: ");
            C170278pb r1 = null;
            if (str != null) {
                num = AnonymousClass8BT.A0j(str);
            } else {
                num = null;
            }
            A10.append(num);
            A10.append(" bankAccount: ");
            A10.append(this.A00);
            A10.append(" countrydata: ");
            AnonymousClass8pN r02 = this.A00;
            if (r02 != null) {
                r1 = r02.A08;
            }
            A10.append(r1);
            AnonymousClass8BV.A1E(r3, " failed; ; showErrorAndFinish", A10);
            A56();
        }
    }

    public void Bzl(A7B a7b) {
        this.A0S.A09(this.A00, a7b, 16);
        if (!C20752AXh.A01(this, "upi-generate-otp", a7b.A00, true)) {
            this.A03.A06("onRequestOtp failed; showErrorAndFinish");
            A5H(new C19967A1c(2131894036));
        }
    }

    public void C5K(A7B a7b) {
        int i;
        this.A0S.A09(this.A00, a7b, 6);
        if (a7b == null) {
            this.A03.A06("onSetPin success; showSuccessAndFinish");
            C17890vO.A0u(new C177929Bd((Object) this, 11), this.A05);
            return;
        }
        CEx();
        C196259ui r2 = this.A04;
        synchronized (r2) {
            r2.A07.remove("pin-entry-ui");
        }
        if (!C20752AXh.A01(this, "upi-set-mpin", a7b.A00, true)) {
            Bundle A0D = C17880vN.A0D();
            A0D.putInt("error_code", a7b.A00);
            AnonymousClass8pN r0 = this.A00;
            if (!(r0 == null || r0.A08 == null)) {
                int i2 = a7b.A00;
                if (i2 == 11460 || i2 == 11461) {
                    i = 14;
                } else if (i2 == 11456 || i2 == 11471) {
                    i = 13;
                } else if (i2 == 11458 || i2 == 11457) {
                    i = 17;
                } else if (i2 == 11459) {
                    i = 10;
                } else if (i2 == 11496) {
                    i = 16;
                } else if (i2 == 11499) {
                    i = 23;
                } else {
                    this.A03.A06("onSetPin failed; showErrorAndFinish");
                }
                if (!AnonymousClass4Yv.A02(this)) {
                    showDialog(i, A0D);
                    return;
                }
                return;
            }
            A56();
        }
    }

    public Dialog onCreateDialog(int i, Bundle bundle) {
        if (i == 10) {
            String A0I = this.A0N.A0I();
            return A51(new C146817Qs(44, A0I, this), this.A08.A02(bundle, getString(2131894035)), 10, 2131898593, 2131892908);
        } else if (i == 23) {
            return A51(C21447AkE.A00(this, 11), this.A08.A02(bundle, getString(2131894034)), 23, 2131894173, 2131898766);
        } else if (i == 13) {
            this.A0N.A0L();
            return A51(C21447AkE.A00(this, 10), this.A08.A02(bundle, getString(2131894038)), 13, 2131898593, 2131892908);
        } else if (i == 14) {
            return A51(C21447AkE.A00(this, 8), this.A08.A02(bundle, getString(2131894037)), 14, 2131894173, 2131898766);
        } else if (i == 16) {
            return A51(C21447AkE.A00(this, 9), this.A08.A02(bundle, getString(2131894032)), 16, 2131894173, 2131898766);
        } else if (i != 17) {
            return super.onCreateDialog(i);
        } else {
            A27 a27 = this.A08;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, 6);
            return A51((Runnable) null, a27.A02(bundle, getString(2131893824, A1a)), 17, 2131894173, 2131898766);
        }
    }

    public void A55() {
        super.A55();
        CRG(getString(2131894215));
    }

    public void A5B(C170278pb r2) {
        CNA(2131894215);
        super.A5B(this.A00.A08);
    }

    public void A5H(C19967A1c a1c) {
        CEx();
        if (a1c.A00 == 0) {
            a1c.A00 = 2131894033;
        }
        if (this.A0l) {
            A4o();
            Intent A07 = AnonymousClass8BR.A07(this, IndiaUpiOnboardingErrorEducationActivity.class);
            if (AnonymousClass000.A1W(a1c.A01)) {
                A07.putExtra("error", a1c.A00(this));
            }
            A07.putExtra("error", a1c.A00);
            A4v(A07);
            A3q(A07, true);
            return;
        }
        BhR(a1c.A00(this));
    }

    public void onDestroy() {
        super.onDestroy();
        A57.A00(getApplicationContext()).A01(this.A04);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0l = bundle.getBoolean("inSetupSavedInst");
        AnonymousClass8pN r0 = (AnonymousClass8pN) bundle.getParcelable("bankAccountSavedInst");
        if (r0 != null) {
            this.A00 = r0;
            this.A00.A08 = (C170278pb) bundle.getParcelable("countryDataSavedInst");
        }
        if (bundle.containsKey("seqNumSavedInst")) {
            this.A02 = bundle.getString("seqNumSavedInst");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C170278pb r1;
        super.onSaveInstanceState(bundle);
        if (this.A0l) {
            bundle.putBoolean("inSetupSavedInst", true);
        }
        AnonymousClass8pN r12 = this.A00;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        AnonymousClass8pN r0 = this.A00;
        if (!(r0 == null || (r1 = r0.A08) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A02;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }

    public Dialog onCreateDialog(int i) {
        return onCreateDialog(i, (Bundle) null);
    }
}
