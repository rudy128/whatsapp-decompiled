package X;

import android.content.Context;

/* renamed from: X.C9o  reason: case insensitive filesystem */
public abstract class C24567C9o {
    public static final boolean A00(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) != 0) {
            return C108975cc.A1B(C108965cb.A03(context).getLayoutDirection());
        }
        return false;
    }
}
