package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: X.05R  reason: invalid class name */
public class AnonymousClass05R extends CheckedTextView implements C27761Xl {
    public C007003d A00;
    public final AnonymousClass03U A01;
    public final C03590Iw A02;
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

    public ColorStateList getSupportCheckMarkTintList() {
        C03590Iw r0 = this.A02;
        if (r0 != null) {
            return r0.A00;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C03590Iw r0 = this.A02;
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C03590Iw r1 = this.A02;
        if (r1 != null) {
            r1.A00 = colorStateList;
            r1.A02 = true;
            r1.A00();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C03590Iw r1 = this.A02;
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
    public AnonymousClass05R(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969039);
        context.getResources();
        context.getResources();
        AnonymousClass000.A1A(this);
        C007103e r0 = new C007103e(this);
        this.A03 = r0;
        r0.A0C(attributeSet, 2130969039);
        r0.A08();
        AnonymousClass03U r02 = new AnonymousClass03U(this);
        this.A01 = r02;
        r02.A06(attributeSet, 2130969039);
        C03590Iw r03 = new C03590Iw(this);
        this.A02 = r03;
        r03.A01(attributeSet);
        getEmojiTextViewHelper().A02(attributeSet, 2130969039);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C007103e r0 = this.A03;
        if (r0 != null) {
            r0.A08();
        }
        AnonymousClass03U r02 = this.A01;
        if (r02 != null) {
            r02.A01();
        }
        C03590Iw r03 = this.A02;
        if (r03 != null) {
            r03.A00();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C29261bv.A00(super.getCustomSelectionActionModeCallback());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0D8.A00(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
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

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C03590Iw r1 = this.A02;
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C29261bv.A01(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().A03(z);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C007103e r0 = this.A03;
        if (r0 != null) {
            r0.A09(context, i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AnonymousClass001.A0y(this, i));
    }
}
