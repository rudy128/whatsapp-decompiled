package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.6nW  reason: invalid class name */
public class AnonymousClass6nW {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public AnonymousClass86R A03;
    public Runnable A04;

    public void A00(View.OnClickListener onClickListener, String str, int i) {
        TextView A0J = AnonymousClass3MW.A0J(this.A00, 2131435367);
        this.A02 = A0J;
        A0J.setText(str);
        ImageView A0G = AnonymousClass3MW.A0G(this.A00, 2131435366);
        this.A01 = A0G;
        if (this instanceof C114735rt) {
            A0G.setImageResource(0);
        } else {
            AnonymousClass3MX.A1B(this.A00.getContext(), A0G, i);
        }
        C825248h.A00(this.A00, this, onClickListener, 3);
        AnonymousClass3MW.A1Q(this.A00);
    }
}
