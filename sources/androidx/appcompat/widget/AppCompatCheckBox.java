package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass03U;
import X.C007003d;
import X.C007103e;
import X.C03600Ix;
import X.C27761Xl;
import X.E8Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

public class AppCompatCheckBox extends CheckBox implements E8Q, C27761Xl {
    public C007003d A00;
    public final AnonymousClass03U A01;
    public final C03600Ix A02;
    public final C007103e A03;

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

    public ColorStateList getSupportButtonTintList() {
        C03600Ix r0 = this.A02;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C03600Ix r0 = this.A02;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return AnonymousClass000.A0X(this.A03.A07);
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return AnonymousClass000.A0Z(this.A03.A07);
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C03600Ix r1 = this.A02;
        if (r1 != null) {
            r1.A00 = colorStateList;
            r1.A02 = true;
            r1.A00();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C03600Ix r1 = this.A02;
        if (r1 != null) {
            r1.A01 = mode;
            r1.A03 = true;
            r1.A00();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C007103e r0 = this.A03;
        r0.A0A(colorStateList);
        r0.A08();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C007103e r0 = this.A03;
        r0.A0B(mode);
        r0.A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass000.A1A(this);
        C03600Ix r0 = new C03600Ix(this);
        this.A02 = r0;
        r0.A01(attributeSet, i);
        AnonymousClass03U r02 = new AnonymousClass03U(this);
        this.A01 = r02;
        r02.A06(attributeSet, i);
        C007103e r03 = new C007103e(this);
        this.A03 = r03;
        r03.A0C(attributeSet, i);
        getEmojiTextViewHelper().A02(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        C007103e r02 = this.A03;
        if (r02 != null) {
            r02.A08();
        }
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
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

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C03600Ix r1 = this.A02;
        if (r1 == null) {
            return;
        }
        if (r1.A04) {
            r1.A04 = false;
            return;
        }
        r1.A04 = true;
        r1.A00();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A03;
        if (r0 != null) {
            r0.A08();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C007103e r0 = this.A03;
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

    public AppCompatCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(AnonymousClass001.A0y(this, i));
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969028);
    }
}
