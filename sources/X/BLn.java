package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class BLn extends BMI {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BLn(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    public void A05(View view, C67 c67) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                BM9 bm9 = (BM9) this.A01;
                int[] A0A = bm9.A0A(view, bm9.A00.getLayoutManager());
                i2 = BE6.A0I(A0A);
                i = A0A[1];
                i3 = A09(Math.max(Math.abs(i2), Math.abs(i)));
                break;
            case 1:
                BM9 bm92 = (BM9) this.A01;
                RecyclerView recyclerView = bm92.A00;
                if (recyclerView != null) {
                    int[] A0A2 = bm92.A0A(view, recyclerView.getLayoutManager());
                    i2 = BE6.A0I(A0A2);
                    i = A0A2[1];
                    i3 = A09(Math.max(Math.abs(i2), Math.abs(i)));
                    break;
                } else {
                    return;
                }
            default:
                super.A05(view, c67);
                return;
        }
        int A03 = BE7.A03((double) i3, 0.3356d);
        if (A03 > 0) {
            DecelerateInterpolator decelerateInterpolator = this.A06;
            c67.A02 = i2;
            c67.A03 = i;
            c67.A01 = A03;
            c67.A05 = decelerateInterpolator;
            c67.A06 = true;
        }
    }

    public float A06(DisplayMetrics displayMetrics) {
        float f;
        int i = this.A00;
        float f2 = (float) displayMetrics.densityDpi;
        if (2 - i != 0) {
            f = 100.0f;
        } else {
            f = 150.0f;
        }
        return f / f2;
    }

    public int A09(int i) {
        if (this.A00 != 0) {
            return super.A09(i);
        }
        return Math.min(100, super.A09(i));
    }
}
