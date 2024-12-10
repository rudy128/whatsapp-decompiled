package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.03w  reason: invalid class name and case insensitive filesystem */
public abstract class C008703w {
    public static boolean A00(Context context) {
        Set BQh = ((AnonymousClass00Y) AnonymousClass00E.A00(context, AnonymousClass00Y.class)).BQh();
        boolean z = false;
        if (BQh.size() <= 1) {
            z = true;
        }
        C008303s.A00("Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0], z);
        if (BQh.isEmpty()) {
            return true;
        }
        return ((Boolean) BQh.iterator().next()).booleanValue();
    }
}
