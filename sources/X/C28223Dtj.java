package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.widget.TextView;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dtj  reason: case insensitive filesystem */
public final class C28223Dtj extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28223Dtj(CTH cth, BTQ btq) {
        super(2);
        this.$controller = cth;
        this.$model = btq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Drawable drawable;
        TextInputView textInputView = (TextInputView) obj2;
        C18070vi.A0d(textInputView, 1);
        CTH cth = this.$controller;
        if (Build.VERSION.SDK_INT >= 29) {
            drawable = textInputView.getTextCursorDrawable();
        } else {
            drawable = null;
        }
        float A00 = A00(textInputView);
        boolean A02 = A02(textInputView);
        int A01 = A01(textInputView);
        Editable text = textInputView.getText();
        float textSize = textInputView.getTextSize();
        ColorStateList textColors = textInputView.getTextColors();
        CharSequence hint = textInputView.getHint();
        ColorStateList hintTextColors = textInputView.getHintTextColors();
        int gravity = textInputView.getGravity();
        Rect rect = new Rect(textInputView.getPaddingLeft(), textInputView.getPaddingTop(), textInputView.getPaddingRight(), textInputView.getPaddingBottom());
        BTN btn = new BTN(textInputView.getShadowDx(), textInputView.getShadowDy(), textInputView.getShadowRadius(), textInputView.getShadowColor());
        float lineSpacingExtra = textInputView.getLineSpacingExtra();
        float lineSpacingMultiplier = textInputView.getLineSpacingMultiplier();
        Drawable background = textInputView.getBackground();
        int imeOptions = textInputView.getImeOptions();
        int inputType = textInputView.getInputType();
        KeyListener keyListener = textInputView.getKeyListener();
        boolean A002 = textInputView.A00();
        cth.A03 = new CUS(textColors, hintTextColors, rect, textInputView.getTypeface(), drawable, background, text, textInputView.getEllipsize(), keyListener, btn, hint, textSize, lineSpacingExtra, lineSpacingMultiplier, A00, A01, gravity, imeOptions, inputType, textInputView.getMaxLines(), A002, A02);
        CTH cth2 = this.$controller;
        cth2.A02 = textInputView;
        CharSequence charSequence = cth2.A05;
        if (charSequence == null) {
            charSequence = this.$model.A09;
        }
        textInputView.setText(charSequence);
        C26574D4o d4o = new C26574D4o();
        CTH cth3 = this.$controller;
        C18070vi.A0d(cth3, 0);
        C26575D4p d4p = new C26575D4p(cth3, 0);
        d4o.A00.add(d4p);
        textInputView.setOnFocusChangeListener(d4o);
        textInputView.addTextChangedListener(this.$controller.A01);
        return new AnonymousClass0I3(new C27918Dnt(d4p, this.$controller, d4o, textInputView));
    }

    public static final float A00(TextView textView) {
        return textView.getLetterSpacing();
    }

    public static final int A01(TextView textView) {
        return textView.getHighlightColor();
    }

    public static final boolean A02(TextView textView) {
        return textView.getShowSoftInputOnFocus();
    }
}
