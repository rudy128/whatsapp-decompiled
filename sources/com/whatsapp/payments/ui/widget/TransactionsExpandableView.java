package com.whatsapp.payments.ui.widget;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass8DW;
import X.AnonymousClass9NN;
import X.B8b;
import android.content.Context;
import android.util.AttributeSet;

public class TransactionsExpandableView extends AnonymousClass8DW implements AnonymousClass009 {
    public AnonymousClass9NN A00;
    public AnonymousClass031 A01;
    public boolean A02;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPaymentRequestActionCallback(B8b b8b) {
        this.A00.A02 = b8b;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9NN] */
    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ? obj = new Object();
        obj.A01 = context;
        this.A00 = obj;
    }

    public void setAdapter(AnonymousClass9NN r1) {
        this.A00 = r1;
    }

    public TransactionsExpandableView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9NN] */
    public TransactionsExpandableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ? obj = new Object();
        obj.A01 = context;
        this.A00 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.9NN] */
    public TransactionsExpandableView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        ? obj = new Object();
        obj.A01 = context;
        this.A00 = obj;
    }
}
