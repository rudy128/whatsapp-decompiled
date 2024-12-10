package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4bH;
import X.AnonymousClass86E;
import X.C142807Aw;
import X.C17880vN;
import X.C18030ve;
import X.C22891Dp;
import X.C36421nr;
import X.C38631rd;
import X.C39771tc;
import X.C72463Mc;
import X.C89914dE;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class E2EEDescriptionBottomSheet extends Hilt_E2EEDescriptionBottomSheet implements AnonymousClass86E {
    public static boolean A04;
    public int A00;
    public AnonymousClass1L9 A01;
    public C18030ve A02;
    public C36421nr A03;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.conversation.conversationrow.Hilt_E2EEDescriptionBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet] */
    public static E2EEDescriptionBottomSheet A00(int i) {
        ? hilt_E2EEDescriptionBottomSheet = new Hilt_E2EEDescriptionBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("entry_point", i);
        hilt_E2EEDescriptionBottomSheet.A1R(A0D);
        return hilt_E2EEDescriptionBottomSheet;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625151);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        super.A21(bundle, view);
        Bundle bundle2 = this.A06;
        if (!(bundle2 == null || (i = bundle2.getInt("entry_point", -1)) == -1)) {
            TextView A0J = AnonymousClass3MW.A0J(view, 2131430231);
            TextView A0J2 = AnonymousClass3MW.A0J(view, 2131430230);
            if (A04) {
                A0J.setText(2131892101);
                A0J2.setText(2131892100);
                C72463Mc.A16(view, 2131430218, 8);
                C72463Mc.A16(view, 2131430229, 8);
                C72463Mc.A16(view, 2131430214, 8);
                C72463Mc.A16(view, 2131430225, 8);
            } else if (8 == i) {
                A0J.setText(2131887489);
                A0J2.setText(2131887488);
            }
            ImageView A0G = AnonymousClass3MW.A0G(view, 2131430213);
            if (C22891Dp.A02) {
                C38631rd r3 = new C38631rd();
                A0G.setImageDrawable(r3);
                C39771tc.A06(A1n(), 2132017251).A02(new C142807Aw(r3, 0));
            } else {
                A0G.setImageResource(2131231367);
            }
            this.A03.A00(i, 1);
            this.A00 = i;
        }
        View A06 = AnonymousClass1HF.A06(view, 2131430219);
        View A062 = AnonymousClass1HF.A06(view, 2131430233);
        C89914dE.A00(A06, this, 4);
        C89914dE.A00(A062, this, 5);
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        A27.setOnShowListener(new AnonymousClass4bH(this, 2));
        return A27;
    }
}
