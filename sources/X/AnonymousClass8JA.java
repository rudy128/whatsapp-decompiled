package X;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

/* renamed from: X.8JA  reason: invalid class name */
public class AnonymousClass8JA extends C42011xT implements View.OnClickListener {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final C184869be A03;

    public void onClick(View view) {
        C184869be r2 = this.A03;
        int i = this.A05;
        if (i == -1) {
            i = this.A04;
        }
        IndiaUpiProfileDetailsActivity indiaUpiProfileDetailsActivity = r2.A00;
        AEC aec = (AEC) r2.A01.get(i);
        C20112A7u A032 = IndiaUpiProfileDetailsActivity.A03(indiaUpiProfileDetailsActivity);
        A032.A07("alias_type", aec.A03);
        indiaUpiProfileDetailsActivity.A0S.BiM(A032, 166, "payments_profile", indiaUpiProfileDetailsActivity.getIntent().getStringExtra("extra_referral_screen"), 1);
        C1418477e r22 = indiaUpiProfileDetailsActivity.A03;
        Intent A07 = AnonymousClass8BR.A07(indiaUpiProfileDetailsActivity, IndiaUpiNumberSettingsActivity.class);
        A07.putExtra("extra_payment_name", r22);
        A07.putExtra("extra_payment_upi_alias", aec);
        A07.putExtra("extra_referral_screen", indiaUpiProfileDetailsActivity.A08);
        indiaUpiProfileDetailsActivity.startActivityForResult(A07, 1021);
    }

    public AnonymousClass8JA(View view, C184869be r3) {
        super(view);
        this.A00 = AnonymousClass3MW.A0G(view, 2131436570);
        this.A02 = AnonymousClass3MW.A0J(view, 2131436574);
        this.A01 = AnonymousClass3MW.A0J(view, 2131432056);
        this.A03 = r3;
        view.setOnClickListener(this);
    }
}
