package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.Cez  reason: case insensitive filesystem */
public abstract class C25398Cez {
    public static final C25122CYv A00 = new C25122CYv("GoogleSignInCommon", new String[0]);

    public static void A00(Context context) {
        C25666Cjw.A00(context).A01();
        Set<C25260Cbz> set = C25260Cbz.A00;
        synchronized (set) {
        }
        for (C25260Cbz cbz : set) {
            if (cbz instanceof BZB) {
                EA7 ea7 = ((BZB) cbz).A01;
                if (ea7 != null) {
                    ea7.CSv();
                }
            } else {
                throw C17880vN.A0y();
            }
        }
        C26377Cyd.A03();
    }
}
