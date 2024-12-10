package com.whatsapp.ui.media;

import X.AnonymousClass3MX;
import X.AnonymousClass48T;
import X.C18070vi;
import X.C72453Mb;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MediaCard extends AnonymousClass48T {
    public LinearLayout A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public void A05(int i, int i2) {
        super.A05(i, i2);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            if (i < 0) {
                i = linearLayout.getPaddingLeft();
            }
            int paddingTop = linearLayout.getPaddingTop();
            if (i2 < 0) {
                i2 = linearLayout.getPaddingRight();
            }
            linearLayout.setPadding(i, paddingTop, i2, linearLayout.getPaddingBottom());
        }
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        this.A00 = AnonymousClass3MX.A0K(this, 2131432378);
    }

    public String getError() {
        return super.getError();
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(2131167707);
    }

    public void setError(String str) {
        super.setError(str);
        C72453Mb.A1D(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context) {
        super(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
