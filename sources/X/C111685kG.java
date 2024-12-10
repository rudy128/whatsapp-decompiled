package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.5kG  reason: invalid class name and case insensitive filesystem */
public class C111685kG extends BMI {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111685kG(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    public float A06(DisplayMetrics displayMetrics) {
        float f;
        float applyDimension;
        switch (this.A00) {
            case 0:
                applyDimension = (float) displayMetrics.densityDpi;
                f = 100.0f;
                break;
            case 2:
            case 3:
            case 4:
                f = 40.0f;
                applyDimension = TypedValue.applyDimension(1, 40.0f, displayMetrics);
                break;
            default:
                applyDimension = (float) displayMetrics.densityDpi;
                f = 25.0f;
                break;
        }
        return f / applyDimension;
    }

    public int A07() {
        if (2 - this.A00 != 0) {
            return super.A07();
        }
        return -1;
    }

    public int A08() {
        if (1 - this.A00 != 0) {
            return super.A08();
        }
        return -1;
    }
}
