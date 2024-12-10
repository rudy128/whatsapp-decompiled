package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass129;
import X.AnonymousClass1L9;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C72473Md;
import X.C88414Zp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public final class PhoneNumberSharedBottomSheet extends Hilt_PhoneNumberSharedBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass129 A01;
    public final C18100vl A02 = C88414Zp.A00(this, "arg_is_business");
    public final C18100vl A03 = C88414Zp.A02(this, "arg_my_phone_number");
    public final boolean A04 = true;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView textView = this.A02;
        if (textView != null) {
            C72453Mb.A1G(textView, this.A03);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            textView2.setText(2131894658);
        }
        TextView textView3 = this.A04;
        if (textView3 != null) {
            int i = 2131894657;
            if (C72453Mb.A1a(this.A02)) {
                i = 2131894656;
            }
            textView3.setText(i);
        }
        TextView textView4 = this.A01;
        if (textView4 != null) {
            textView4.setText(2131894655);
        }
        TextView textView5 = this.A03;
        if (textView5 != null) {
            textView5.setText(2131899286);
        }
    }

    public void onClick(View view) {
        String str;
        C18070vi.A0d(view, 0);
        int id = view.getId();
        if (id == 2131435375 || id == 2131435377) {
            A29();
        } else if (id == 2131435376) {
            AnonymousClass129 r1 = this.A01;
            if (r1 != null) {
                Intent A0C = C72473Md.A0C(r1, "626403979060997");
                AnonymousClass1L9 r12 = this.A00;
                if (r12 != null) {
                    r12.A08(A14(), A0C);
                    return;
                }
                str = "activityUtils";
            } else {
                str = "faqLinkFactory";
            }
            C18070vi.A11(str);
            throw null;
        }
    }
}
