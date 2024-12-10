package X;

import android.content.Context;
import android.content.res.Resources;
import java.util.Iterator;

/* renamed from: X.4Go  reason: invalid class name and case insensitive filesystem */
public abstract class C83764Go {
    public static String A00(Context context, AnonymousClass4OX r6) {
        Iterator A15 = AnonymousClass000.A15(r6.A02);
        int i = 0;
        int i2 = 0;
        while (A15.hasNext()) {
            int A0M = AnonymousClass000.A0M(C17890vO.A0P(A15));
            if (A0M == 419 || A0M == 412) {
                i++;
            } else if (A0M == 417) {
                i2++;
            }
        }
        if (i > 0) {
            Resources resources = context.getResources();
            int i3 = 2131755143;
            if (i2 > 0) {
                i3 = 2131755144;
                i += i2;
            }
            return C72473Md.A0k(resources, i, i3);
        } else if (i2 > 0) {
            return C72473Md.A0k(context.getResources(), i2, 2131755012);
        } else {
            return null;
        }
    }
}
