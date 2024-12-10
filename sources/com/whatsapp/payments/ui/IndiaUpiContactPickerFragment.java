package com.whatsapp.payments.ui;

import X.AZ6;
import X.AnonymousClass18O;
import X.AnonymousClass1FL;
import X.AnonymousClass1FU;
import X.AnonymousClass1QD;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.BCC;
import X.C195859u1;
import X.C196259ui;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public abstract class IndiaUpiContactPickerFragment extends PaymentContactPickerFragment {
    public AnonymousClass1QD A00;
    public C195859u1 A01;
    public AZ6 A02;

    public boolean A2u() {
        return true;
    }

    public void A34(UserJid userJid) {
        this.A01.A01(A1n(), userJid, (C196259ui) null, (BCC) null, this.A00.A05());
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof AnonymousClass1FU) {
            Intent A07 = AnonymousClass8BR.A07(A1B, AnonymousClass8BU.A0U(this.A1i).BYz());
            AnonymousClass3MY.A12(A07, userJid, "extra_jid");
            A07.putExtra("extra_is_pay_money_only", !this.A1i.A06.A00.A09(AnonymousClass18O.A0V));
            A07.putExtra("referral_screen", "payment_contact_picker");
            super.A35(userJid);
            ((AnonymousClass1FU) A1B).A3q(A07, true);
            return;
        }
        Log.e("India Payments' contact picker activity is null");
    }
}
