package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.9m1  reason: invalid class name and case insensitive filesystem */
public final class C191099m1 {
    public final /* synthetic */ AnonymousClass1FU A00;
    public final /* synthetic */ C194529rs A01;
    public final /* synthetic */ C19954A0l A02;
    public final /* synthetic */ boolean A03;

    public C191099m1(AnonymousClass1FU r1, C194529rs r2, C19954A0l a0l, boolean z) {
        this.A00 = r1;
        this.A02 = a0l;
        this.A01 = r2;
        this.A03 = z;
    }

    public void A00(String str) {
        AnonymousClass1FU r3 = this.A00;
        r3.A41("IndiaUpiPaymentTransactionConfirmationFragment");
        Intent A06 = AnonymousClass3MZ.A06(this.A02.A01);
        A06.setClassName(r3.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity");
        A06.putExtra("extra_transaction_id", str);
        A06.putExtra("referral_screen", "payments_transaction_confirmation");
        Bundle bundle = this.A01.A00;
        if (bundle != null) {
            A06.putExtra("extra_payment_flow_entry_point", bundle.getInt("extra_payment_flow_entry_point"));
        }
        A06.setFlags(67108864);
        if (this.A03) {
            A06.putExtra("extra_action_bar_display_close", true);
            r3.A3q(A06, true);
            return;
        }
        r3.startActivity(A06);
    }
}
