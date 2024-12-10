package X;

import android.os.Build;

/* renamed from: X.BrH  reason: case insensitive filesystem */
public class C23860BrH extends DP9 {
    public void Bd6() {
        if (Build.VERSION.SDK_INT >= 26) {
            C28472E2n e2n = this.A00;
            if (!C680231t.class.isInstance(e2n)) {
                e2n = null;
            }
            C680231t r1 = (C680231t) e2n;
            if (r1 != null) {
                if (!C18020vd.A05(C18040vf.A02, r1.A02, 12525)) {
                    return;
                }
                if (!BE9.A1U(C25463CgH.A04)) {
                    C17900vP.A0f("_disabled_", "RefQueuedWork is not supported", DP9.A01(this));
                    return;
                }
                new C25676Ck7(this).A01();
                C17890vO.A1A(DP9.A01(this), "_enabled");
            }
        }
    }

    public String getName() {
        return "SharedPrefsANRFixer";
    }
}
