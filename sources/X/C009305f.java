package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: X.05f  reason: invalid class name and case insensitive filesystem */
public class C009305f extends MultiAutoCompleteTextView implements C27761Xl {
    public static final int[] A03 = {16843126};
    public final AnonymousClass03U A00;
    public final AnonymousClass0KN A01;
    public final C007103e A02;

    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass03U r0 = this.A00;
        if (r0 != null) {
            return AnonymousClass000.A0X(r0.A00);
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass03U r0 = this.A00;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.A01.A03(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.A01.A00(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass03U r0 = this.A00;
        if (r0 != null) {
            r0.A04(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass03U r0 = this.A00;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C009305f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968710);
        context.getResources();
        context.getResources();
        AnonymousClass000.A1A(this);
        C002401c A002 = C002401c.A00(getContext(), attributeSet, A03, 2130968710, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setDropDownBackgroundDrawable(A002.A03(0));
        }
        typedArray.recycle();
        AnonymousClass03U r0 = new AnonymousClass03U(this);
        this.A00 = r0;
        r0.A06(attributeSet, 2130968710);
        C007103e r02 = new C007103e(this);
        this.A02 = r02;
        r02.A0C(attributeSet, 2130968710);
        r02.A08();
        AnonymousClass0KN r6 = new AnonymousClass0KN(this);
        this.A01 = r6;
        r6.A02(attributeSet, 2130968710);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener A003 = r6.A00(keyListener);
            if (A003 != keyListener) {
                super.setKeyListener(A003);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass03U r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        C007103e r02 = this.A02;
        if (r02 != null) {
            r02.A08();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AnonymousClass0D8.A00(this, editorInfo, onCreateInputConnection);
        return this.A01.A01(onCreateInputConnection);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass03U r0 = this.A00;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass03U r0 = this.A00;
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

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AnonymousClass001.A0y(this, i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C007103e r0 = this.A02;
        if (r0 != null) {
            r0.A09(context, i);
        }
    }
}
