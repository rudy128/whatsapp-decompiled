package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.6C0  reason: invalid class name */
public class AnonymousClass6C0 extends AnonymousClass8IR {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;

    public void A0B(C183409Yd r8) {
        Object obj;
        View view;
        AnonymousClass6C9 r82 = (AnonymousClass6C9) r8;
        byte[] bArr = r82.A09;
        if (bArr != null) {
            this.A01.setImageBitmap(AnonymousClass204.A0C(new AnonymousClass25O(2131168223, 2131168223), bArr).A02);
        }
        TextView textView = this.A04;
        C1418477e r0 = r82.A03;
        if (r0 != null) {
            obj = r0.A00;
        } else {
            obj = null;
        }
        textView.setText((CharSequence) obj);
        String str = r82.A04;
        if (str != null) {
            this.A03.setText(str);
        }
        TextView textView2 = this.A03;
        int i = 0;
        if (r82.A04 == null) {
            i = 8;
        }
        textView2.setVisibility(i);
        if (r82.A08) {
            LinearLayout linearLayout = this.A02;
            linearLayout.setVisibility(0);
            ImageView A0G = AnonymousClass3MW.A0G(linearLayout, 2131437012);
            TextView A0J = AnonymousClass3MW.A0J(linearLayout, 2131437013);
            AnonymousClass4aX.A0B(C108945cZ.A0D(this), A0G, r82.A00, r82.A01);
            A0J.setText(r82.A06);
            if (r82.A07) {
                Button button = this.A00;
                button.setVisibility(0);
                button.setText(r82.A05);
                button.setOnClickListener(r82.A02);
                return;
            }
            view = this.A00;
        } else {
            view = this.A02;
        }
        view.setVisibility(8);
    }
}
