package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* renamed from: X.6WQ  reason: invalid class name */
public abstract class AnonymousClass6WQ {
    public static final void A00(View view, Fragment fragment, C18090vk r11) {
        TextView A0E = C17880vN.A0E(view, 2131431054);
        if (A0E != null) {
            String A0n = AnonymousClass3MY.A0n(fragment, 2131890621);
            String A0n2 = AnonymousClass3MY.A0n(fragment, 2131890620);
            String A16 = AnonymousClass3MX.A16(fragment, A0n2, AnonymousClass3MX.A1b(A0n, 0), 1, 2131890618);
            C18070vi.A0X(A16);
            int A0F = AnonymousClass1YF.A0F(A16, A0n, 0, false);
            int A0F2 = AnonymousClass1YF.A0F(A16, A0n2, 0, false);
            SpannableStringBuilder A09 = AnonymousClass3MW.A09(A16);
            A09.setSpan(new StyleSpan(1), A0F, A0n.length() + A0F, 33);
            A09.setSpan(new StyleSpan(1), A0F2, A0n2.length() + A0F2, 33);
            A0E.setText(A09);
            A0E.requestLayout();
            View findViewById = view.findViewById(2131431053);
            if (findViewById != null) {
                C90014dO.A00(findViewById, r11, fragment, 35);
            }
        }
    }
}
