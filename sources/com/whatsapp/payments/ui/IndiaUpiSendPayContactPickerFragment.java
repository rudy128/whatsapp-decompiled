package com.whatsapp.payments.ui;

import X.AFP;
import X.AFQ;
import X.AFV;
import X.AXS;
import X.AnonymousClass1LU;
import X.AnonymousClass1YL;
import X.AnonymousClass3MX;
import X.AnonymousClass8BR;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C191339mR;
import X.C197269wQ;
import X.C88554a7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.whatsapp.contact.picker.ContactPickerFragment;

public final class IndiaUpiSendPayContactPickerFragment extends Hilt_IndiaUpiSendPayContactPickerFragment {
    public AnonymousClass1LU A00;
    public AXS A01;
    public C191339mR A02;

    public void A2G() {
        C18030ve r1 = this.A1U;
        AXS axs = this.A01;
        if (axs != null) {
            boolean A002 = C197269wQ.A00(r1, axs.A0G());
            String A0y = AnonymousClass8BR.A0y(A27());
            int i = 2131895715;
            if (A002) {
                i = 2131895716;
            }
            FrameLayout A28 = A28(new AFV(19, A0y, this), 2131232278, 0, 2131231558, i);
            int A003 = AnonymousClass1YL.A00(A1B(), 2130970097, 2131103410);
            C18030ve r12 = this.A1U;
            C18040vf r5 = C18040vf.A02;
            int i2 = 0;
            if (C18020vd.A05(r5, r12, 10659)) {
                i2 = 2131895395;
            }
            AFP afp = new AFP(this, 49);
            View A09 = AnonymousClass3MX.A09(A16(), (ViewGroup) this.A07, 2131624680);
            C88554a7.A04(A09, 2131232231, A003, 2131231553, 2131893716, i2);
            A09.setOnClickListener(afp);
            FrameLayout A04 = ContactPickerFragment.A04(A09, this);
            ListView listView = (ListView) this.A07.findViewById(16908298);
            this.A0D = listView;
            listView.addHeaderView(A28, (Object) null, true);
            if (C18020vd.A05(r5, this.A1U, 11393)) {
                this.A0D.addHeaderView(A28(new AFQ(this, 0), 2131233621, A003, 2131231553, 2131897606), (Object) null, true);
            }
            this.A0D.addHeaderView(A04, (Object) null, true);
            super.A2G();
            return;
        }
        C18070vi.A11("indiaUpiPaymentSharedPrefs");
        throw null;
    }
}
