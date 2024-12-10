package X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.2nm  reason: invalid class name and case insensitive filesystem */
public abstract class C60302nm {
    public static /* synthetic */ File A00(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Private/");
        File A0e = C17880vN.A0e(externalFilesDir, AnonymousClass000.A0y(str.trim(), A10));
        if (!A0e.exists()) {
            A0e.mkdirs();
        }
        C218617r.A06(A0e);
        A0e.getAbsolutePath();
        return A0e;
    }

    public static /* synthetic */ void A01(C56272hC r1, Set set) {
        set.add(r1.A0G);
        set.add(r1.A0E);
        set.add(r1.A0D);
        set.add(r1.A0H);
        set.add(r1.A0F);
        set.add(r1.A05);
        set.add(r1.A02);
        set.add(r1.A06);
    }
}
