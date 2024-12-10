package com.whatsapp.payments.ui.widget;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PaymentDescriptionRow extends LinearLayout {
    public TextView A00;
    public View A01;
    public TextView A02;

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public void A00() {
        AnonymousClass3MZ.A0D(this).inflate(2131626357, this, true);
        setOrientation(1);
        this.A01 = AnonymousClass1HF.A06(this, 2131433528);
        this.A00 = AnonymousClass3MW.A0J(this, 2131433526);
        this.A02 = AnonymousClass3MW.A0J(this, 2131433529);
    }

    public void A01(String str) {
        Context context;
        int i;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.A02;
        if (isEmpty) {
            textView.setVisibility(8);
            this.A02.setText(str);
            context = getContext();
            i = 2131893482;
        } else {
            textView.setVisibility(0);
            this.A02.setText(str);
            context = getContext();
            i = 2131893481;
        }
        this.A00.setText(context.getString(i));
    }

    public int getLayoutRes() {
        return 2131626357;
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }

    public PaymentDescriptionRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PaymentDescriptionRow(Context context) {
        super(context);
        A00();
    }
}
