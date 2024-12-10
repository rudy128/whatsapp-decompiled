package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;

/* renamed from: X.8d8  reason: invalid class name and case insensitive filesystem */
public class C166578d8 extends C90704eV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C166578d8(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = str;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A00 != 0) {
            TextView textView = (TextView) this.A02;
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = -2;
            textView.setLayoutParams(layoutParams);
            textView.setText(this.A03);
            textView.clearAnimation();
            ((C75433hU) ((C21472Akd) this.A01).A03).A0N = true;
            return;
        }
        TextView textView2 = (TextView) this.A01;
        ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
        layoutParams2.width = -2;
        textView2.setLayoutParams(layoutParams2);
        textView2.clearAnimation();
        Object text = textView2.getText();
        if (text == null) {
            text = "";
        }
        if (C18070vi.A18(text.toString(), this.A02.toString())) {
            textView2.setText(AnonymousClass1YF.A0I(this.A03));
        }
    }
}
