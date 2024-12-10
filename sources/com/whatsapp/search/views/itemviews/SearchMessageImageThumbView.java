package com.whatsapp.search.views.itemviews;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C116435xG;
import X.C438421d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.search.views.MessageThumbView;

public class SearchMessageImageThumbView extends C116435xG {
    public boolean A00;
    public WaImageView A01;
    public WaImageView A02;
    public MessageThumbView A03;

    private void A00(Context context) {
        this.A00 = 1.0f;
        View.inflate(context, 2131626815, this);
        this.A03 = (MessageThumbView) AnonymousClass1HF.A06(this, 2131436134);
        this.A02 = AnonymousClass3MW.A0R(this, 2131435579);
        this.A01 = AnonymousClass3MW.A0R(this, 2131431907);
        AnonymousClass3MY.A0w(context, this.A03, 2131891255);
    }

    public void setMessage(C438421d r3) {
        this.A03 = r3;
        A04(this.A02, this.A01);
        MessageThumbView messageThumbView = this.A03;
        messageThumbView.A01 = this.A00;
        messageThumbView.A06(r3, true);
    }

    public SearchMessageImageThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A02();
    }

    public SearchMessageImageThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A00(context);
    }

    public SearchMessageImageThumbView(Context context) {
        super(context, (AttributeSet) null);
        this.A02 = true;
        this.A01 = true;
        A02();
        A00(context);
    }
}
