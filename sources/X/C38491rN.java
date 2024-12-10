package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.1rN  reason: invalid class name and case insensitive filesystem */
public class C38491rN extends ViewGroup.MarginLayoutParams {
    public C42011xT A00;
    public boolean A01 = true;
    public boolean A02 = false;
    public final Rect A03 = new Rect();

    public int A00() {
        C42011xT r2 = this.A00;
        int i = r2.A05;
        if (i == -1) {
            return r2.A04;
        }
        return i;
    }

    public C38491rN(C38491rN r2) {
        super(r2);
    }

    public C38491rN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C38491rN(int i, int i2) {
        super(i, i2);
    }

    public C38491rN(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C38491rN(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
