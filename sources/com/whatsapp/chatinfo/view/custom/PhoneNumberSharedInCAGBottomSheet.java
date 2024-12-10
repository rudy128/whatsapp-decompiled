package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass17K;
import X.AnonymousClass1E8;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C72473Md;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class PhoneNumberSharedInCAGBottomSheet extends Hilt_PhoneNumberSharedInCAGBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass11S A01;
    public AnonymousClass129 A02;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass11S r0 = this.A01;
        if (r0 != null) {
            r0.A0I();
            AnonymousClass1E8 r02 = r0.A0D;
            if (r02 != null) {
                str = AnonymousClass17K.A02(r02);
            } else {
                str = null;
            }
            TextView textView = this.A02;
            if (!(str == null || textView == null)) {
                textView.setText(str);
            }
            TextView textView2 = this.A05;
            if (textView2 != null) {
                textView2.setText(2131894654);
            }
            TextView textView3 = this.A04;
            if (textView3 != null) {
                textView3.setText(2131894653);
            }
            TextView textView4 = this.A01;
            if (textView4 != null) {
                textView4.setText(2131894647);
            }
            TextView textView5 = this.A03;
            if (textView5 != null) {
                textView5.setText(2131899286);
                return;
            }
            return;
        }
        AnonymousClass3MW.A1D();
        throw null;
    }

    public void onClick(View view) {
        String str;
        C18070vi.A0d(view, 0);
        int id = view.getId();
        if (!(id == 2131435375 || id == 2131435377)) {
            if (id == 2131435376) {
                AnonymousClass129 r1 = this.A02;
                if (r1 != null) {
                    Intent A0C = C72473Md.A0C(r1, "831150864932965");
                    AnonymousClass1L9 r12 = this.A00;
                    if (r12 != null) {
                        r12.A08(A1D(), A0C);
                    } else {
                        str = "activityUtils";
                    }
                } else {
                    str = "faqLinkFactory";
                }
                C18070vi.A11(str);
                throw null;
            }
            return;
        }
        A29();
    }
}
