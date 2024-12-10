package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* renamed from: X.4fV  reason: invalid class name and case insensitive filesystem */
public class C91324fV implements AnonymousClass1HE {
    public final int A00;
    public final Object A01;

    public C91324fV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r10) {
        int i;
        if (this.A00 != 0) {
            Fragment fragment = (Fragment) this.A01;
            ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(view);
            int i2 = r10.A07(7).A00;
            int i3 = A0B.leftMargin;
            int identifier = AnonymousClass3MZ.A09(fragment).getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = AnonymousClass3MZ.A09(fragment).getDimensionPixelSize(identifier);
            } else {
                i = 25;
            }
            A0B.setMargins(i3, i, A0B.rightMargin, i2);
            view.setLayoutParams(A0B);
            return r10;
        }
        AnonymousClass4aY.A0U(r10, (AnonymousClass4aY) this.A01);
        return AnonymousClass1HO.A01;
    }
}
