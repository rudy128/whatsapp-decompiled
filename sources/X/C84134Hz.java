package X;

import android.view.View;
import android.widget.Button;

/* renamed from: X.4Hz  reason: invalid class name and case insensitive filesystem */
public abstract class C84134Hz {
    public static final void A00(Button button, C87004Tx r3, int i) {
        String str;
        C18070vi.A0d(button, 0);
        View.OnClickListener onClickListener = null;
        if (r3 != null) {
            str = r3.A01;
        } else {
            str = null;
        }
        button.setText(str);
        if (r3 != null) {
            i = 0;
        }
        button.setVisibility(i);
        if (r3 != null) {
            onClickListener = r3.A00;
        }
        button.setOnClickListener(onClickListener);
    }
}
