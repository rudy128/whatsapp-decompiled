package com.whatsapp.wds.components.banners;

import X.AnonymousClass000;
import X.AnonymousClass1Y0;
import X.AnonymousClass1YH;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4AD;
import X.AnonymousClass4AE;
import X.C18070vi;
import X.C18090vk;
import X.C27831Xu;
import X.C72453Mb;
import X.C85324My;
import X.C97984qN;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.text.ReadMoreTextView;

public final class WDSBannerCompact extends LinearLayout {
    public ReadMoreTextView A00 = ((ReadMoreTextView) findViewById(2131428076));
    public WaImageView A01 = AnonymousClass3MW.A0S(this, 2131430060);
    public WaImageView A02 = AnonymousClass3MW.A0S(this, 2131428066);
    public C85324My A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSBannerCompact(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        C85324My r2 = AnonymousClass4AD.A00;
        this.A03 = r2;
        View.inflate(context, 2131627555, this);
        AnonymousClass3MY.A14(getResources(), this, 2131169545);
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A02;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            C18070vi.A0d(obtainStyledAttributes, 0);
            int i = obtainStyledAttributes.getInt(2, 0);
            if (i != 0 && i == 1) {
                r2 = AnonymousClass4AE.A00;
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                WaImageView waImageView = this.A02;
                if (waImageView != null) {
                    waImageView.setVisibility(0);
                }
                WaImageView waImageView2 = this.A02;
                if (waImageView2 != null) {
                    waImageView2.setImageDrawable(drawable);
                }
            }
            ReadMoreTextView readMoreTextView = this.A00;
            if (readMoreTextView != null) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    readMoreTextView.setText(resourceId);
                } else {
                    readMoreTextView.setText(obtainStyledAttributes.getText(1));
                }
                readMoreTextView.setLinesLimit(obtainStyledAttributes.getInt(3, 0));
                String string = obtainStyledAttributes.getString(4);
                if (string != null) {
                    readMoreTextView.A05 = string;
                }
            }
            obtainStyledAttributes.recycle();
        }
        setStyle(r2);
    }

    public final void setText(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            readMoreTextView.setText(charSequence);
        }
    }

    private final void setStyle(C85324My r5) {
        Drawable drawable;
        this.A03 = r5;
        setBackgroundColor(AnonymousClass1YH.A00((Resources.Theme) null, getResources(), r5.A00));
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            readMoreTextView.setTextColor(AnonymousClass1YH.A00((Resources.Theme) null, getResources(), r5.A01));
        }
        if (r5 instanceof AnonymousClass4AE) {
            C72453Mb.A1B(this.A01);
            if (readMoreTextView != null) {
                readMoreTextView.setGravity(17);
                return;
            }
            return;
        }
        WaImageView waImageView = this.A02;
        if (waImageView != null && (drawable = waImageView.getDrawable()) != null) {
            C27831Xu.A0C(drawable, AnonymousClass1YH.A00((Resources.Theme) null, AnonymousClass000.A0Y(this), 2131103152));
        }
    }

    public final TextPaint getTextPaint() {
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            return readMoreTextView.getPaint();
        }
        return null;
    }

    public final void setOnDismissListener(C18090vk r3) {
        WaImageView waImageView = this.A01;
        if (r3 == null) {
            if (waImageView != null) {
                waImageView.setOnClickListener((View.OnClickListener) null);
            }
        } else if (waImageView != null) {
            AnonymousClass3MZ.A1M(waImageView, r3, 11);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C97984qN r0;
        super.setOnClickListener(onClickListener);
        ReadMoreTextView readMoreTextView = this.A00;
        if (!(readMoreTextView == null || readMoreTextView.A00 == 0)) {
            if (onClickListener != null) {
                r0 = new C97984qN(onClickListener, this, 1);
            } else {
                r0 = null;
            }
            readMoreTextView.A03 = r0;
        }
        AnonymousClass3MZ.A1K(this, onClickListener, 14);
    }

    public static final void setOnDismissListener$lambda$5(C18090vk r0, View view) {
        r0.invoke();
    }

    public final void setOnDismissListener(View.OnClickListener onClickListener) {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setOnClickListener(onClickListener);
        }
    }

    public final void setText(int i) {
        ReadMoreTextView readMoreTextView = this.A00;
        if (readMoreTextView != null) {
            readMoreTextView.setText(i);
        }
    }
}
