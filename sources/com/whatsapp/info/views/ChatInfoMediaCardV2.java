package com.whatsapp.info.views;

import X.AnonymousClass3MW;
import X.C77523qH;
import X.C85774Or;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.ui.media.MediaCard;

public class ChatInfoMediaCardV2 extends MediaCard {
    public boolean A00;

    public int getThumbnailIconGravity() {
        if (AnonymousClass3MW.A1Z(this.A03)) {
            return 5;
        }
        return 3;
    }

    public int getThumbnailTextGravity() {
        if (AnonymousClass3MW.A1Z(this.A03)) {
            return 3;
        }
        return 5;
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public C77523qH A02(ViewGroup.LayoutParams layoutParams, C85774Or r5, int i) {
        C77523qH A02 = super.A02(layoutParams, r5, i);
        A02.A01 = getResources().getDimension(2131168399);
        return A02;
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = getThumbnailPixelSize();
        this.A00.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.A0E.getLayoutParams();
        layoutParams2.height = getThumbnailPixelSize();
        this.A0E.setLayoutParams(layoutParams2);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(2131167227);
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ChatInfoMediaCardV2(Context context) {
        super(context);
        A01();
    }
}
