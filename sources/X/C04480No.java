package X;

import android.view.ViewStructure;

/* renamed from: X.0No  reason: invalid class name and case insensitive filesystem */
public abstract class C04480No {
    public static final void A02(ViewStructure viewStructure, String str, int i) {
        viewStructure.setId(i, str, (String) null, (String) null);
    }

    public static final int A00(ViewStructure viewStructure, int i) {
        return viewStructure.addChildCount(i);
    }

    public static final ViewStructure A01(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }
}
