package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: X.05l  reason: invalid class name and case insensitive filesystem */
public class C009505l extends ToggleButton implements C27761Xl {
    public C007003d A00;
    public final AnonymousClass03U A01;
    public final C007103e A02;

    private C007003d getEmojiTextViewHelper() {
        C007003d r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C007003d r02 = new C007003d(this);
        this.A00 = r02;
        return r02;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            return AnonymousClass000.A0X(r0.A00);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            return AnonymousClass000.A0Z(r0.A00);
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return AnonymousClass000.A0X(this.A02.A07);
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return AnonymousClass000.A0Z(this.A02.A07);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A04(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A05(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C007103e r0 = this.A02;
        r0.A0A(colorStateList);
        r0.A08();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C007103e r0 = this.A02;
        r0.A0B(mode);
        r0.A08();
    }

    public C009505l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        AnonymousClass000.A1A(this);
        AnonymousClass03U r0 = new AnonymousClass03U(this);
        this.A01 = r0;
        r0.A06(attributeSet, 16842827);
        C007103e r02 = new C007103e(this);
        this.A02 = r02;
        r02.A0C(attributeSet, 16842827);
        getEmojiTextViewHelper().A02(attributeSet, 16842827);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        C007103e r02 = this.A02;
        if (r02 != null) {
            r02.A08();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A03(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A03(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A04(inputFilterArr));
    }
}
