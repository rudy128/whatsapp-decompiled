package X;

import android.content.Context;

public abstract class CC8 {
    public static final boolean A00(Context context) {
        if ((context.getApplicationContext().getApplicationInfo().flags & 4194304) != 0) {
            return C108975cc.A1B(C108965cb.A03(context).getLayoutDirection());
        }
        return false;
    }
}
