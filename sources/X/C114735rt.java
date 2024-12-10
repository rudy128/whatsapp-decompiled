package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.5rt  reason: invalid class name and case insensitive filesystem */
public class C114735rt extends AnonymousClass6nW {
    public TextView A00;

    public void A01(View.OnClickListener onClickListener, String str, String str2) {
        super.A00(onClickListener, str, 0);
        TextView A0J = AnonymousClass3MW.A0J(this.A00, 2131435365);
        this.A00 = A0J;
        A0J.setVisibility(0);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
        }
    }
}
