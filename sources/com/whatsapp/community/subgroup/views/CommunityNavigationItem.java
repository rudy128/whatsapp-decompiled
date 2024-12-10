package com.whatsapp.community.subgroup.views;

import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class CommunityNavigationItem extends FrameLayout {
    public final TextEmojiLabel A00;
    public final WaImageView A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityNavigationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        View inflate = LayoutInflater.from(context).inflate(2131624594, this, true);
        setBackgroundResource(2131232910);
        View findViewById = inflate.findViewById(2131429262);
        C18070vi.A0X(findViewById);
        this.A00 = (TextEmojiLabel) findViewById;
        View findViewById2 = inflate.findViewById(2131429265);
        C18070vi.A0X(findViewById2);
        this.A02 = (WaTextView) findViewById2;
        View findViewById3 = inflate.findViewById(2131429263);
        C18070vi.A0X(findViewById3);
        this.A01 = (WaImageView) findViewById3;
    }

    public final void setDescription(String str) {
        if (str == null || str.length() == 0) {
            this.A00.setVisibility(8);
        } else {
            this.A00.setText(str);
        }
    }

    public final void setIcon(int i) {
        this.A01.setImageResource(i);
    }

    public final void setTitle(int i) {
        this.A02.setText(i);
    }
}
