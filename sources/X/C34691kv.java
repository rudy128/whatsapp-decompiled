package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.1kv  reason: invalid class name and case insensitive filesystem */
public class C34691kv {
    public C223819r A00;
    public C27451Wd A01;

    public void A00(Fragment fragment, boolean z, boolean z2) {
        C27451Wd r1;
        int i;
        C223819r r2 = this.A00;
        if (r2 != null && z != z2) {
            if (z2) {
                r2.A02(fragment.getClass().getSimpleName(), "visible");
                r1 = this.A01;
                i = 1;
            } else {
                r1 = this.A01;
                i = 2;
            }
            r1.A00(fragment, i);
        }
    }

    public C34691kv(C223819r r1, C27451Wd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
