package com.whatsapp.settings;

import X.AnonymousClass03S;
import X.AnonymousClass3MW;
import X.AnonymousClass4IR;
import X.AnonymousClass4aX;
import X.C108575bv;
import X.C18000vb;
import X.C28931bI;
import X.C72453Mb;
import X.C73153Qc;
import X.C74743cP;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

@Deprecated
public class SettingsRowIconText extends C73153Qc implements C108575bv {
    public int A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public C18000vb A04;
    public C28931bI A05;

    public void setBadgeIcon(Drawable drawable) {
        A01(drawable, false);
    }

    public void A01(Drawable drawable, boolean z) {
        C28931bI r2 = this.A05;
        int i = 8;
        if (drawable != null) {
            i = 0;
        }
        r2.A04(i);
        if (drawable != null) {
            if (z) {
                drawable = new C74743cP(drawable, this.A04);
            }
            ImageView imageView = (ImageView) r2.A02();
            int i2 = this.A00;
            if (i2 != -1) {
                AnonymousClass4aX.A0D(imageView, i2);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public WaImageView getIcon() {
        return this.A01;
    }

    public void setIcon(Drawable drawable) {
        WaImageView waImageView = this.A01;
        waImageView.setVisibility(C72453Mb.A0F(drawable));
        waImageView.setImageDrawable(drawable);
    }

    public void setSubText(int i) {
        WaTextView waTextView = this.A02;
        waTextView.setVisibility(C72453Mb.A02(i));
        waTextView.setText(i);
    }

    public void setText(int i) {
        WaTextView waTextView = this.A03;
        waTextView.setVisibility(C72453Mb.A02(i));
        waTextView.setText(i);
    }

    public SettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        View inflate = View.inflate(context, getLayout(), this);
        this.A01 = AnonymousClass3MW.A0R(inflate, 2131435311);
        this.A03 = AnonymousClass3MW.A0T(inflate, 2131435315);
        this.A02 = AnonymousClass3MW.A0T(inflate, 2131435314);
        this.A05 = C28931bI.A00(inflate, 2131435309);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IR.A01);
        try {
            boolean z = obtainStyledAttributes.getBoolean(4, false);
            if (obtainStyledAttributes.hasValue(3)) {
                Drawable A012 = AnonymousClass03S.A01(context, obtainStyledAttributes.getResourceId(3, -1));
                WaImageView waImageView = this.A01;
                if (A012 == null) {
                    waImageView.setVisibility(8);
                } else {
                    waImageView.setVisibility(0);
                    if (z) {
                        A012 = new C74743cP(A012, this.A04);
                    }
                }
                this.A01.setImageDrawable(A012);
            } else {
                setIcon(2131231968);
            }
            int color = obtainStyledAttributes.getColor(1, -1);
            if (color != -1) {
                AnonymousClass4aX.A0D(this.A01, color);
            }
            setText((CharSequence) this.A04.A0E(obtainStyledAttributes, 6));
            setSubText((CharSequence) this.A04.A0E(obtainStyledAttributes, 5));
            this.A00 = obtainStyledAttributes.getColor(0, -1);
            if (obtainStyledAttributes.hasValue(2)) {
                A01(AnonymousClass03S.A01(context, obtainStyledAttributes.getResourceId(2, -1)), z);
            }
            int color2 = obtainStyledAttributes.getColor(8, -1);
            if (color2 != -1) {
                this.A03.setTextColor(color2);
            }
            if (obtainStyledAttributes.hasValue(7)) {
                this.A02.setMaxLines(obtainStyledAttributes.getInt(7, 0));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getLayout() {
        return 2131626918;
    }

    public SettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setIcon(int i) {
        this.A01.setImageResource(i);
    }

    public void setSubText(CharSequence charSequence) {
        WaTextView waTextView = this.A02;
        waTextView.setVisibility(C72453Mb.A0F(charSequence));
        waTextView.setText(charSequence);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A03;
        waTextView.setVisibility(C72453Mb.A0F(charSequence));
        waTextView.setText(charSequence);
    }
}
