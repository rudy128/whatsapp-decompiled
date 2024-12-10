package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.4eO  reason: invalid class name and case insensitive filesystem */
public class C90634eO implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C90634eO(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public boolean onPreDraw() {
        if (2 - this.A00 != 0) {
            View view = (View) this.A02;
            int height = view.getHeight();
            View view2 = (View) this.A03;
            view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom() + height);
            AnonymousClass3MX.A1G(view, this);
            return false;
        }
        View view3 = (View) this.A02;
        int width = view3.getWidth();
        if (width <= 0) {
            return true;
        }
        AnonymousClass3MX.A1G(view3, this);
        TextView textView = (TextView) this.A03;
        int compoundPaddingLeft = width - (textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight());
        String A18 = AnonymousClass3MZ.A18(textView);
        float textSize = textView.getTextSize();
        while (textSize > 1.0f && textView.getPaint().measureText(A18) >= ((float) compoundPaddingLeft)) {
            textSize -= 1.0f;
            textView.setTextSize(textSize);
        }
        return true;
    }
}
