package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

public class BJA extends AnonymousClass03P {
    public static void A0F(Resources.Theme theme, BJA bja, int i) {
        int A00;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C27781Xn.A0U);
        Context context = bja.getContext();
        int[] A1W = C108945cZ.A1W();
        int i2 = 0;
        A1W[0] = 1;
        A1W[1] = 2;
        do {
            A00 = AnonymousClass1YT.A00(context, obtainStyledAttributes, A1W[i2], -1);
            i2++;
            if (i2 >= 2) {
                break;
            }
        } while (A00 < 0);
        obtainStyledAttributes.recycle();
        if (A00 >= 0) {
            bja.setLineHeight(A00);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AnonymousClass1Z9.A03(context, 2130971524, true)) {
            A0F(context.getTheme(), this, i);
        }
    }
}
