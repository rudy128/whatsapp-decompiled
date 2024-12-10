package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import android.widget.TextView;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.Dnt  reason: case insensitive filesystem */
public final class C27918Dnt extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ View.OnFocusChangeListener $ellipsizeFocusChangeListener;
    public final /* synthetic */ C26574D4o $multiplexingFocusChangeListener;
    public final /* synthetic */ TextInputView $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27918Dnt(View.OnFocusChangeListener onFocusChangeListener, CTH cth, C26574D4o d4o, TextInputView textInputView) {
        super(0);
        this.$controller = cth;
        this.$view = textInputView;
        this.$multiplexingFocusChangeListener = d4o;
        this.$ellipsizeFocusChangeListener = onFocusChangeListener;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.$controller.A05 = this.$view.getText();
        this.$controller.A02 = null;
        C26574D4o d4o = this.$multiplexingFocusChangeListener;
        View.OnFocusChangeListener onFocusChangeListener = this.$ellipsizeFocusChangeListener;
        C18070vi.A0d(onFocusChangeListener, 0);
        d4o.A00.remove(onFocusChangeListener);
        this.$view.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.$view.removeTextChangedListener(this.$controller.A01);
        CUS cus = this.$controller.A03;
        if (cus != null) {
            TextInputView textInputView = this.$view;
            C18070vi.A0d(textInputView, 0);
            Editable text = textInputView.getText();
            Editable editable = cus.A0F;
            if (!C18070vi.A18(text, editable)) {
                textInputView.setText(editable);
            }
            float textSize = textInputView.getTextSize();
            float f = cus.A03;
            if (textSize != f) {
                textInputView.setTextSize(f);
            }
            ColorStateList textColors = textInputView.getTextColors();
            ColorStateList colorStateList = cus.A0A;
            if (textColors != colorStateList) {
                textInputView.setTextColor(colorStateList);
            }
            CharSequence hint = textInputView.getHint();
            CharSequence charSequence = cus.A0J;
            if (!C18070vi.A18(hint, charSequence)) {
                textInputView.setHint(charSequence);
            }
            ColorStateList hintTextColors = textInputView.getHintTextColors();
            ColorStateList colorStateList2 = cus.A09;
            if (hintTextColors != colorStateList2) {
                textInputView.setHintTextColor(colorStateList2);
            }
            A00(textInputView, cus.A05);
            int gravity = textInputView.getGravity();
            int i = cus.A04;
            if (gravity != i) {
                textInputView.setGravity(i);
            }
            Rect rect = cus.A0B;
            textInputView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            BTN btn = cus.A0I;
            textInputView.setShadowLayer(btn.A02, btn.A00, btn.A01, btn.A03);
            textInputView.setLineSpacing(cus.A01, cus.A02);
            if (C26188CuE.A01()) {
                C24561C9h.A00(cus.A0E, textInputView);
            }
            Drawable background = textInputView.getBackground();
            Drawable drawable = cus.A0D;
            if (background != drawable) {
                textInputView.setBackground(drawable);
            }
            int imeOptions = textInputView.getImeOptions();
            int i2 = cus.A06;
            if (imeOptions != i2) {
                textInputView.setImeOptions(i2);
            }
            int inputType = textInputView.getInputType();
            int i3 = cus.A07;
            if (inputType != i3) {
                textInputView.setInputType(i3);
            }
            textInputView.setSingleLine(cus.A0K);
            int maxLines = textInputView.getMaxLines();
            int i4 = cus.A08;
            if (maxLines != i4) {
                textInputView.setMaxLines(i4);
            }
            KeyListener keyListener = textInputView.getKeyListener();
            KeyListener keyListener2 = cus.A0H;
            if (keyListener != keyListener2) {
                textInputView.setKeyListener(keyListener2);
            }
            textInputView.setEnabled(true);
            Typeface typeface = textInputView.getTypeface();
            Typeface typeface2 = cus.A0C;
            if (!C18070vi.A18(typeface, typeface2)) {
                textInputView.setTypeface(typeface2);
            }
            textInputView.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            TextUtils.TruncateAt ellipsize = textInputView.getEllipsize();
            TextUtils.TruncateAt truncateAt = cus.A0G;
            if (ellipsize != truncateAt) {
                textInputView.setEllipsize(truncateAt);
            }
            C25319CdP.A00(textInputView, cus.A00);
            C25319CdP.A01(textInputView, cus.A0L);
            return C27621Wu.A00;
        }
        throw C17880vN.A0g();
    }

    public static final void A00(TextView textView, int i) {
        if (textView.getHighlightColor() != i) {
            textView.setHighlightColor(i);
        }
    }
}
