package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.CuE  reason: case insensitive filesystem */
public final class C26188CuE {
    public static final void A00(TextUtils.TruncateAt truncateAt, CTH cth, TextInputView textInputView) {
        C18070vi.A0d(cth, 2);
        if (textInputView.getEllipsize() != truncateAt) {
            KeyListener keyListener = textInputView.getKeyListener();
            if (keyListener == null) {
                CUS cus = cth.A03;
                if (cus != null) {
                    keyListener = cus.A0H;
                } else {
                    throw C17880vN.A0g();
                }
            }
            cth.A00 = keyListener;
            textInputView.setKeyListener((KeyListener) null);
            textInputView.setEllipsize(truncateAt);
        }
    }

    public static final boolean A02(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145;
    }

    public static final boolean A03(TextInputView textInputView) {
        Editable text = textInputView.getText();
        if (text == null) {
            return false;
        }
        Rect A07 = AnonymousClass3MW.A07();
        textInputView.getPaint().getTextBounds(text.toString(), 0, text.length(), A07);
        if (A07.width() > C72473Md.A07(textInputView, textInputView.getWidth())) {
            return true;
        }
        return false;
    }

    public static final boolean A01() {
        return C108975cc.A1C(Build.VERSION.SDK_INT, 29);
    }

    public final boolean A04(TextInputView textInputView) {
        Editable text = textInputView.getText();
        if (text == null || text.length() == 0 || textInputView.getWidth() == 0 || textInputView.getLineCount() > 1 || (textInputView.getInputType() & 131087) == 131073 || A02(textInputView.getInputType())) {
            return false;
        }
        return true;
    }
}
