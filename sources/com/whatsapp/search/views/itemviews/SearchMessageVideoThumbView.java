package com.whatsapp.search.views.itemviews;

import X.AnonymousClass10I;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass21Y;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4GI;
import X.AnonymousClass6FV;
import X.AnonymousClass7EU;
import X.C18000vb;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;

public class SearchMessageVideoThumbView extends AnonymousClass6FV {
    public LinearLayout A00;
    public AnonymousClass1KB A01;
    public WaTextView A02;
    public C18000vb A03;
    public AnonymousClass10I A04;
    public boolean A05;
    public boolean A06;
    public MessageThumbView A07;

    public float getRatio() {
        return 1.0f;
    }

    public void setMessage(AnonymousClass21Y r8) {
        AnonymousClass21Y r5 = r8;
        super.setMessage(r8);
        this.A07.setVisibility(0);
        MessageThumbView messageThumbView = this.A07;
        messageThumbView.A01 = this.A00;
        messageThumbView.A06(r8, true);
        if (this.A06) {
            C18000vb r4 = this.A03;
            AnonymousClass10I r6 = this.A04;
            AnonymousClass4GI.A00(this.A02, this.A01, new AnonymousClass7EU(this, 1), r4, r5, r6);
            return;
        }
        this.A02.setVisibility(8);
    }

    public SearchMessageVideoThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A02();
    }

    private void A01(Context context) {
        this.A02 = AnonymousClass3MW.A0T(this, 2131432435);
        this.A07 = (MessageThumbView) AnonymousClass1HF.A06(this, 2131436134);
        this.A00 = (LinearLayout) AnonymousClass1HF.A06(this, 2131428602);
        AnonymousClass3MY.A0w(context, this.A07, 2131897855);
    }

    public int getMark() {
        return 2131232596;
    }

    public void setTimeTextVisibility(boolean z) {
        this.A06 = z;
    }

    public SearchMessageVideoThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A06 = true;
        A01(context);
    }

    public SearchMessageVideoThumbView(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = true;
        this.A01 = true;
        AnonymousClass6FV.A00(context, this);
        A02();
        this.A06 = true;
        A01(context);
    }
}
