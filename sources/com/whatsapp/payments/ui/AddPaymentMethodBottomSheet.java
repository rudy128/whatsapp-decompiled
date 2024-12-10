package com.whatsapp.payments.ui;

import X.AFV;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.B95;
import X.BD4;
import X.C17880vN;
import X.C18030ve;
import X.C186149dj;
import X.C20087A6p;
import X.C20112A7u;
import X.C20157A9t;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public class AddPaymentMethodBottomSheet extends Hilt_AddPaymentMethodBottomSheet {
    public AnonymousClass11C A00;
    public C18030ve A01;
    public BD4 A02;
    public C186149dj A03;
    public B95 A04;
    public final C20157A9t A05 = new Object();

    public void onCancel(DialogInterface dialogInterface) {
        this.A05.onDismiss(dialogInterface);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView A0E;
        TextView A0E2;
        View A09 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624137);
        C186149dj r0 = this.A03;
        if (r0 != null) {
            int i = r0.A02;
            if (!(i == 0 || (A0E2 = C17880vN.A0E(A09, 2131427631)) == null)) {
                A0E2.setText(i);
            }
            int i2 = this.A03.A01;
            TextEmojiLabel A0W = AnonymousClass3MX.A0W(A09, 2131427630);
            if (A0W != null) {
                AnonymousClass3Ma.A1K(A0W, this.A00);
                AnonymousClass3Ma.A1L(this.A01, A0W);
                A0W.setText(i2);
            }
            int i3 = this.A03.A00;
            if (!(i3 == 0 || (A0E = C17880vN.A0E(A09, 2131427629)) == null)) {
                A0E.setText(i3);
            }
        }
        String A0y = AnonymousClass8BR.A0y(A15());
        C20087A6p.A03((C20112A7u) null, this.A02, "get_started", A0y);
        AnonymousClass1HF.A06(A09, 2131427629).setOnClickListener(new AFV(15, A0y, this));
        return A09;
    }
}
