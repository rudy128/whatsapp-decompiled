package com.whatsapp.payments.ui;

import X.AG1;
import X.AGC;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1EG;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.C110885hR;
import X.C137116uw;
import X.C166718dr;
import X.C1768095s;
import X.C63662tU;
import X.C63932tv;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class BrazilPaymentDPOActivity extends C166718dr {
    public C1768095s A00;
    public List A01;
    public boolean A02;

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = (C1768095s) A002.A0J.get();
        }
    }

    public BrazilPaymentDPOActivity(int i) {
        this.A02 = false;
        AGC.A00(this, 23);
    }

    public void A4h() {
        super.A4h();
        C110885hR.A0A(this, 2131437007).setVisibility(8);
        this.A06.setVisibility(8);
        C110885hR.A0A(this, 2131429336).setVisibility(0);
        TextView A0I = AnonymousClass3MW.A0I(this, 2131429334);
        A0I.setText(2131895319);
        TextView A0I2 = AnonymousClass3MW.A0I(this, 2131429335);
        A0I2.setText(2131895320);
        TextView A0I3 = AnonymousClass3MW.A0I(this, 2131429333);
        A0I3.setText(2131895318);
        CheckBox[] checkBoxArr = new CheckBox[3];
        AnonymousClass8BS.A1B(A0I, A0I2, checkBoxArr);
        List<TextView> A15 = AnonymousClass8BR.A15(A0I3, checkBoxArr, 2);
        this.A01 = A15;
        C1768095s r2 = this.A00;
        ArrayList A13 = AnonymousClass000.A13();
        for (TextView A18 : A15) {
            A13.add(AnonymousClass3MZ.A18(A18));
        }
        r2.A06.A07("list_of_conditions", AnonymousClass1EG.A08("|", (CharSequence[]) A13.toArray(new String[0])));
        for (CompoundButton onCheckedChangeListener : this.A01) {
            onCheckedChangeListener.setOnCheckedChangeListener(new AG1(this, 0));
        }
        AnonymousClass3Ma.A19(this.A01, this, 47);
    }

    public BrazilPaymentDPOActivity() {
        this(0);
    }
}
