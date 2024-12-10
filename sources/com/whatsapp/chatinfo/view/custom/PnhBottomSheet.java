package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass1Y5;
import X.C17880vN;
import X.C18070vi;
import X.C29261bv;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class PnhBottomSheet extends RoundedBottomSheetDialogFragment implements View.OnClickListener {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r4, android.view.LayoutInflater r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            r1 = r3
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet
            if (r0 != 0) goto L_0x0025
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            if (r0 != 0) goto L_0x001a
            boolean r0 = r3 instanceof com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet
            if (r0 == 0) goto L_0x0025
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet r1 = (com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet) r1
            boolean r1 = r1.A04
        L_0x0015:
            r0 = 2131626946(0x7f0e0bc2, float:1.8881143E38)
            if (r1 == 0) goto L_0x001d
        L_0x001a:
            r0 = 2131626456(0x7f0e09d8, float:1.8880149E38)
        L_0x001d:
            android.view.View r0 = r5.inflate(r0, r6, r2)
            X.C18070vi.A0b(r0)
            return r0
        L_0x0025:
            r1 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.view.custom.PnhBottomSheet.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A00 = view.findViewById(2131435375);
        this.A05 = C17880vN.A0E(view, 2131435381);
        this.A04 = C17880vN.A0E(view, 2131435380);
        this.A01 = C17880vN.A0E(view, 2131435376);
        this.A03 = C17880vN.A0E(view, 2131435377);
        TextView A0E = C17880vN.A0E(view, 2131435379);
        A0E.setTextDirection(3);
        C29261bv.A09(A0E, 8, 24, 2, 2);
        this.A02 = A0E;
        View view2 = this.A00;
        if (view2 != null) {
            view2.setOnClickListener(this);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.A05;
        C18070vi.A0z(textView3, "null cannot be cast to non-null type android.view.View");
        AnonymousClass1Y5.A0A(textView3, true);
    }

    public void A1s() {
        super.A1s();
        View view = this.A00;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setOnClickListener((View.OnClickListener) null);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            textView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A02 = null;
        this.A05 = null;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
