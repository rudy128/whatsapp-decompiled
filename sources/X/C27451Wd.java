package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.1Wd  reason: invalid class name and case insensitive filesystem */
public class C27451Wd {
    public final AnonymousClass18K A00;
    public final C27441Wc A01;
    public final AnonymousClass10I A02;

    public void A00(Fragment fragment, int i) {
        C18180vt r3;
        Fragment fragment2 = fragment;
        if (fragment instanceof AnonymousClass1ZK) {
            r3 = ((AnonymousClass1ZK) fragment2).BYS();
        } else {
            r3 = C19620yd.A02;
        }
        AnonymousClass1Be BDn = this.A00.BDn(new C30711eO(), new C18180vt(20, r3.A00 * 2, r3.A01 * 2, r3.A03 * 2, false));
        if (BDn.A00 != null) {
            this.A02.CGN(new C146607Px(this, fragment2, BDn, i, 0));
        }
    }

    public C27451Wd(AnonymousClass18K r1, C27441Wc r2, AnonymousClass10I r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
