package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1R2;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public final class PaymentInfoMessageView extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass1R2 A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final FrameLayout A03;

    public final void setPaymentUtils(AnonymousClass1R2 r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1R2 getPaymentUtils() {
        AnonymousClass1R2 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("paymentUtils");
        throw null;
    }

    public PaymentInfoMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass1R2) AnonymousClass3MW.A0O(generatedComponent()).A8L.get();
        }
    }

    public /* synthetic */ PaymentInfoMessageView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentInfoMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass1R2) AnonymousClass3MW.A0O(generatedComponent()).A8L.get();
        }
        LayoutInflater.from(context).inflate(2131626368, this, true);
        setOrientation(1);
        this.A03 = (FrameLayout) C18070vi.A05(this, 2131433549);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentInfoMessageView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
