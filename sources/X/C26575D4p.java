package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.D4p  reason: case insensitive filesystem */
public class C26575D4p implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C26575D4p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        C18090vk r0;
        switch (this.A00) {
            case 0:
                if (!(view instanceof TextInputView)) {
                    return;
                }
                if (z) {
                    TextView textView = (TextView) view;
                    CTH cth = (CTH) this.A01;
                    C18070vi.A0d(textView, 0);
                    KeyListener keyListener = cth.A00;
                    if (keyListener == null) {
                        CUS cus = cth.A03;
                        if (cus != null) {
                            keyListener = cus.A0H;
                        } else {
                            throw C17880vN.A0g();
                        }
                    }
                    if (textView.getKeyListener() != keyListener || textView.getEllipsize() != null) {
                        textView.setKeyListener(keyListener);
                        textView.setEllipsize((TextUtils.TruncateAt) null);
                        textView.getExtendedPaddingTop();
                        textView.getViewTreeObserver().addOnPreDrawListener(new D5F(textView, 1));
                        return;
                    }
                    return;
                }
                TextInputView textInputView = (TextInputView) view;
                if (textInputView.getEllipsize() == null && C24674CEo.A00.A04(textInputView) && C26188CuE.A03(textInputView)) {
                    C26188CuE.A00(TextUtils.TruncateAt.END, (CTH) this.A01, textInputView);
                    return;
                }
                return;
            case 1:
                if (z) {
                    Object systemService = ((Context) this.A01).getSystemService("input_method");
                    C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 2:
                BTQ btq = (BTQ) this.A01;
                if (z) {
                    r0 = btq.A0J;
                } else {
                    r0 = btq.A0K;
                }
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            case 3:
                Bin bin = (Bin) this.A01;
                Bin.A00(bin, Bin.A01(bin));
                return;
            default:
                Bio bio = (Bio) this.A01;
                bio.A06 = z;
                bio.A02.A09(false);
                if (!z) {
                    Bio.A01(bio, false);
                    bio.A05 = false;
                    return;
                }
                return;
        }
    }
}
