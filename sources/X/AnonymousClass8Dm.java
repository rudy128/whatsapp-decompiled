package X;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;

/* renamed from: X.8Dm  reason: invalid class name */
public class AnonymousClass8Dm extends LinearLayout implements AnonymousClass009, View.OnClickListener {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public C1418477e A05;
    public C22377B5g A06;
    public AnonymousClass031 A07;
    public boolean A08;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A07;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void onClick(View view) {
        C195029sg A012;
        String str;
        Intent A032;
        int i;
        C170278pb r0;
        String str2;
        C170278pb r02;
        C17960vV.A07(this.A06);
        if (view.getId() == 2131434632) {
            C22377B5g b5g = this.A06;
            C1418477e r03 = this.A05;
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) b5g;
            if (r03 == null || AnonymousClass8BW.A1S(r03)) {
                AnonymousClass8pN r2 = indiaUpiBankAccountDetailsActivity.A00;
                if (r2 == null || (r0 = r2.A08) == null) {
                    str = null;
                } else {
                    str = ((AnonymousClass8pS) r0).A0A;
                }
                A032 = IndiaUpiPinPrimerFullSheetActivity.A03(indiaUpiBankAccountDetailsActivity, r2, str, true);
                i = 1017;
            } else {
                AnonymousClass8pN r22 = indiaUpiBankAccountDetailsActivity.A00;
                if (r22 == null || (r02 = r22.A08) == null) {
                    str2 = null;
                } else {
                    str2 = ((AnonymousClass8pS) r02).A0A;
                }
                A032 = IndiaUpiPinPrimerFullSheetActivity.A03(indiaUpiBankAccountDetailsActivity, r22, str2, false);
                i = 1016;
            }
            indiaUpiBankAccountDetailsActivity.startActivityForResult(A032, i);
        } else if (view.getId() == 2131429015) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity2 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            Intent A072 = AnonymousClass8BR.A07(indiaUpiBankAccountDetailsActivity2, IndiaUpiChangePinActivity.class);
            A072.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity2.A00);
            indiaUpiBankAccountDetailsActivity2.startActivity(A072);
        } else if (view.getId() == 2131435960) {
            AnonymousClass91y r5 = (AnonymousClass91y) this.A06;
            C21426Ajt ajt = new C21426Ajt(r5, 47);
            C17890vO.A0u(new AnonymousClass9BC(r5, 104, 1, ajt), r5.A0E);
        } else if (view.getId() == 2131436566) {
            IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity3 = (IndiaUpiBankAccountDetailsActivity) this.A06;
            C171858sO A073 = indiaUpiBankAccountDetailsActivity3.A0B.A07(C17880vN.A0h(), 182, "payment_bank_account_details", "payment_home");
            A073.A0Y = "payment_home";
            indiaUpiBankAccountDetailsActivity3.A0B.BiH(A073);
            if (!C20092A6u.A02(indiaUpiBankAccountDetailsActivity3.A0E, indiaUpiBankAccountDetailsActivity3.A05.A0G()) || (A012 = ((A0u) indiaUpiBankAccountDetailsActivity3.A0I.get()).A01(indiaUpiBankAccountDetailsActivity3.A04.A0A)) == null || !A012.A02.equals("activated")) {
                Intent A074 = AnonymousClass8BR.A07(indiaUpiBankAccountDetailsActivity3, IndiaUpiInternationalActivationActivity.class);
                A074.putExtra("extra_bank_account", indiaUpiBankAccountDetailsActivity3.A00);
                A074.putExtra("extra_referral_screen", "payment_bank_account_details");
                indiaUpiBankAccountDetailsActivity3.CNh(A074, 1019);
                return;
            }
            AnonymousClass4Yv.A01(indiaUpiBankAccountDetailsActivity3, 105);
        }
    }

    public void setInternationalActivationView(C20270AEd aEd) {
        View view = this.A01;
        if (view != null && this.A02 != null && aEd != null) {
            view.setOnClickListener(this);
            boolean z = aEd.A02;
            View view2 = this.A02;
            if (z) {
                view2.setVisibility(0);
                this.A01.setVisibility(8);
                return;
            }
            view2.setVisibility(8);
            this.A01.setVisibility(0);
            TextView A0E = C17880vN.A0E(this, 2131431757);
            if (A0E != null) {
                A0E.setText(aEd.A00);
            }
        }
    }

    public void A00() {
        this.A05 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), Boolean.class, AnonymousClass000.A0i(), "isPinSet");
        this.A04.setText(2131890512);
        this.A00.setVisibility(0);
    }
}
