package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: X.03n  reason: invalid class name and case insensitive filesystem */
public class C007803n extends Button implements C27751Xk, C27761Xl {
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

    public int getAutoSizeMaxTextSize() {
        if (C002801g.A01) {
            return super.getAutoSizeMaxTextSize();
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            return Math.round(r0.A0C.A00);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C002801g.A01) {
            return super.getAutoSizeMinTextSize();
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            return Math.round(r0.A0C.A01);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C002801g.A01) {
            return super.getAutoSizeStepGranularity();
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            return Math.round(r0.A0C.A02);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C002801g.A01) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            return r0.A0C.A06;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C002801g.A01) {
            C007103e r0 = this.A02;
            if (r0 != null) {
                return r0.A0C.A03;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C007903o r0;
        AnonymousClass03U r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A00;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C007903o r0;
        AnonymousClass03U r02 = this.A01;
        if (r02 == null || (r0 = r02.A00) == null) {
            return null;
        }
        return r0.A01;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C007903o r0 = this.A02.A07;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C007903o r0 = this.A02.A07;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C002801g.A01) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A0C.A0C(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C002801g.A01) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A0C.A0E(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C002801g.A01) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A0C.A0A(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A0B.setAllCaps(z);
        }
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

    public void setTextSize(int i, float f) {
        if (C002801g.A01) {
            super.setTextSize(i, f);
            return;
        }
        C007103e r0 = this.A02;
        if (r0 != null) {
            AnonymousClass03f r1 = r0.A0C;
            if (!r1.A0F()) {
                r1.A0B(i, f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C007803n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getResources();
        context.getResources();
        AnonymousClass03T.A04(getContext(), this);
        AnonymousClass03U r0 = new AnonymousClass03U(this);
        this.A01 = r0;
        r0.A06(attributeSet, i);
        C007103e r02 = new C007103e(this);
        this.A02 = r02;
        r02.A0C(attributeSet, i);
        r02.A08();
        getEmojiTextViewHelper().A02(attributeSet, i);
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

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C29261bv.A00(super.getCustomSelectionActionModeCallback());
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C007103e r1 = this.A02;
        if (r1 != null && !C002801g.A01) {
            r1.A0C.A09();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C007103e r1 = this.A02;
        if (r1 != null && !C002801g.A01) {
            AnonymousClass03f r12 = r1.A0C;
            if (r12.A0F()) {
                r12.A09();
            }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C29261bv.A01(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A03(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().A04(inputFilterArr));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A09(context, i);
        }
    }

    public C007803n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968921);
    }
}
