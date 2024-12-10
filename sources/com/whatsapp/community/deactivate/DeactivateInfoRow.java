package com.whatsapp.community.deactivate;

import X.AnonymousClass03S;
import X.AnonymousClass3Ma;
import X.AnonymousClass4ID;
import X.C17960vV;
import X.C18070vi;
import X.C19740yt;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class DeactivateInfoRow extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A00(context, attributeSet);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        String str;
        LayoutInflater.from(context).inflate(2131625058, this);
        this.A00 = AnonymousClass3Ma.A0C(this, 2131428941);
        this.A02 = AnonymousClass3Ma.A0E(this, 2131428942);
        this.A01 = AnonymousClass3Ma.A0E(this, 2131428940);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168781);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4ID.A00);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TextView textView = this.A02;
                if (textView == null) {
                    str = "rowTitleView";
                    C18070vi.A11(str);
                    throw null;
                }
                String string = context.getString(resourceId);
                C17960vV.A07(string);
                textView.setText(string);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId2 != 0) {
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    C18070vi.A11("rowDescriptionView");
                    throw null;
                }
                String string2 = context.getString(resourceId2);
                C17960vV.A07(string2);
                textView2.setText(string2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(1, -1);
            str = "rowIconView";
            if (resourceId3 != -1) {
                ImageView imageView = this.A00;
                if (imageView != null) {
                    imageView.setImageDrawable(AnonymousClass03S.A01(context, resourceId3));
                }
                C18070vi.A11(str);
                throw null;
            }
            if (obtainStyledAttributes.hasValue(2)) {
                int resourceId4 = obtainStyledAttributes.getResourceId(2, -1);
                ImageView imageView2 = this.A00;
                if (imageView2 != null) {
                    imageView2.setColorFilter(C19740yt.A00(context, resourceId4), PorterDuff.Mode.SRC_ATOP);
                }
                C18070vi.A11(str);
                throw null;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
