package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.2nd  reason: invalid class name and case insensitive filesystem */
public abstract class C60242nd {
    public static final View A00(ViewGroup viewGroup) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Index: ");
        A10.append(0);
        A10.append(", Size: ");
        throw new IndexOutOfBoundsException(C17880vN.A0t(A10, viewGroup.getChildCount()));
    }

    public static final C99434so A01(ViewGroup viewGroup) {
        return new C99434so(viewGroup, 1);
    }
}
