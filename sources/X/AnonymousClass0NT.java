package X;

import android.os.Build;
import android.view.ViewStructure;

/* renamed from: X.0NT  reason: invalid class name */
public class AnonymousClass0NT {
    public final Object A00;

    public static AnonymousClass0NT A00(ViewStructure viewStructure) {
        return new AnonymousClass0NT(viewStructure);
    }

    public ViewStructure A01() {
        return (ViewStructure) this.A00;
    }

    public void A02(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            C04840Pd.A00((ViewStructure) this.A00, f);
        }
    }

    public void A03(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 23) {
            C04840Pd.A01((ViewStructure) this.A00, i, i2, i3, i4);
        }
    }

    public void A04(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            C04840Pd.A02((ViewStructure) this.A00, charSequence);
        }
    }

    public void A05(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            C04840Pd.A03((ViewStructure) this.A00, charSequence);
        }
    }

    public void A06(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            C04840Pd.A04((ViewStructure) this.A00, str);
        }
    }

    public AnonymousClass0NT(ViewStructure viewStructure) {
        this.A00 = viewStructure;
    }
}
