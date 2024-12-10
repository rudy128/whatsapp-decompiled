package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity;
import com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity;

/* renamed from: X.91L  reason: invalid class name */
public abstract class AnonymousClass91L extends AnonymousClass92H implements C22447B8f {
    public AnonymousClass1KI A00;
    public C196259ui A01;
    public C175678z6 A02;

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.A01 = this.A0M.A04;
        AnonymousClass1KB r2 = this.A05;
        AnonymousClass1OZ A0M = AnonymousClass8BT.A0M(this);
        AnonymousClass1QS r8 = this.A0Q;
        this.A02 = new C175678z6(this, r2, this.A00, A0M, this.A0M, AnonymousClass8BT.A0S(this), this.A0N, r8, this);
        onConfigurationChanged(C108965cb.A03(this));
        AZ6 az6 = this.A0S;
        if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
            str = "notify_verification_prompt";
        } else {
            str = "notify_verification_screen";
        }
        az6.BiL((Integer) null, str, this.A0f, 0);
    }

    public void A51(AnonymousClass8pS r4) {
        Intent A07 = AnonymousClass8BR.A07(this, IndiaUpiSimVerificationActivity.class);
        A4v(A07);
        A07.putExtra("extra_in_setup", true);
        A07.putExtra("extra_selected_bank", r4);
        A07.putExtra("extra_referral_screen", this.A0f);
        startActivity(A07);
        finish();
    }

    public void C2B(A7B a7b) {
        if (!C20752AXh.A01(this, "upi-get-psp-routing-and-list-keys", a7b.A00, false)) {
            AnonymousClass1QE r2 = this.A0q;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("onPspRoutingAndListKeysError: ");
            A10.append(a7b);
            AnonymousClass8BV.A1E(r2, "; showGenericError", A10);
            A50();
        }
    }

    public void onBackPressed() {
        String str;
        AZ6 az6 = this.A0S;
        Integer A0j = C17880vN.A0j();
        if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
            str = "notify_verification_prompt";
        } else {
            str = "notify_verification_screen";
        }
        az6.BiL(A0j, str, this.A0f, 1);
        super.onBackPressed();
    }

    public void A50() {
        CEx();
        C20110A7s.A00(this, (DialogInterface.OnDismissListener) null, getString(2131893867)).show();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() == 16908332) {
            AZ6 az6 = this.A0S;
            Integer A0j = C17880vN.A0j();
            if (this instanceof IndiaUpiProvideMoreInfoBottomSheetActivity) {
                str = "notify_verification_prompt";
            } else {
                str = "notify_verification_screen";
            }
            az6.BiL(A0j, str, this.A0f, 1);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStop() {
        super.onStop();
        if (isFinishing()) {
            this.A02.A00 = null;
        }
    }
}
